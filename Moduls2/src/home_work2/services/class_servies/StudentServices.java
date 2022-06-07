package home_work2.services.class_servies;

import home_work2.models.StudentOfSchool;
import home_work2.services.impl_services.Services;
import home_work2.utils.RegexOfSchool;
import home_work2.utils.SoftBirthDay;
import home_work2.utils.SoftName;
import quan_ly_du_an.exception.CodePatientException;
import quan_ly_du_an.files_data.ReadAndWrite;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StudentServices implements Services {

    static Scanner input = new Scanner(System.in);

    public static final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    static final String LINK_STUDENT = "src/home_work2/files/student.csv";

    List<StudentOfSchool> studentList = new LinkedList<>();

    static List<String[]> list;

    @Override
    public void display() {
        readFileStudent();

        if (studentList.isEmpty()) {
            System.err.println("Danh sách rỗng cần thêm mới để hiển thị.");
        }

        for (StudentOfSchool list : studentList) {
            System.out.println(list);
        }
    }

    @Override
    public void add() {
        readFileStudent();

        System.out.println("Id sẽ tự động cập nhật:");

        int max = 0;

        int id;

        if (studentList.isEmpty()) {
            id = 1;
        } else {
            for (StudentOfSchool item1 : studentList) {
                if (item1.getId() > max) {
                    max = item1.getId();
                }
            }
            id = max + 1;
        }

        System.out.println("Tên học sinh: ");
        String name = nameFormat();

        System.out.println("Giới tính của học sinh: ");
        String gender = AllMethodSchool.getGender();

        System.out.println("Ngày sinh của học sinh: ");
        String birthDay = RegexOfSchool.regexAge1(input.nextLine(), REGEX_BIRTHDAY);

        System.out.println("Địa chỉ của học sinh: ");
        String address = addressFormat();

        String codeStudent;
        do {
            try {
                System.out.println("Mã học sinh có 8 số từ 0-9.");

                codeStudent = input.nextLine();

                if (RegexOfSchool.formatStudent(codeStudent)) {
                    break;
                } else {
                    throw new CodePatientException("Bạn nhập sai định dạng. xin nhập lại.");
                }
            } catch (CodePatientException e) {
                e.printStackTrace();
            }

        } while (true);

        System.out.println("Nhập điểm: ");
        double point = point();


        StudentOfSchool student = new StudentOfSchool(id, name, gender, birthDay, address, codeStudent, point);
        studentList.add(student);

        String line = "";

        for (StudentOfSchool person : studentList) {
            line += person.inForOfSchool() + "\n";
        }
        ReadAndWrite.writeFile(LINK_STUDENT, line);

        System.out.println("Thêm mới học sinh thành công.");

    }

    @Override
    public void delete() {

        readFileStudent();

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

                    for (int i = 0; i < studentList.size(); i++) {
                        if (idPerson == studentList.get(i).getId()) {
                            System.out.println("Bạn có muốn xóa học sinh này không: \n" +
                                    "1.Chắc chắn xóa. \n" +
                                    "2.Không. \n" +
                                    "Chọn chức năng.");

                            int choose1 = Integer.parseInt(input.nextLine());

                            switch (choose1) {
                                case 1:
                                    studentList.remove(studentList.get(i));

                                    System.out.println("Xóa học sinh này thành công");

                                    String line = "";

                                    for (StudentOfSchool student : studentList) {
                                        line += student.inForOfSchool() + "\n";
                                    }

                                    ReadAndWrite.writeFile(LINK_STUDENT, line);

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
                    for (int i = 0; i < studentList.size(); i++) {
                        int code = studentList.get(i).getId();

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

        readFileStudent();

        System.out.println("Sắp xếp theo: \n" +
                "1.Theo tên. \n" +
                "2.Theo ngày sinh. \n" +
                "3.Quay lại. \n" +
                "Chọn chức năng.");

        String choose = input.nextLine();

        switch (choose) {
            case "1":
                SoftName name = new SoftName();

                Collections.sort(studentList, name);

                for (StudentOfSchool item : studentList) {
                    System.out.println(item);
                }
                break;
            case "2":
                SoftBirthDay softBirthDay = new SoftBirthDay();

                Collections.sort(studentList, softBirthDay);

                for (StudentOfSchool item : studentList) {
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

        readFileStudent();

        StudentOfSchool student = new StudentOfSchool();

        System.out.println("Nhập ID mà bạn muốn chỉnh sửa.");

        int id = Integer.parseInt(input.nextLine());

        for (int i = 0; i < studentList.size(); i++) {
            if (id == studentList.get(i).getId()) {

                studentList.set(i, student);

                System.out.println("Tên học sinh: ");
                String name = nameFormat();

                System.out.println("Giới tính của học sinh: ");
                String gender = AllMethodSchool.getGender();

                System.out.println("Ngày sinh của học sinh: ");
                String birthDay = RegexOfSchool.regexAge1(input.nextLine(), REGEX_BIRTHDAY);

                System.out.println("Địa chỉ của học sinh: ");
                String address = addressFormat();

                String codeStudent;
                do {
                    try {
                        System.out.println("Mã học sinh có 8 số từ 0-9.");

                        codeStudent = input.nextLine();

                        if (RegexOfSchool.formatStudent(codeStudent)) {
                            break;
                        } else {
                            throw new CodePatientException("Bạn nhập sai định dạng. xin nhập lại.");
                        }
                    } catch (CodePatientException e) {
                        e.printStackTrace();
                    }

                } while (true);

                System.out.println("Nhập điểm: ");
               double point = point();

                student.setId(id);
                student.setName(name);
                student.setGender(gender);
                student.setBirthDay(birthDay);
                student.setAddress(address);
                student.setCodeStudent(codeStudent);
                student.setPoint(point);

                String line = "";
                for (int j = 0; j < studentList.size(); j++) {
                    line += studentList.get(j).getId() + "," + studentList.get(j).getName()
                            + "," + studentList.get(j).getGender() + "," + studentList.get(j).getBirthDay()
                            + "," + studentList.get(j).getAddress() + "," + studentList.get(j).getCodeStudent()
                            + "," + studentList.get(j).getPoint() + "\n";
                }
                ReadAndWrite.writeFile(LINK_STUDENT, line);

                System.out.println("Cập nhập học sinh thành công.");

            }
        }
    }

    public void readFileStudent() {
        list = ReadAndWrite.readFile(LINK_STUDENT);

        studentList.clear();

        for (String[] item : list) {
            StudentOfSchool student = new StudentOfSchool(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    item[5], Double.parseDouble(item[6]));
            studentList.add(student);
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

    public double point() {
        double point;
        do {
            point = Double.parseDouble(input.nextLine());
            if (point > 10 || point <= 0) {
                System.out.println("Nhập lại");
            } else {
                return point;
            }
        } while (true);

    }
}
