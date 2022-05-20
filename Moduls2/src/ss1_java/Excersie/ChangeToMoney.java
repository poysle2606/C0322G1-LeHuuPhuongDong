package ss1_java.Excersie;

import java.util.Scanner;

public class ChangeToMoney {
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
