package home_work2.services.class_servies;

import home_work2.models.TeacherOfSchool;
import home_work2.services.impl_services.Services;
import home_work2.utils.RegexOfSchool;
import home_work2.utils.SoftBirthDay;
import home_work2.utils.SoftName;
import quan_ly_du_an.files_data.ReadAndWrite;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TeacherServices implements Services {
    static Scanner input = new Scanner(System.in);

    public static final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    static final String LINK_TEACHER = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\home_work2\\files\\teacher.csv";

    List<TeacherOfSchool> teacherList = new LinkedList<>();

    static List<String[]> list;

    @Override
    public void display() {
        readFileTeacher();

        if (teacherList.isEmpty()) {
            System.err.println("Danh sách rỗng cần thêm mới để hiển thị.");
        }

        for (TeacherOfSchool list : teacherList) {
            System.out.println(list);
        }

    }

    @Override
    public void add() {
        readFileTeacher();

        System.out.println("Id sẽ tự động cập nhật:");

        int max = 0;

        int id;

        if (teacherList.isEmpty()) {
            id = 1;
        } else {
            for (TeacherOfSchool item1 : teacherList) {
                if (item1.getId() > max) {
                    max = item1.getId();
                }
            }
            id = max + 1;
        }

        System.out.println("Tên giáo viên: ");
        String name = nameFormat();

        System.out.println("Giới tính của giáo viên: ");
        String gender = AllMethodSchool.getGender();

        System.out.println("Ngày sinh của giáo viên: ");
        String birthDay = RegexOfSchool.regexAge1(input.nextLine(), REGEX_BIRTHDAY);

        System.out.println("Địa chỉ của giáo viên: ");
        String address = addressFormat();

        System.out.println("Lớp dạy: ");
        String classroom = input.nextLine();

        System.out.println("Lương dạy 1 giờ = ");
        double salary = Double.parseDouble(input.nextLine());

        System.out.println("Số giờ dạy trong tháng: ");
        int hours = Integer.parseInt(input.nextLine());

        TeacherOfSchool teacher = new TeacherOfSchool(id, name, gender, birthDay, address, classroom, salary, hours);
        teacherList.add(teacher);

        String line = "";
        for (TeacherOfSchool person : teacherList) {
            line += person.inForOfSchool() + "\n";
        }
        ReadAndWrite.writeFile(LINK_TEACHER, line);
        System.out.println("Thêm mới giáo viên thành công.");
    }

    @Override
    public void delete() {
        readFileTeacher();

        System.out.println("Bạn cần biết ID của học sinh để xóa: \n" +
                "1.Tôi đã biết. \n" +
                "2.Cho tôi xem lại. \n" +
                "3.Quay lại. \n" +
                "Chọn chức năng.");
        try {

            int choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Nhập ID học sinh tai đây.");

                    int idPerson = Integer.parseInt(input.nextLine());

                    boolean flag = false;

                    for (int i = 0; i < teacherList.size(); i++) {
                        if (teacherList.get(i).getId() == idPerson) {
                            System.out.println("Bạn có muốn xóa giáo viên này không: \n" +
                                    "1.Chắc chắn xóa. \n" +
                                    "2.Không. \n" +
                                    "Chọn chức năng.");

                            int choose1 = Integer.parseInt(input.nextLine());

                            switch (choose1) {
                                case 1:
                                    teacherList.remove(teacherList.get(i));

                                    System.out.println("Xóa giáo viên này thành công");

                                    ReadAndWrite.writeFileRemove(LINK_TEACHER);

                                    String line = "";

                                    for (TeacherOfSchool student : teacherList) {
                                        line += student.inForOfSchool() + "\n";
                                    }

                                    ReadAndWrite.writeFile(LINK_TEACHER, line);

                                    flag = true;
                                    break;
                                case 2:
                                    return;
                                default:
                                    System.err.println("Không có chức năng này.");
                            }

                        }
                    }
                    if (!flag) {
                        System.out.println("Mã nhân viên này không có.");
                    }
                    break;
                case 2:
                    for (int i = 0; i < teacherList.size(); i++) {
                        int code = teacherList.get(i).getId();

                        System.out.println(code);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.err.println("Không có chức năng này.");
            }

        } catch (NumberFormatException e) {
            System.err.println("Bạn nhập sai định dạng.");
        }

    }

    @Override
    public void soft() {
       readFileTeacher();

            System.out.println("Sắp xếp theo: \n" +
                    "1.Theo tên. \n" +
                    "2.Theo ngày sinh. \n" +
                    "3.Quay lại. \n" +
                    "Chọn chức năng.");

            String choose = input.nextLine();

            switch (choose) {
                case "1":
                    SoftName name = new SoftName();
                    Collections.sort(teacherList,name);
                    for(TeacherOfSchool item : teacherList) {
                        System.out.println(item);
                    }
                    break;
                case "2":
                    SoftBirthDay softBirthDay = new SoftBirthDay();
                    Collections.sort(teacherList,softBirthDay);
                    for(TeacherOfSchool item : teacherList) {
                        System.out.println(item);
                    }
                    break;
                case "3":
                    return;
                default:
                    System.err.println("Chức năng không có.");
            }

    }

    @Override
    public void update() {
        readFileTeacher();

        System.out.println("Nhập ID của giáo viên mà bạn muốn chỉnh sửa: ");

        int id = Integer.parseInt(input.nextLine());

        TeacherOfSchool teacher = new TeacherOfSchool();

        for (int i = 0; i < teacherList.size(); i++) {
            if (id == teacherList.get(i).getId()) {

                teacherList.set(i, teacher);

                System.out.println("Tên giáo viên: ");
                String name = nameFormat();

                System.out.println("Giới tính của giáo viên: ");
                String gender = AllMethodSchool.getGender();

                System.out.println("Ngày sinh của giáo viên: ");
                String birthDay = RegexOfSchool.regexAge1(input.nextLine(), REGEX_BIRTHDAY);

                System.out.println("Địa chỉ của giáo viên: ");
                String address = addressFormat();

                System.out.println("Lớp dạy: ");
                String classroom = input.nextLine();

                System.out.println("Lương dạy 1 giờ = ");
                double salary = Double.parseDouble(input.nextLine());

                System.out.println("Số giờ dạy trong tháng: ");
                int hours = Integer.parseInt(input.nextLine());

                teacher.setId(id);
                teacher.setName(name);
                teacher.setGender(gender);
                teacher.setBirthDay(birthDay);
                teacher.setAddress(address);
                teacher.setClassroom(classroom);
                teacher.setSalary(salary);
                teacher.setHours(hours);

                String line = "";

                for (int j = 0; j < teacherList.size(); j++) {
                    line += teacherList.get(j).getId() + "," + teacherList.get(j).getName()
                            + "," + teacherList.get(j).getGender() + "," +
                            teacherList.get(j).getBirthDay() + "," + teacherList.get(j).getAddress()
                            + "," + teacherList.get(j).getClassroom() + "," + teacherList.get(j).getSalary() +
                            "," + teacherList.get(j).getHours() + "\n";
                }
                ReadAndWrite.writeFile(LINK_TEACHER, line);

                System.out.println("Cập nhập giáo viên thành công.");

            }
        }
    }

    public void readFileTeacher() {
        list = ReadAndWrite.readFile(LINK_TEACHER);

        teacherList.clear();

        for (String[] item : list) {
            TeacherOfSchool student = new TeacherOfSchool(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    item[5], Double.parseDouble(item[6]), Integer.parseInt(item[7]));
            teacherList.add(student);
        }
    }

    public String nameFormat() {
        do {
            String name = input.nextLine();
            if (name.equals("")) {
                System.out.println("Không được để trống.");
            } else {
                return name;
            }
        } while (true);
    }

    public String addressFormat() {
        do {
            String address = input.nextLine();
            if (address.equals("")) {
                System.out.println("Không được để trống.");
            } else {
                return address;
            }
        } while (true);
    }

}
