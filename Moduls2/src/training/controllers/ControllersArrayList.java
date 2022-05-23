package training.controllers;

import training.services.class_services.ArrayListHuman;
import training.services.class_services.ComparatorName;
import training.services.class_services.ComparatorSalary;

import java.util.Scanner;

public class ControllersArrayList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayListHuman item = new ArrayListHuman();
        System.out.println("1.Hiển thị toàn bộ danh sách nhân viên.\n" +
                "2.Hiển thị danh sách nhân viên quản lý.\n" +
                "3.Hiển thị danh sách nhân viên công nhật.\n" +
                "4.Hiển thị danh sách nhân viên sản xuất.\n" +
                "5.Sắp xếp theo lương nhân viên.\n" +
                "6.Sắp xếp theo tên nhân viên.\n" +
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
                    break;
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
