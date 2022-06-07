package home_work.controllers;

import home_work.services.services_class.AllMethodOfEmployee;

import java.util.Scanner;

public class MenuDisplay {

    static Scanner input = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("----Công ty ABC---- \n" +
                    "1. Danh sách Nhân viên. \n" +
                    "2. Thêm mới Nhân viên. \n" +
                    "3. Xóa Nhân viên. \n" +
                    "4. Tìm kiếm nhân viên. \n" +
                    "5. Thoát. \n" +
                    "Chọn chức năng.");
            try {

                int choose = Integer.parseInt(input.nextLine());

                switch (choose) {
                    case 1:
                        AllMethodOfEmployee.display();
                        break;
                    case 2:
                        AllMethodOfEmployee.addEmployee();
                        break;
                    case 3:
                        AllMethodOfEmployee.deleteEmployee();
                        break;
                    case 4:
                        AllMethodOfEmployee.searchEmployee();
                        break;
                    case 5:
                        System.out.println("Chương trình đã ngừng");
                        System.exit(0);
                    default:
                        System.err.println("Bạn chọn không đúng chức năng.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Chức năng không đươc nhập chữ.!");
            }
        } while (true);
    }
}
