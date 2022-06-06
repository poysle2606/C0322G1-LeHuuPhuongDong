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
                EmployeeServiceImpl employee = new EmployeeServiceImpl();
                switch (numberOfCase1) {
                    case 1:
                        employee.display();
                        break;
                    case 2:
                        employee.add();
                        break;
                    case 3:
                        employee.update();
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("You can enter number 1 - 4.");
                }
            } catch (NumberFormatException e) {
                System.err.println("You can't enter Alphabet.");
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
                    customer.add();
                    break;
                case 3:
                    customer.update();
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
                    "3.Display list facility maintenance. \n" +
                    "4.Return main Menu.");
            System.out.println("Enter number: ");
            try {
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
                                menuFacility();
                                break;
                            default:
                                System.err.println("You can input number 1 - 4.");
                        }
                        break;
                    case 3:
                        facility.maintenance();
                        break;
                    case 4:
                        return;
                    default:
                        System.err.println("You can input number 1 - 4.");
                }
            } catch (NumberFormatException e) {
                System.err.println("You can't enter Alphabet.");
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

                BookingServiceImpl booking = new BookingServiceImpl();
                ContractServiceImpl contract = new ContractServiceImpl();
                switch (numberOfCase4) {
                    case 1:
                        booking.add();
                        break;
                    case 2:
                        booking.display();
                        break;
                    case 3:
                        contract.add();
                        break;
                    case 4:
                        contract.display();
                        break;
                    case 5:
                    case 6:
                        return;
                }
            } catch (NumberFormatException e) {
                System.err.println("You can't enter Alphabet.");
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
    public static String getGender() {
        do {
            System.out.println("Enter your gender: \n" +
                    "1. Men. \n" +
                    "2. Woman. \n" +
                    "3. LGBT.");
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    return "Men";
                case 2:
                    return "Woman";
                case 3:
                    return "LGBT";
                default:
                    System.out.println("If you entered it wrong, please re-enter it.");
            }

        } while (true);
    }
}
