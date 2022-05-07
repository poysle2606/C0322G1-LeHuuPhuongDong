package ss2_Loop.Excersie;

import java.util.Scanner;

public class DisplayPrimeSmaller100 {
    public static void main(String[] args) {
        int numbersInterger;
        int count = 0;
        int n = 2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter long numbers Prime:");
        numbersInterger = Integer.parseInt(input.nextLine());
        while (count < numbersInterger) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                if ( n < 100) {
                    System.out.println(n);
                    count++;
                }
            }
            n++;
        }

    }
}
