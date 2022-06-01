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
        int chooseMainMenu = 0;
        try {
            chooseMainMenu = Integer.parseInt(input.nextLine());
        } catch (Exception e) {
            System.err.println("You can't enter Alphabet.");
        }
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
                System.err.println("You can enter number 1 - 6.");
        }
    }
}
