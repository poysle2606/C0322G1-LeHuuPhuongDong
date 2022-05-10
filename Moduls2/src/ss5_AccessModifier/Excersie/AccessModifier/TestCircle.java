package ss5_AccessModifier.Excersie.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
//        circle1.setRadius(10);
//        circle1.setColor(" Black");
        System.out.println(circle1.getArea() + circle1.getColor() + " Have radius is: " + circle1.getRadius());
    }
}
