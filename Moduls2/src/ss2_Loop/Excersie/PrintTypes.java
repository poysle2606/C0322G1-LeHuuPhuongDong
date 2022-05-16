package ss2_Loop.Excersie;

import java.util.Scanner;

public class PrintTypes {
    public static void main(String[] args) {
        int choose = 1;
        while (true) {
            Scanner inputChoose = new Scanner(System.in);
            System.out.println("MENU:");
            System.out.println("1. Print the rectangle (In hình chữ nhật):");
            System.out.println("2. Print the square triangle (In hình tam giác vuông):");
            System.out.println("3. Print isosceles triangle (In hình tam giác vuông cân):");
            System.out.println("0. Exit programing:");
            choose = inputChoose.nextInt();
            switch (choose) {
                case 1: //vẽ hình chữ nhật;
                    System.out.println("Input height:");
                    int height = inputChoose.nextInt();
                    System.out.println("Input weight");
                    int weight = inputChoose.nextInt();
                    for (int i = 0; i < height; i++) {
                        for (int j = 0; j < weight; j++) {
                            System.out.print(" * ");

                        }
                        System.out.println(" ");
                    }
                    System.out.println("This is a The Rectangle");
                    break;
                case 2:
                    //vẽ hình tam giác vuông cân;
                    System.out.println("Enter Length:");
                    int length = inputChoose.nextInt();
                    for (int i = 1; i <= length; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");

                        }
                        System.out.println(" ");
                    }
                    System.out.println("\n-------\n");
                    //vẽ tam giác vuông cân ngược;
                    for (int i = length; i >= 1; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println(" ");
                    }
                    for (int i = 0; i < length; i++) {
                        for (int j = i; j <length ; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 0; k <= i ; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println("   ");
                    }
                    System.out.println("\n-------\n");
                    for (int i = 0; i < length; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("   ");
                        }
                        for (int j = i; j <5 ; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("   ");
                    }
                    break; 
                case 3:
                    //Tam giác vuông cân.
                    System.out.println("Enter height: ");
                    int hight = inputChoose.nextInt();
                    for (int i = 1; i <= hight; i++) {
                        for (int j = hight; j > i; j--) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= i * 2 - 1; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println("   ");
                    }
                    break;
                case 0:
                    System.out.println("Programing is close!");
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }

        }
    }
}
