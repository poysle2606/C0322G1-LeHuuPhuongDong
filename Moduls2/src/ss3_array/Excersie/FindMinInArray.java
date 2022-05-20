package ss3_array.Excersie;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size =scanner.nextInt();
        int[] numberArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Enter element at index: " + i);
            numberArray[i] = scanner.nextInt();

        }
        System.out.println( "Array is: "+ Arrays.toString(numberArray));

        int min = numberArray[0];
        for (int j : numberArray) {
            if (j < min) {
                min = j;
            }

        }
        System.out.println("Min in array is: " + min);
    }
}
