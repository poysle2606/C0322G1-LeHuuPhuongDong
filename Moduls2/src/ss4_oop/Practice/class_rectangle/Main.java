package ss4_oop.Practice.ClassRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Height is: ");
        double height = scanner.nextDouble();
        System.out.println("Width is: ");
        double width = scanner.nextDouble();
        ClassRectangle rectangle = new ClassRectangle(width,height);
        System.out.println("Rectangle is: " + rectangle.display());
        System.out.println("Perimeter of Rectangle is: " + rectangle.getPerimeter());
        System.out.println("Area of Rectangle is: " + rectangle.getArea());
    }
}
