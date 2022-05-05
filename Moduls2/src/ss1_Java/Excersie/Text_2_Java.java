package ss1_Java.Excersie;

import java.util.Scanner;

public class Text_2_Java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number to change:");
        int number = input.nextInt();
        if (number <= 999 && number > 0) {
            switch (number / 100) {
                case 1:
                    System.out.print(" one hundred");
                    break;
                case 2:
                    System.out.print(" two hundred");
                    break;
                case 3:
                    System.out.print(" three hundred");
                    break;
                case 4:
                    System.out.print(" four hundred");
                    break;
                case 5:
                    System.out.print(" five hundred");
                    break;
                case 6:
                    System.out.print(" six hundred");
                    break;
                case 7:
                    System.out.print(" seven hundred");
                    break;
                case 8:
                    System.out.print(" eight hundred");
                    break;
                case 9:
                    System.out.print(" nine hundred");
                    break;
            }
            switch (((number / 10) * 10) % 100) {
                case 10:
                    System.out.print(" ten");
                    break;
                case 11:
                    System.out.print(" eleven");
                    break;
                case 12:
                    System.out.print(" twelve");
                    break;
                case 13:
                    System.out.print(" thirteen");
                    break;
                case 14:
                    System.out.print(" fourteen");
                    break;
                case 15:
                    System.out.print(" fifteen");
                    break;
                case 16:
                    System.out.print(" sixteen");
                    break;
                case 17:
                    System.out.print(" seventeen");
                    break;
                case 18:
                    System.out.print(" eighteen");
                    break;
                case 19:
                    System.out.print(" nineteen");
                    break;
                case 20:
                    System.out.print(" twenty");
                    break;
                case 30:
                    System.out.print(" thirty");
                    break;
                case 40:
                    System.out.print(" fourty");
                    break;
                case 50:
                    System.out.print(" fifty");
                    break;
                case 60:
                    System.out.print(" sixty");
                    break;
                case 70:
                    System.out.print(" seventy");
                    break;
                case 80:
                    System.out.print(" eighty");
                    break;
                case 90:
                    System.out.print(" ninety");
                    break;

            }
            switch (number % 10) {
                case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println(" two");
                    break;
                case 3:
                    System.out.println(" three");
                    break;
                case 4:
                    System.out.println(" four");
                    break;
                case 5:
                    System.out.println(" five");
                    break;
                case 6:
                    System.out.println(" six");
                    break;
                case 7:
                    System.out.println(" seven");
                    break;
                case 8:
                    System.out.println(" eight");
                    break;
                case 9:
                    System.out.println(" nine");
                    break;
            }
        }
    }
}