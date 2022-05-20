package ss3_array.Practice;

import java.util.Scanner;

public class FindMaxInArray {
    public static void main(String[] args) {
        int[] arrMax;
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter size in Array: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size is Max you can input again!");
            }
        } while (size > 20);
        arrMax = new int[size];
        for (int i = 0; i < arrMax.length; i++) {
            System.out.println("Element at " + (i+1) + ": ");
            arrMax[i] = scanner.nextInt();
        }
        System.out.println("Element in Array: ");
      for ( int k : arrMax){
          System.out.print(k + " ");
      }
      int max = arrMax[0];
      int index = 0;
        for (int j : arrMax) {
            if (j > max) {
                max = j;
                index++;
            }
        }
        System.out.println("Max is: " + max + " at position: " + index);
    }
}