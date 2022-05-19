package ss4_oop.Practice.ClassRectangle;

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


}
