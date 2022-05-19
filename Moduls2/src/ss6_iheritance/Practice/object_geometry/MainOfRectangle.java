package ss6_iheritance.Practice.ObjectGeometry;

public class MainOfRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Rectangle rectangle1 = new Rectangle(3,5);
        Rectangle rectangle2 = new Rectangle(5,7 ," Pink", true);

        System.out.println(rectangle);
        System.out.println(rectangle1);
        System.out.println(rectangle2);
    }
}
