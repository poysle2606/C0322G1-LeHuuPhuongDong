package furama_resort.controllers;

import furama_resort.services.packeage_class.CustomerServiceImpl;
import furama_resort.services.packeage_class.EmployeeServiceImpl;
import furama_resort.services.packeage_class.FacilityServiceImpl;

import java.util.Scanner;

public class AllMethod {
    static Scanner input = new Scanner(System.in);
    public static void menuEmployee() {
        int numberOfCase1;
        do {
            System.out.println("--------------------");
            System.out.println("1.Display list employees. \n" +
                    "2.Add new employee. \n" +
                    "3.Edit employee. \n" +
                    "4.Return main Menu.");
            System.out.println("Enter number: ");
            numberOfCase1 = Integer.parseInt(input.nextLine());
            EmployeeServiceImpl employee = new EmployeeServiceImpl();
            switch (numberOfCase1) {
                case 1:
                    employee.display();
                    break;
                case 2:
                    employee.addPerson();
                    break;
                case 3:
                    employee.updatePerson();
                    break;
                case 4:
                   FuramaControllers.displayMainMenu();
                    break;
            }
        } while (numberOfCase1 >= 5);
    }

    public static void menuCustomer() {
        int numberOfCase2;
        do {
            System.out.println("1.Display list customers \n" +
                    "2.Add new customers. \n" +
                    "3.Edit customers. \n" +
                    "4.Return main Menu.");
            System.out.println("Enter number: ");
            numberOfCase2 = Integer.parseInt(input.nextLine());
            CustomerServiceImpl customer = new CustomerServiceImpl();
            switch (numberOfCase2) {
                case 1:
                    customer.display();
                    break;
                case 2:
                    customer.addPerson();
                    break;
                case 3:
                    customer.updatePerson();
                case 4:
                   FuramaControllers.displayMainMenu();
                    break;
            }
        } while (numberOfCase2 >= 5);
    }

    public static void menuFacility() {
        int numberOfCase3;
        do {
            System.out.println("1.Display list facility. \n" +
                    "2.Add new facility. \n" +
                    "3.Edit facility. \n" +
                    "4.Return main Menu.");
            System.out.println("Enter number: ");
            numberOfCase3 = Integer.parseInt(input.nextLine());
            FacilityServiceImpl facility = new FacilityServiceImpl();
            switch (numberOfCase3) {
                case 1:
                    facility.display();
                    break;
                case 2:
                    System.out.println("You wanna add new facility? \n" +
                            "1.Add new Villa. \n" +
                            "2.Add new House. \n" +
                            "3.Add new Room. \n" +
                            "4.Back to Menu.");
                    System.out.println("Please enter here: ");
                    int numberAdd = Integer.parseInt(input.nextLine());
                    switch (numberAdd) {
                        case 1:
                            facility.addNewVilla();
                            break;
                        case 2:
                            facility.addNewHouse();
                            break;
                        case 3:
                            facility.addNewRoom();
                            break;
                        case 4:
                            return;
                        default:
                            System.out.println("If you entered it wrong, please re-enter it.");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    FuramaControllers.displayMainMenu();
                    break;
            }
        } while (numberOfCase3 >= 5);
    }

    public static void menuBooking() {
        int numberOfCase4;
        do {
            System.out.println("1.Add new booking. \n" +
                    "2.Display list booking. \n" +
                    "3.Create new contracts. \n" +
                    "4.Display list contracts. \n" +
                    "5.Edit contracts. \n" +
                    "6.Return main Menu.");
            System.out.println("Enter number: ");
            numberOfCase4 = Integer.parseInt(input.nextLine());
            switch (numberOfCase4) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                   FuramaControllers.displayMainMenu();
                    break;
            }
        } while (numberOfCase4 >= 7);
    }

    public static void promotionManager() {
        int numberOfCase5;
        do {
            System.out.println("1.Display list customers use service. \n" +
                    "2.Display list customers get voucher. \n" +
                    "3.Return main Menu.");
            System.out.println("Enter number: ");
            numberOfCase5 = Integer.parseInt(input.nextLine());
            switch (numberOfCase5) {
                case 1:
                case 2:
                case 3:
                    FuramaControllers.displayMainMenu();
                    break;
            }
        } while (numberOfCase5 >= 4);
    }
}
