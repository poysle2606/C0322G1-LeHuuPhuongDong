package ss1_Java.Excersie;

import java.util.Scanner;

public class Text_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd = 23000;
        double usd;
        System.out.println("Enter USD to change: ");
        usd = scanner.nextDouble();
        vnd = usd * vnd;
        System.out.println(vnd + " VND");

    }
}
