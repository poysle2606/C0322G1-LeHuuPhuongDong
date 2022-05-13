
package Nhap;


import java.util.Scanner;

public class Circle {
double radius = 1.0;
String color = " red";
public Circle () {

}
public Circle (double r) {
    this.radius = r;
}

    public double getRadius( double r) {
        return radius = r;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
    return Math.PI * Math.pow(radius,2);
    }
}



