package ss6_Iheritance.Excersie.CircleAndCylinder;

public class MainOfCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle = new Circle(5, " Blue");
        System.out.println( circle.toString() +  " Have Area is: "+circle.getArea());
        Cylinder cylinder = new Cylinder(15,10," Red");
        System.out.println(cylinder.toString() + " Have Volume is: " + cylinder.getVolume());
    }
}
