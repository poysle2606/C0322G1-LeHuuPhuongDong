package home_work.services.services_class;

import home_work.person.ManagementStaff;
import home_work.services.services_class.ProductServices;
import home_work.services.services_class.StaffServices;
import quan_ly_du_an.files_data.ReadAndWrite;

import java.util.Scanner;

public class AllMethodOfEmployee {

    static Scanner input = new Scanner(System.in);

    static final String LINK_TOTAL = "src/home_work/files/employee.csv";

    static StaffServices staff = new StaffServices();

    static ProductServices product = new ProductServices();

    public static void display() {
        do {
            System.out.println("Bạn muốn hiển thị danh sách của: \n" +
                    "1.Nhân viên quản lý. \n" +
                    "2.Nhân viên sản xuất. \n" +
                    "3.Tất cả Nhân viên. \n" +
                    "4.Trở lại. \n" +
                    "Chọn chức năng.");
            try {
                int choose = Integer.parseInt(input.nextLine());

                switch (choose) {
                    case 1:
                        staff.display();
                        break;
                    case 2:
                        product.display();
                        break;
                    case 3:
                        staff.display();
                        product.display();
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("Bạn chọn không đúng chức năng.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Chức năng không đươc nhập chữ.!");
            }
        } while (true);
    }

    public static void addEmployee() {
        do {
            System.out.println("Bạn muốn thêm nhân viên vào danh sách của: \n" +
                    "1.Nhân viên quản lý. \n" +
                    "2.Nhân viên sản xuất. \n" +
                    "3.Trở lại. \n" +
                    "Chọn chức năng.");
            try {
                int choose = Integer.parseInt(input.nextLine());

                switch (choose) {
                    case 1:
                        staff.add();
                        break;
                    case 2:
                        product.add();
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

    public static void deleteEmployee() {
        do {
            System.out.println("Bạn muốn xóa nhân viên nào khỏi danh sách của: \n" +
                    "1.Nhân viên quản lý. \n" +
                    "2.Nhân viên sản xuất. \n" +
                    "3.Trở lại. \n" +
                    "Chọn chức năng.");
            try {
                int choose = Integer.parseInt(input.nextLine());

                StaffServices staff = new StaffServices();

                ProductServices product = new ProductServices();

                switch (choose) {
                    case 1:
                        staff.delete();
                        break;
                    case 2:
                        product.delete();
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

    public static void searchEmployee() {
        do {
            System.out.println("Bạn tìm kiếm nhân viên nào : \n" +
                    "1.Nhân viên quản lý. \n" +
                    "2.Nhân viên sản xuất. \n" +
                    "3.Trở lại. \n" +
                    "Chọn chức năng.");
            try {
                int choose = Integer.parseInt(input.nextLine());

                StaffServices staff = new StaffServices();

                ProductServices product = new ProductServices();

                switch (choose) {
                    case 1:
                        staff.search();
                        break;
                    case 2:
                        product.search();
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


}
