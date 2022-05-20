package ss3_array.Excersie;

import java.util.Arrays;
import java.util.Scanner;

public class TotalAtCol {
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
        System.out.println("ban muon tinh tong cot bao nhieu: ");
        int col = input.nextInt();
        for (int i = 0; i < size1; i++) {
            total += numberArray[i][col];

        }
        System.out.println(total);
    }
}
