package ss7_AbstractAndInterface.Excersie.Colorable;

public class Text_Colorable {
    public static void main(String[] args) {
        Shape[] shape1 = new Shape[3];
        shape1[0] = new Circle(10);
        shape1[1] = new Rectangle(5, 8);
        shape1[2] = new Square(10);

        for (Shape shaped : shape1) {
            System.out.println(shaped.toString());
            // toán tử instanceof kiểm tra xem shaped có phải là 1 kiểu dữ
            // liệu của Square hay không
            if (shaped instanceof Square) {
                //ép kiểu shaped sang kiểu Square
                ((Square) shaped).howToColor();
            }
        }

    }
}
