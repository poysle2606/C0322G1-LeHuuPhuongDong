package home_work2.services.class_servies;

import java.util.Scanner;

public class AllMethodSchool {
    static Scanner input = new Scanner(System.in);
    static StudentServices student = new StudentServices();
    static TeacherServices teacher = new TeacherServices();

    public static void displayPerson() {
        do {
            System.out.println("Hiển thị danh sách của: \n" +
                    "1.Học sinh. \n" +
                    "2.Giáo viên. \n" +
                    "3.Cả học sinh và giáo viên. \n" +
                    "4.Quay lại. \n" +
                    "Chọn chức năng.");

            String choose = input.nextLine();
            switch (choose) {
                case "1":
                    student.display();
                    break;
                case "2":
                    teacher.display();
                    break;
                case "3":
                    student.display();
                    teacher.display();
                    break;
                case "4":
                    return;
                default:
                    System.err.println("Chọn chức năng không đúng");
            }
        } while (true);
    }

    public static void addPerson() {
        do {
            System.out.println("Bạn muốn thêm vào danh sách của: \n" +
                    "1.Học sinh. \n" +
                    "2.Giáo viên. \n" +
                    "3.Trở lại. \n" +
                    "Chọn chức năng.");
            try {
                int choose = Integer.parseInt(input.nextLine());

                switch (choose) {
                    case 1:
                        student.add();
                        break;
                    case 2:
                        teacher.add();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Bạn chọn không đúng chức năng.");
                }
            } catch (NumberFormatException e) {

                e.printStackTrace();

                System.err.println("Chức năng không đươc nhập chữ.!");
            }
        } while (true);
    }

    public static void deletePerson() {
        do {
            System.out.println("Bạn muốn xóa khỏi danh sách của: \n" +
                    "1.Học sinh. \n" +
                    "2.Giáo viên. \n" +
                    "3.Trở lại. \n" +
                    "Chọn chức năng.");
            try {
                int choose = Integer.parseInt(input.nextLine());

                switch (choose) {
                    case 1:
                        student.delete();
                        break;
                    case 2:
                        teacher.delete();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Bạn chọn không đúng chức năng.");
                }
            } catch (NumberFormatException e) {

                e.printStackTrace();

                System.err.println("Chức năng không đươc nhập chữ.!");
            }
        } while (true);
    }

    public static void updatePerson() {
        do {
            System.out.println("Bạn sửa trong danh sách của: \n" +
                    "1.Học sinh. \n" +
                    "2.Giáo viên. \n" +
                    "3.Trở lại. \n" +
                    "Chọn chức năng.");
            try {
                int choose = Integer.parseInt(input.nextLine());

                switch (choose) {
                    case 1:
                        student.update();
                        break;
                    case 2:
                        teacher.update();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Bạn chọn không đúng chức năng.");
                }
            } catch (NumberFormatException e) {

                e.printStackTrace();

                System.err.println("Chức năng không đươc nhập chữ.!");
            }
        } while (true);
    }

    public static void sortPerson() {
        do {
            System.out.println("Danh sách bạn muốn sắp xếp: \n" +
                    "1.Học sinh. \n" +
                    "2.Giáo viên. \n" +
                    "3.Trở lại. \n" +
                    "Chọn chức năng.");
            try {
                int choose = Integer.parseInt(input.nextLine());

                switch (choose) {
                    case 1:
                        student.soft();
                        break;
                    case 2:
                        teacher.soft();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Bạn chọn không đúng chức năng.");
                }
            } catch (NumberFormatException e) {

                e.printStackTrace();

                System.err.println("Chức năng không đươc nhập chữ.!");
            }
        } while (true);
    }

    public static String getGender() {
        do {
            System.out.println("Enter your gender: \n" +
                    "1. Men. \n" +
                    "2. Woman. \n" +
                    "3. LGBT.");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    return "Men";
                case 2:
                    return "Woman";
                case 3:
                    return "LGBT";
                default:
                    System.out.println("If you entered it wrong, please re-enter it.");
            }

        } while (true);
    }

}
