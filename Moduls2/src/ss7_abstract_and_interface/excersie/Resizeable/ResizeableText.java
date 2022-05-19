package ss7_AbstractAndInterface.Excersie.Resizeable;

public class ResizeableText {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(10, "Blue", true);
        shapes[1] = new Rectangle(10, 5, " Black", false);
        shapes[2] = new Square("Black", true, 5);
        System.out.println("Area before to change: ");
        for (Shape arr : shapes) {
            System.out.println(arr);
        }
        System.out.println("---------------------");
        System.out.println("Area after to changed: ");
        for (Shape arr2 : shapes) {
            arr2.resize(Math.random() * 100);
            System.out.println(arr2);
        }

    }
}
