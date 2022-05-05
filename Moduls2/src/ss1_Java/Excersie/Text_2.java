package ss1_Java.Excersie;

import java.util.Scanner;

public class Text_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What are you asking number? ");
        int number = scanner.nextInt();
        if (number < 10 && number > 0) {
            switch (number) {
                case 1:
                    System.out.print(" one");
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
                default:
                    System.out.println("out of ability");
            }
        }
        if (number >= 10 && number < 20) {
            switch (number) {
                case 10:
                    System.out.println(" ten");
                    break;
                case 11:
                    System.out.println(" eleven");
                    break;
                case 12:
                    System.out.println(" twelve");
                    break;
                case 13:
                    System.out.println(" thirteen");
                    break;
                case 14:
                    System.out.println(" fourteen");
                    break;
                case 15:
                    System.out.println(" fifteen");
                    break;
                case 16:
                    System.out.println(" sixteen");
                    break;
                case 17:
                    System.out.println(" seventeen");
                    break;
                case 18:
                    System.out.println(" eighteen");
                    break;
                case 19:
                    System.out.println(" nineteen");
                    break;
            }
      }
        if (number >= 20 && number < 100) {
            switch (number / 10) {
                case 2:
                    System.out.print(" twenty");
                    break;

                case 3:
                    System.out.print(" thirty");
                    break;
                case 4:
                    System.out.print(" fourty");
                    break;
                case 5:
                    System.out.print(" fifty");
                    break;
                case 6:
                    System.out.print(" sixty");
                    break;
                case 7:
                    System.out.print(" seventy");
                    break;
                case 8:
                    System.out.print(" eighty");
                    break;
                case 9:
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
        if (number <= 999 && number > 0) {
            switch (number / 100) {
                case 1:
                    System.out.println(" One hundred");
                    break;
                case 2:
                    System.out.println(" Two hundred");
                    break;
                case 3:
                    System.out.println(" Three hundred");
                    break;
                case 4:
                    System.out.println(" Four hundred");
                    break;
                case 5:
                    System.out.println(" Five  hundred");
                    break;
                case 6:
                    System.out.println(" Six hundred");
                    break;
                case 7:
                    System.out.println(" Seven hundred");
                    break;
                case 8:
                    System.out.println(" Eight hundred");
                    break;
                case 9:
                    System.out.println(" Nine hundred");
                    break;
            }
            switch (((number / 10)) % 10) {
                case 2:
                    System.out.print(" twenty");
                    break;

                case 3:
                    System.out.print(" thirteen");
                    break;
                case 4:
                    System.out.print(" fourteen");
                    break;
                case 5:
                    System.out.print(" fifteen");
                    break;
                case 6:
                    System.out.print(" sixteen");
                    break;
                case 7:
                    System.out.print(" seventeen");
                    break;
                case 8:
                    System.out.print(" eighteen");
                    break;
                case 9:
                    System.out.print(" nineteen");
                    break;
            }
                switch (number / 10) {
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
