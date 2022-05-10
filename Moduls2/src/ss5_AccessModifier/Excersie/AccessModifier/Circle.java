package ss5_AccessModifier.Excersie.AccessModifier;

public class Circle {
    private double radius = 1.0;
    private String color = " Red";


    public Circle() {

    }
    public Circle(double r, String color) {
        this.radius = r;
        this.color = color;
    }
// getRadius(): double????
    public double getRadius() {
        return radius;
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
        return Math.PI * Math.pow(radius, 2);
    }
}
