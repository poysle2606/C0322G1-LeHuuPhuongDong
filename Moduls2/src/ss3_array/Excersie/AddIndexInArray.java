package ss3_array.Excersie;

import java.util.Arrays;
import java.util.Scanner;

public class AddIndexInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        do {
            int[] numberArray = {3, 5, 7, 1, 2, 0};
            System.out.println("Enter number X: ");
            int numberX = scanner.nextInt();
            System.out.println("Enter index of X: ");
            int indexX = scanner.nextInt();
            if (indexX <= -1 || indexX >= numberArray.length - 1) {
                System.out.println("Don't add element");
            } else {
                for (int i = numberArray.length-1; i > indexX ; i--) {
                    numberArray[i] = numberArray[i - 1];
                    
                } numberArray[indexX] = numberX;
                System.out.println(Arrays.toString(numberArray));
            }
        } while (true);

    }
}
