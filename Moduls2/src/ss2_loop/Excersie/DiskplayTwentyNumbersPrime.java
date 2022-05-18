package ss2_Loop.Excersie;

import java.util.Scanner;

public class DiskplayTwentyNumbersPrime {
    public static void main(String[] args) {
        int numbersInt;
        int count = 0;
        int n = 2;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter long numbers Prime:");
        numbersInt = Integer.parseInt(input.nextLine());
        while (count < numbersInt) {
            boolean check = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n);
                count++;
            }
            n++;
        }

    }
}
