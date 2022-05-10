package ss4_OOP.Practice;

import java.util.Scanner;

public class ClassRectangle {
    double width, height;
    public ClassRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    } public double getArea() {
        return this.width * this.height;
    } public double getPerimeter() {
        return (this.height + this.width) * 2;
    }
    public String display() {
        return "Rectangle: " + "width= " + width + " height= " + height;
    }

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
