package ss3_Array.Excersie;

import java.util.Arrays;
import java.util.Scanner;

public class TotalDuongCheo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size at height of array:");
        int size1 = input.nextInt();
        System.out.println("Enter size at length of array:");
        int size2 = input.nextInt();
        int [][] numberArray = new int[size1][size2];
        System.out.println("Enter " + numberArray.length + " height and " +
                numberArray[0].length + " length: ");
        for (int row = 0; row < numberArray.length; row++) {
            for (int col = 0; col < numberArray[row].length; col++) {
                numberArray[row][col] = input.nextInt();

            }
        }
        System.out.println(Arrays.deepToString(numberArray));
        int total = 0;
        for (int i = 0;  i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                if (numberArray[i] == numberArray[j]) {
                    total += numberArray[i][j];
                }

            }

        }
        System.out.println(total);
    }
}
