package ss1_Java.Practice;

import java.util.Scanner;

public class Text_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter year: ");
        year = scanner.nextInt();
        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }
        if (isLeapYear) {
            System.out.printf("%d is Leap Year", year);
        } else {
            System.out.printf("%d is Not Leap Year", year);
        }
    }
}
