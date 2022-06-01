package furama_resort.controllers;

import furama_resort.services.packeage_class.*;

import java.util.Scanner;

public class AllMethod {
    static Scanner input = new Scanner(System.in);

    public static void menuEmployee() {
        do {
            System.out.println("--------------------");
            System.out.println("1.Display list employees. \n" +
                    "2.Add new employee. \n" +
                    "3.Edit employee. \n" +
                    "4.Return main Menu.");
            System.out.println("Enter number: ");
            int numberOfCase1 = 0;
            try {
                numberOfCase1 = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("You can't enter Alphabet.");
            }
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
                    return;
                default:
                    System.err.println("You can enter number 1 - 4.");
            }
        } while (true);
    }

    public static void menuCustomer() {
        do {

            System.out.println("1.Display list customers \n" +
                    "2.Add new customers. \n" +
                    "3.Edit customers. \n" +
                    "4.Return main Menu.");
            System.out.println("Enter number: ");
            int numberOfCase2 = 0;
            try {
                numberOfCase2 = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("You can't enter Alphabet.");
            }
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
                    break;
                case 4:
                    return;
                default:
                    System.err.println("You can enter number 1 - 4.");
            }
        } while (true);

    }

    public static void menuFacility() {
        do {
            int numberOfCase3 = 0;
            System.out.println("1.Display list facility. \n" +
                    "2.Add new facility. \n" +
                    "3.Edit facility. \n" +
                    "4.Return main Menu.");
            System.out.println("Enter number: ");
            try {
                numberOfCase3 = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("You can't enter Alphabet.");
            }
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
                            menuFacility();
                            break;
                        default:
                            System.err.println("You can input number 1 - 4.");
                    }
                    break;
                case 3:
                    break;
                case 4:
                    return;
                default:
                    System.err.println("You can input number 1 - 4.");
            }
        } while (true);
    }

    public static void menuBooking() {
        do {
            int numberOfCase4 = 0;
            System.out.println("1.Add new booking. \n" +
                    "2.Display list booking. \n" +
                    "3.Create new contracts. \n" +
                    "4.Display list contracts. \n" +
                    "5.Edit contracts. \n" +
                    "6.Return main Menu.");
            System.out.println("Enter number: ");
            try {
                numberOfCase4 = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("You can't enter Alphabet.");
            }
            BookingServiceImpl booking = new BookingServiceImpl();
            ContractServiceImpl contract = new ContractServiceImpl();
            switch (numberOfCase4) {
                case 1:
                    booking.addPerson();
                    break;
                case 2:
                    booking.display();
                    break;
                case 3:
                    contract.addPerson();
                    break;
                case 4:
                    contract.display();
                    break;
                case 5:
                case 6:
                    return;
            }
        } while (true);
    }

    public static void promotionManager() {
        do {
            int numberOfCase5 = 0;
            System.out.println("1.Display list customers use service. \n" +
                    "2.Display list customers get voucher. \n" +
                    "3.Return main Menu.");
            System.out.println("Enter number: ");
            try {
                numberOfCase5 = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("You can't enter Alphabet.");
            }
            switch (numberOfCase5) {
                case 1:
                case 2:
                case 3:
                    FuramaControllers.displayMainMenu();
                    break;
            }

        } while (true);
    }
}
