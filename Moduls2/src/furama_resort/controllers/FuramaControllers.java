package furama_resort.controllers;

import java.util.Scanner;

public class FuramaControllers {
    static Scanner input = new Scanner(System.in);

    public static void displayMainMenu() {
        do {
            System.out.println("-----Main Menu-----");
            System.out.println("1. Employee Management. \n" +
                    "2. Customer Management. \n" +
                    "3. Facility Management. \n" +
                    "4. Booking Management. \n" +
                    "5. Promotion Management. \n" +
                    "6. Exit.");
            System.out.println("Your choose: ");
            mainMenu();
        } while (true);
    }

    public static void mainMenu() {
        try {
            int chooseMainMenu = Integer.parseInt(input.nextLine());
            switch (chooseMainMenu) {
                case 1:
                    AllMethod.menuEmployee();
                    break;
                case 2:
                    AllMethod.menuCustomer();
                    break;
                case 3:
                    AllMethod.menuFacility();
                    break;
                case 4:
                    AllMethod.menuBooking();
                    break;
                case 5:
                    AllMethod.promotionManager();
                    break;
                case 6:
                    System.out.println("Exit program.");
                    System.exit(0);
                    break;
                default:
                    System.err.println("Bạn chỉ được nhập từ 1 - 6.");
            }
        } catch (Exception e) {
            System.err.println("Bạn nhập sai định dạng số.");
        }
    }

    public static void main(String[] args) {

        do {
            try {
                System.out.println("We will start the program now! \n" +
                        "1. Start program. \n" +
                        "2.End program.");
                int chooseStarOrEnd = Integer.parseInt(input.nextLine());
                switch (chooseStarOrEnd) {
                    case 1:
                        System.out.println("Started!");
                        displayMainMenu();
                        break;
                    case 2:
                        System.exit(0);
                    default:
                        System.err.println("Bạn chỉ được nhập từ 1 -2.");
                }

            } catch (NumberFormatException e) {
                System.err.println("Bạn nhập sai định dạng số.");
            }
        } while (true);

    }
}
