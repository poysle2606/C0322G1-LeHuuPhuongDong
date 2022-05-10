package ss4_OOP.Excersie.QuadraticEquation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number A: ");
        double numberA = scanner.nextDouble();
        System.out.println("number B: ");
        double numberB = scanner.nextDouble();
        System.out.println("number C: ");
        double numberC = scanner.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(numberA, numberB, numberC);
        if (equation.getDiscriminant() > 0) {
            System.out.println("Root 1 is: " + equation.getRoot1());
            System.out.println("Root 2 is: " + equation.getRoot2());
        } else if (equation.getDiscriminant() == 0) {
            System.out.println("Root 1 equals root 2 is: " + equation.getRoot1());
        } else {
            System.out.println("The equation has no roots!");
        }
    }
}
