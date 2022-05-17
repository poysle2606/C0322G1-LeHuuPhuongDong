package controllers;

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
        int chooseMainMenu = Integer.parseInt(input.nextLine());
        switch (chooseMainMenu) {
            case 1:
                int numberOfCase1;
                do {
                    System.out.println("--------------------");
                    System.out.println("1.Display list employees. \n" +
                            "2.Add new employee. \n" +
                            "3.Edit employee. \n" +
                            "4.Return main Menu.");
                    System.out.println("Enter number: ");
                    numberOfCase1 = Integer.parseInt(input.nextLine());
                    switch (numberOfCase1) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            displayMainMenu();
                            break;
                    }
                } while (numberOfCase1 >= 5);
                break;
            case 2:
                int numberOfCase2;
                do {
                    System.out.println("1.Display list customers \n" +
                            "2.Add new customers. \n" +
                            "3.Edit customers. \n" +
                            "4.Return main Menu.");
                    System.out.println("Enter number: ");
                    numberOfCase2 = Integer.parseInt(input.nextLine());
                    switch (numberOfCase2) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            displayMainMenu();
                            break;
                    }
                } while (numberOfCase2 >= 5);
                break;
            case 3:
                int numberOfCase3;
                do {
                    System.out.println("1.Display list facility. \n" +
                            "2.Add new facility. \n" +
                            "3.Edit facility. \n" +
                            "4.Return main Menu.");
                    System.out.println("Enter number: ");
                    numberOfCase3 = Integer.parseInt(input.nextLine());
                    switch (numberOfCase3) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            displayMainMenu();
                            break;
                    }
                } while (numberOfCase3 >= 5);
                break;
            case 4:
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
                            displayMainMenu();
                            break;
                    }
                } while (numberOfCase4 >= 7);
                break;
            case 5:
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
                            displayMainMenu();
                            break;
                    }
                } while (numberOfCase5 >= 4);
                break;
            case 6:
                System.out.println("Exit program.");
                System.exit(0);
                break;
        }
    }

    public static void main(String[] args) {
        do {
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
            }
        } while (true);
    }
}
