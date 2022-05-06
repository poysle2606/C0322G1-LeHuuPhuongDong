package ss2_Java.Practice;

import java.util.Scanner;

public class Text_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number a: ");
        int a = input.nextInt();
        System.out.println("Enter number b: ");
        int b = input.nextInt();
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        //hàm Math.abs (giá trị tuyệt đối) để chuyển số thành số dương.
        a = Math.abs(a);
        b = Math.abs(b);
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
            System.out.println("Greatest common factor: " + a);
        }
    }
}
