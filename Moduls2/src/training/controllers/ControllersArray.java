package training.controllers;

import training.services.class_services.ArrayHuman;
import training.services.class_services.ArrayListHuman;
import training.services.class_services.ComparatorSalary;

import java.util.Scanner;

public class ControllersArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayHuman manager = new ArrayHuman();
        System.out.println("1.Hiển thị toàn bộ danh sách nhân viên.\n" +
                "2.Hiển thị danh sách nhân viên quản lý.\n" +
                "3.Hiển thị danh sách nhân viên công nhật.\n" +
                "4.Hiển thị danh sách nhân viên sản xuất.\n" +
                "5.Thoát.");
        System.out.println("Bạn chọn: ");
        do {
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    manager.display();
                    break;
                case 2:
                    manager.displayManagementStaff();
                    break;
                case 3:
                    manager.displayDailyWorkers();
                    break;
                case 4:
                    manager.displayProductionStaff();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("You entered wrong! Please enter again.");
            }
        } while (true);
    }
}
