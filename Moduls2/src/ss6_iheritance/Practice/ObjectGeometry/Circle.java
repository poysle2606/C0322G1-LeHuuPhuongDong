package ss6_Iheritance.Practice.ObjectGeometry;

public class Circle extends Shape {
    private double radius = 1.0;
    public Circle() {

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        //supper để gọi các thuộc tính constructor ở lớp cha.
        super(color,filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return getRadius() * getRadius() * Math.PI;
    }

    public double getPerimeter() {
        return getRadius() * 2 * Math.PI;
    }

    @Override
    public String toString() {
        return " A Circle with radius = "
                 + radius
                + " which is a subclass of "

                // Kết quả thực thi từ phương thức toString của lớp cha
                + super.toString() ;
    }
}
