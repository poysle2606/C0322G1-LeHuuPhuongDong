package ss7_AbstractAndInterface.Excersie.Colorable;

public class TextSquare {
    public static void main(String[] args) {
        Square shape1 = new Square(10);
        Square shape2 = new Square("Gray", true, 5);

        System.out.println(shape1);
        System.out.println(shape2);
    }
}
