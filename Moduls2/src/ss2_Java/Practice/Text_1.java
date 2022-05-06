package ss2_Java.Practice;

import java.util.Scanner;

public class Text_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = input.nextInt();
        if ( number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int count = 2;
            boolean check = true;
            while (count < number) {
                if ( number % 2 == 0) {
                    check = false;
                    break;
                }  count++;
            }  if (check)
                System.out.println(number + " is a prime");
            else
                System.out.println(number + " is not a prime");
        }
    }
}
