package ss6_Iheritance.Practice.ObjectGeometry;

public class MainOfCircle {
    public static void main(String[] args) {
        Circle circle = new Circle();

        //vì kế thừa hai thuộc tính kia của lớp cha
        //nên chỉ có radius thay đổi còn hai cái kia vẫn giữ nguyên.
        Circle circle1 = new Circle(10);
        Circle circle2 = new Circle(5," Gray", false);
        System.out.println(circle);
        System.out.println(circle1);
        System.out.println(circle2)
        ;
    }

}
