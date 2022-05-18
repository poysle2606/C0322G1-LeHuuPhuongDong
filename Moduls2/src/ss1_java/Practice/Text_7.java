package ss1_Java.Practice;

import java.util.Scanner;

public class Text_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Enter your Weight: ");
        weight = scanner.nextDouble();
        System.out.println("Enter your Height: ");
        height = scanner.nextDouble();
        bmi = weight / Math.pow(height, 2);

        //Math.pow hàm tính mũ height là số cơ sở, 2 là số mũ;

        if (bmi < 18.5) {
            System.out.println("UnderWeight");
        } else if (bmi >= 18.5 && bmi <= 25) {
            System.out.println("Nomal");
        } else if (bmi > 25 && bmi <= 30) {
            System.out.println("OverWeight");
        } else {
            System.out.println("Obese");
        }
        System.out.printf("%-3.2f is your BMI", bmi);

        //kiểu Double nên ta %f để nhận đc giá trị của bmi;
    }
}
