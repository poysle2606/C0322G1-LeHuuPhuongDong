package ss7_AbstractAndInterface.Excersie.Resizeable;

public class Square extends Shape implements Resizeable {
    private double size;

    public Square(double size) {
        this.size = size;
    }

    public Square(String color, boolean filled, double size) {
        super(color, filled);
        this.size = size;
    }

    public int getSize() {
        return (int) size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public double getArea() {
        return this.size * this.size;
    }

    @Override
    public String toString() {
        return "Area of Square is: " + this.getArea();
    }

    @Override
    public void resize(double percent) {
        this.size = size * percent;
    }
}
