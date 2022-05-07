package ss3_Array.Excersie;

import java.util.Arrays;
import java.util.Scanner;

public class FindMaxInDoubleArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Length of array: ");
       double length = input.nextDouble();

        System.out.println("Enter height of array: ");
        double height = input.nextDouble();
        double[][] arrayBig = new double[(int) height][(int) length];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < length; j++) {
                System.out.println("Enter index " + i + " " + j);
                arrayBig[i][j] = input.nextDouble();
            }
        }
        double max = arrayBig[0][0];
        System.out.println("Array is: ");
        int x = 0 , y = 0;
        for (int i = 0; i < height ; i++) {
            System.out.print("[");
            for (int j = 0; j < length; j++) {
                System.out.print(arrayBig[i][j] + " " );
                if (arrayBig[i][j] > max ) {
                    max = arrayBig[i][j];
                    x=i;
                    y=j;

                }
            }
            System.out.println("]");
        }
        System.out.println("Max is: " + max +" at position: " + x + "," + y);

    }
}
