package furama_resort.controllers;

import java.util.Scanner;

public class mainFurama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            int chooseStarOrEnd = 0;
            System.out.println("We will start the program now! \n" +
                    "1. Start program. \n" +
                    "2.End program.");
            try {
                chooseStarOrEnd = Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("You can't enter Alphabet.");
            }
            if (chooseStarOrEnd == 1) {
                FuramaControllers.displayMainMenu();
            }
            if (chooseStarOrEnd == 2) {
                System.out.println("The Program had ended.");
                System.exit(0);
            } else {
                System.err.println("You can enter number 1 - 2. Input again Please!");
            }

        } while (true);

    }
}
