package ss4_OOP.Excersie.Fan;

import java.util.Scanner;

public class MainOfFan {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3, true, 10," Yellow");
        Fan fan2 = new Fan(2, false, 5, " Blue");
        System.out.println(fan1);
        System.out.println(fan2);
    }
}
