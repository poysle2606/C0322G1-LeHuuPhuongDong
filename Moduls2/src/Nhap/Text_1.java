package Nhap;

import java.util.Arrays;
import java.util.Scanner;

public class Text_1 {
    public static void main(String[] args) {
        do {
            int[] numberArray = {3, 4, 4, 4, 4, 7, 8, 2, 4, 5, 7, 1};
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number X to delete");
            int numberX = scanner.nextInt();
            int index = numberArray.length - 1;
            boolean flag = true;
            for (int i = 0; i < numberArray.length; i++) {
                if (numberX == numberArray[i]) {
                    for (int j = i; j < numberArray.length - 1; j++) {
                        numberArray[j] = numberArray[j + 1];
                        flag = false;
                    }
                    numberArray[index] = 0;
                    i--;
                }

            }
            if (flag) {
                System.out.println("Not found X to delete");

            }
            System.out.println(Arrays.toString(numberArray));

        } while (true);
    }
}
