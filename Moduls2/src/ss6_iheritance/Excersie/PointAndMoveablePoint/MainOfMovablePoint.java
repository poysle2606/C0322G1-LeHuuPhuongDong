package ss6_Iheritance.Excersie.PointAndMoveablePoint;

public class MainOfMovablePoint {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint();
        System.out.println(point);

        MovablePoint point1 = new MovablePoint(3, 4, 5, 6);
        System.out.println(point1);
        System.out.println(point1.move());
    }
}
