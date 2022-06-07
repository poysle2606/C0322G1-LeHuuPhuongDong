package home_work2.controllers;

import home_work.services.services_class.AllMethodOfEmployee;
import home_work2.services.class_servies.AllMethodSchool;

import java.util.Scanner;

public class MenuSchool {
    static Scanner input = new Scanner(System.in);

    public static void menu() {
        do {
            System.out.println("----DANH SÁCH CHỨC NĂNG---- \n" +
                    "1. Hiển thị danh sách. \n" +
                    "2. Thêm mới. \n" +
                    "3. Xóa. \n" +
                    "4. Sắp xếp. \n" +
                    "5. Chỉnh sửa. \n" +
                    "6.Thoát. \n" +
                    "Chọn chức năng.");

            String choose = input.nextLine();

            switch (choose) {
                case "1":
                    AllMethodSchool.displayPerson();
                    break;
                case "2":
                    AllMethodSchool.addPerson();
                    break;
                case "3":
                    AllMethodSchool.deletePerson();
                    break;
                case "4":
                    AllMethodSchool.sortPerson();
                    break;
                case "5":
                    AllMethodSchool.updatePerson();
                    break;
                case "6":
                    System.out.println("Chương trình đã ngừng");
                    System.exit(0);
                default:
                    System.err.println("Bạn chọn không đúng chức năng.");
            }
        } while (true);
    }
}
