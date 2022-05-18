package ss3_Array.Excersie;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of Array 1: ");
        int size = input.nextInt();

        int[] array1 = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Value at index " + i + " of array 1: ");
            array1[i] = input.nextInt();

        }
        System.out.println("Array 1 is: " + Arrays.toString(array1));


        System.out.println("Enter size of Array 2: ");
        int size2 = input.nextInt();
        int[] array2 = new int[size2];
        for (int i = 0; i < size2; i++) {
            System.out.println("Value at index " + i + " of array 2: ");
            array2[i] = input.nextInt();
        }
        System.out.println("Array 2 is: " +Arrays.toString(array2));

        int[] array3 = new int[size + size2];
        for (int i = 0; i < size; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < size2; i++) {
            array3[array1.length + i] = array2[i];

        }
        System.out.println(Arrays.toString(array3));
    }
}
//1 vòng for cũng chạy đc array3??? đk là chạy if else;