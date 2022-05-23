package training.controllers;

import training.person.ManagementStaff;
import training.services.class_services.ArrayListHuman;
import training.services.class_services.LinkedListHuman;

import java.util.Scanner;

public class ControllersLinkedList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedListHuman item = new LinkedListHuman();
        System.out.println("1.Hiển thị toàn bộ danh sách nhân viên.\n" +
                "2.Hiển thị danh sách nhân viên quản lý.\n" +
                "3.Hiển thị danh sách nhân viên công nhật.\n" +
                "4.Hiển thị danh sách nhân viên sản xuất.\n" +
                "5.Sắp xếp lương nhân viên.\n" +
                "6.Lựa chọn hiển thị danh sách nhân viên.\n" +
                "7.Thoát.");
        do {
            System.out.println("Bạn chọn: ");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    item.display();
                    break;
                case 2:
                    item.displayManagementStaff();
                    break;
                case 3:
                    item.displayDailyWorkers();
                    break;
                case 4:
                    item.displayProductionStaff();
                    break;
                case 5:
                    item.comparatorSalary();
                    item.display();
                case 6:
                    System.out.println("---Bạn muốn chọn sắp xếp như nào?--- \n" +
                            "1.Sắp xếp theo lương. \n" +
                            "2.Sắp xếp theo tên.\n" +
                            "3.Thoát.");
                    System.out.println("Chọn đi chế: ");
                    do {
                        int chooseSort = Integer.parseInt(input.nextLine());
                        switch (chooseSort) {
                            case 1:
                                item.comparatorSalary();
                                item.display();
                                break;
                            case 2:
                                item.comparatorName();
                                item.display();
                                break;
                            case 3:
                                return;
                            default:
                                System.out.println("Enter again please!");
                        }
                    } while (true);
                case 7:
                    return;
                default:
                    System.out.println("You entered wrong! Please enter again.");
            }
        } while (true);
    }
}
