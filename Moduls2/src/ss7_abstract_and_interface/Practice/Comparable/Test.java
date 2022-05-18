package ss7_AbstractAndInterface.Practice.Comparable;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        ComparableCircle[] comparable = new ComparableCircle[3];
        comparable[0] = new ComparableCircle(3.5);
        comparable[1] = new ComparableCircle();
        comparable[2] = new ComparableCircle(5," Red ", false);

        System.out.println("Pre-sorted:");
        for (ComparableCircle circle : comparable) {
            System.out.println(circle);
        }

        Arrays.sort(comparable);

        System.out.println("After-sorted:");
        for (ComparableCircle circle : comparable) {
            System.out.println(circle);
        }
    }
}
