package ss3_Array.Practice;

import java.util.Scanner;

public class SoftToNumber {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size of Array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while (size > 20);
        arr = new int[size];
        int i = 0;
        while ( i < arr.length) {
            System.out.println("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Element in array: ");
        for (int k : arr) {
            System.out.print(k + "\t");
            // \t để tạo ta khoảng trắng giữa các giá trị trong mảng Ex: 2  3 ;
        }
        for (int j = 0; j < arr.length /2; j++) {
            int hold = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = hold;
        }
        System.out.println("Reverse array is: ");
        for (int k : arr) {
            System.out.print(k + "\t");

        }
    }
}