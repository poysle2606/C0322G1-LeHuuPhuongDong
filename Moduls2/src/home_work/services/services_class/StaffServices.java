package home_work.services.services_class;

import home_work.services.impl_class.StaffImpl;
import home_work.person.ManagementStaff;
import home_work.untils.NotFoundEmployeeException;
import home_work.untils.PositiveNumberExceptions;
import home_work.untils.RegexOfEmployee;
import quan_ly_du_an.exception.CodePatientException;
import quan_ly_du_an.files_data.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class StaffServices implements StaffImpl {

    static Scanner input = new Scanner(System.in);

    public static final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    static final String LINK_STAFF = "src/home_work/files/employee.csv";

    List<ManagementStaff> staffList = new LinkedList<>();

    static List<String[]> list;

    @Override
    public void display() {

        list = ReadAndWrite.readFile(LINK_STAFF);

        staffList.clear();

        for (String[] item : list) {
            ManagementStaff staff = new ManagementStaff(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    item[5], item[6]);
            staffList.add(staff);
            if (item[1].contains("STAFF")) {
                System.out.println(staff);
            }
        }

        if (staffList.isEmpty()) {
            System.err.println("Danh sách rỗng cần thêm mới để hiển thị.");
        }

    }

    @Override
    public void add() {

        list = ReadAndWrite.readFile(LINK_STAFF);

        for (String[] item : list) {
            ManagementStaff staff = new ManagementStaff(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    item[5], item[6]);
            staffList.add(staff);
        }

        System.out.println("Id sẽ tự động cập nhật:");

        int max = 0;

        int id;

        if (staffList.isEmpty()) {
            id = 1;
        } else {
            for (ManagementStaff item1 : staffList) {
                if (item1.getId() > max) {
                    max = item1.getId();
                }
            }
            id = max + 1;
        }

        String codeEmpl;
        do {
            try {
                System.out.println("Mã nhân viên quản lý sẽ nhập theo định dạng (STAFF-XXXX) - XXXX là số từ 0-9.");

                codeEmpl = input.nextLine();

                if (RegexOfEmployee.formatStaff(codeEmpl)) {
                    break;
                } else {
                    throw new CodePatientException("Bạn nhập sai định dạng. xin nhập lại.");
                }
            } catch (CodePatientException e) {
                e.printStackTrace();
            }

        } while (true);

        System.out.println("Tên của nhân viên: ");
        String name = input.nextLine();

        System.out.println("Ngày sinh của nhân viên: ");
        String birthDay = RegexOfEmployee.regexAge1(input.nextLine(), REGEX_BIRTHDAY);

        System.out.println("Địa chỉ của nhân viên: ");
        String address = input.nextLine();

        String salary;
        do {
            try {
                System.out.println("Lương của nhân viên: ");

                salary = input.nextLine();

                if (RegexOfEmployee.formatPositive(salary)) {
                    break;
                } else {
                    throw new PositiveNumberExceptions("Bạn nhập sai định dạng.");
                }

            } catch (PositiveNumberExceptions e) {
                e.printStackTrace();
            }

        } while (true);


        String coefficientsSalary;
        do {
            try {
                System.out.println("Hệ số lương của nhân viên tính nhập theo(X.X) - X là số dương từ 0-9 : ");

                coefficientsSalary = input.nextLine();

                if (RegexOfEmployee.formatPositiveSalary(coefficientsSalary)) {
                    break;
                } else {
                    throw new PositiveNumberExceptions("Bạn nhập sai định dạng.");
                }

            } catch (PositiveNumberExceptions e) {
                e.printStackTrace();
            }

        } while (true);

        ManagementStaff staff = new ManagementStaff(id, codeEmpl, name, birthDay, address, salary, coefficientsSalary);
        staffList.add(staff);

        String line = "";

        for (ManagementStaff person : staffList) {
            line += person.inFor() + "\n";
        }
        ReadAndWrite.writeFile(LINK_STAFF, line);

        System.out.println("Thêm mới nhân viên thành công.");

    }

    @Override
    public void delete() {

        list = ReadAndWrite.readFile(LINK_STAFF);

        for (String[] item : list) {
            ManagementStaff staff = new ManagementStaff(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    item[5], item[6]);
            staffList.add(staff);
        }

        System.out.println("Bạn cần biết mã nhân viên để xóa: \n" +
                "1.Tôi đã biết. \n" +
                "2.Cho tôi xem lại. \n" +
                "3.Quay lại. \n" +
                "Chọn chức năng.");
        try {

            int choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Nhập mã nhân viên tai đây.");

                    try {
                        String codePerson = input.nextLine();

                        boolean flag = false;

                        for (int i = 0; i < staffList.size(); i++) {
                            if (Objects.equals(codePerson, staffList.get(i).getCodePerson())) {
                                System.out.println("Bạn có muốn xóa Nhân viên này không: \n" +
                                        "1.Chắc chắn xóa. \n" +
                                        "2.Không. \n" +
                                        "Chọn chức năng.");

                                int choose1 = Integer.parseInt(input.nextLine());

                                switch (choose1) {
                                    case 1:
                                        staffList.remove(staffList.get(i));

                                        System.out.println("Xóa nhân viên này thành công");

                                        String line = "";

                                        for (ManagementStaff staff : staffList) {
                                            line += staff.inFor() + "\n";
                                        }

                                        ReadAndWrite.writeFile(LINK_STAFF, line);

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
                            throw new NotFoundEmployeeException("Mã nhân viên này không có.");
                        }
                    } catch (NotFoundEmployeeException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    for (int i = 0; i < staffList.size(); i++) {
                        String code = staffList.get(i).getCodePerson();

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
    public void search() {

        list = ReadAndWrite.readFile(LINK_STAFF);

        for (String[] item : list) {
            ManagementStaff staff = new ManagementStaff(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    item[5], item[6]);
            staffList.add(staff);
        }
        do {
            System.out.println("Bạn có thể tìm kiêm theo Mã nhân viên, họ tên, ngày sinh, địa chỉ. \n" +
                    "1.Mã nhân viên. \n" +
                    "2.Họ và tên. \n" +
                    "3.Ngày sinh. \n" +
                    "4.Địa chỉ. \n" +
                    "5.Quay lại \n" +
                    "Chọn chức năng.");
            try {

                int choose = Integer.parseInt(input.nextLine());

                switch (choose) {
                    case 1:
                        searchIdEmployee();
                        break;
                    case 2:
                        searchName();
                        break;
                    case 3:
                        searchBirthDay();
                        break;
                    case 4:
                        searchAddress();
                        break;
                    case 5:
                        return;
                    default:
                        System.err.println("Chức năng này không có.");
                }

            } catch (NumberFormatException e) {
                System.err.println("Bạn không được nhập chữ.");
            }
        } while (true);
    }

    public void searchName() {

        System.out.println("Nhập tên cần tìm kiếm tại đây.");

        String name = input.nextLine();

        boolean flag = false;

        for (ManagementStaff managementStaff : staffList) {
            if (managementStaff.getName().equals(name)) {

                flag = true;

                System.out.println(managementStaff);
            }

        }
        if (!flag) {
            System.out.println("Không có tên Nhân viên này.");
        }
    }

    public void searchIdEmployee() {

        System.out.println("Nhập mã nhân viên cần tìm kiếm tại đây.");

        String code = input.nextLine();

        boolean flag = false;

        for (ManagementStaff managementStaff : staffList) {
            if (managementStaff.getCodePerson().equals(code)) {

                flag = true;

                System.out.println(managementStaff);
            }

        }
        if (!flag) {
            System.out.println("Không tìm thấy nhân viên này.");
        }

    }

    public void searchBirthDay() {

        System.out.println("Nhập ngày sinh nhân viên cần tìm kiếm tại đây.");

        String day = input.nextLine();

        boolean flag = false;

        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getBirthDay().equals(day)) {

                flag = true;

                System.out.println(staffList.get(i));
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy Nhân viên này.");
        }
    }

    public void searchAddress() {

        System.out.println("Nhập địa chỉ nhân viên cần tìm kiếm tại đây.");

        String address = input.nextLine();

        boolean flag = false;

        for (int i = 0; i < staffList.size(); i++) {
            if (staffList.get(i).getAddress().equals(address)) {

                flag = true;

                System.out.println(staffList.get(i));
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy Nhân viên này.");
        }
    }
}
