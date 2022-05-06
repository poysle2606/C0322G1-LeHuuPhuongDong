package ss3_Array.Practice;

import java.util.Scanner;

public class ChangeToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        double cel;
        double fah;
        do {
            System.out.println("Menu:");
            System.out.println("1. Change Fahrenheit to Celsius:");
            System.out.println("2. Change Celsius to Fahrenheit: ");
            System.out.println("3. Exit");
            choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Enter Fahrenheit in here: ");
                    fah = scanner.nextDouble();
                    System.out.println("Fahrenheit to Celsius:" + fahToCel(fah));
                    break;
                case 2:
                    System.out.println("Enter Celsius in here: ");
                    cel = scanner.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + celToFah(cel));
                    break;
                case 3:
                    System.out.println("Exited Programing!");
                    System.exit(0);
            }
        } while (true);
    }

    public static double celToFah(double cel) {
        return (9.0 / 5) * cel + 32;
    }

    public static double fahToCel(double fah) {
        return (5.0 / 9) * (fah - 32);

    }
}
