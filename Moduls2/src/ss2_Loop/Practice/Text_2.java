package ss2_Loop.Practice;

import java.util.Scanner;

public class Text_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money");
        double money = scanner.nextDouble();
        System.out.println("Enter month");
        int month = scanner.nextInt();
        System.out.println("Enter interestRate");
        double interestRate = scanner.nextDouble();
        double totalInterest = 0;
        for (int i = 0; i < month; i++) {
            totalInterest += money * (interestRate / 100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);

    }
}
