package ss7_abstract_and_interface.excersie.Resizeable;

public class SquareTest {
    public static void main(String[] args) {
        Shape shape = new Square(5);
        Shape shape1 = new Square(" Black", false, 10);

        System.out.println(shape);
        System.out.println(shape1);
    }
}
