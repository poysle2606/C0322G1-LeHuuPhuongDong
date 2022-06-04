package quan_ly_du_an.controllers;

import jdk.internal.util.xml.impl.Input;

import java.util.Scanner;

public class MenuPatient {
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN---- \n" +
                    "Chọn chức năng theo số (để tiếp tục): \n" +
                    "1. Thêm mới. \n" +
                    "2. Xóa. \n" +
                    "3. Xem danh sách bệnh án. \n" +
                    "4. Thoát. \n" +
                    "Chọn chức năng.");
            try {
                int choose = Integer.parseInt(input.nextLine());
                switch (choose) {
                    case 1:
                        AllMethod.addPatient();
                        break;
                    case 2:
                        AllMethod.deletePatient();
                        break;
                    case 3:
                        AllMethod.displayPatient();
                        break;
                    case 4:
                        System.out.println("Bạn đã thoát chương trình.");
                        System.exit(0);
                    default:
                        System.err.println("Vui lòng chọn đúng số trong danh sách.");

                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng không nhập chữ.!");
            }
        } while (true);
    }
}
