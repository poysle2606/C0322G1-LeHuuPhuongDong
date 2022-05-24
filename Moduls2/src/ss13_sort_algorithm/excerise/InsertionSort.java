package ss13_sort_algorithm.excerise;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {22, 43, 11, 2, 7, 6, 43, 12};
        int hold, numberInsert;
        for (int i = 0; i < arr.length; i++) {
            numberInsert = arr[i];
            hold = i;
            while (hold > 0 && numberInsert < arr[hold - 1]) {
                arr[hold] = arr[hold - 1];
                hold--;
            }
            arr[hold] = numberInsert;
            System.out.println(Arrays.toString(arr));
        }
    }
}
