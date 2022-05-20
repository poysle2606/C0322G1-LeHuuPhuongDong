package ss5_access_modifier.excersie.AccessModifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(10, " RED");
//        circle1.setRadius(10);
//        circle1.setColor(" Black");
        System.out.print("Đối tượng 0 có tham số :");
        System.out.println(" Bán kính là :" + circle.getRadius() + " và Diện tích là: " + circle.getArea());
        System.out.print("Đối tượng có 1 tham số: ");
        System.out.println("Bán kính là: " + circle1.getRadius() + " và Diện tích là: " + circle1.getArea());
        System.out.print("Đối tượng có 2 tham số: ");
        System.out.println("Bán kính là" + circle2.getRadius() + " màu sắc là" + circle2.getColor() + " và Diện tích là: " + circle2.getArea());
    }
}
          //Em tạo thêm constructor để hiểu hơn về nó.
