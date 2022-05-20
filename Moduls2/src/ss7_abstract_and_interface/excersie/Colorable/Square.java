package ss7_abstract_and_interface.excersie.Colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    @Override
    public String toString() {
        return "Area of Square: " + this.getArea();
    }

    @Override
    public void howToColor() {
        System.out.println("Square color all four sides.");
    }
}
