package Nhap;

import java.util.Scanner;

public class Chicken  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <=  i ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = height; i >= 1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
