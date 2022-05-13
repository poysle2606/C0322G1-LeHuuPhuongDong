package ss6_Iheritance.Excersie.CircleAndCylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder( double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getVolume() {
        return this.getArea() * this.getHeight();
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                " radius= " + getRadius()+
                ", color='" + getColor() + '\'' +
                ", height= " + height +
                '}';
    }
}
