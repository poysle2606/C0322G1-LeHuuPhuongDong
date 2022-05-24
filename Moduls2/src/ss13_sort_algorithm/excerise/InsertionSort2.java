package ss13_sort_algorithm.excerise;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = Integer.parseInt(input.nextLine());
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i);
            arr[i] = input.nextInt();
        }
        System.out.println("First arrays is: " + Arrays.toString(arr));

        int hold, numberInsert;
        for (int i = 0; i < arr.length; i++) {
            numberInsert = arr[i];
            hold = i;
            while (hold > 0 && numberInsert < arr[hold - 1]) {
                arr[hold] = arr[hold - 1];
                hold--;
            }
            arr[hold] = numberInsert;

        }
        System.out.println("Arrays after sort is: " + Arrays.toString(arr));
    }
}
