package ss1_Java.Practice;

import java.util.Scanner;

public class Text_4 {
    //giải phương trình bậc nhất
    public static void main(String[] args) {
        System.out.println("Linear Equation Resolver");
        System.out.println("Given a equation as 'a * x + b = c', please enter constants:");
        Scanner scanner = new Scanner(System.in); // lấy dữ liệu nhập từ bàn phím;

        System.out.println("a: ");
        double a = scanner.nextDouble();
        //double là kiểu số thực 8 byte;

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();
        if (a != 0) {
            double myAnswer = (c - b) / a;
            System.out.printf("Equation pass with x = %f!\n", myAnswer);
        } else {
            if (b == c) {
                System.out.print("The solution is all x!");
            } else {
                System.out.print("No solution!");
            }
        }
    }
}
