package Nhap;

import java.util.Scanner;

public class Tiger{
    public static void main(String[] args) {
        Animals tom = new Animals();
        String name = "Tom";
        int age = 3;
        String color = "Black";

        Animals jerry = new Animals();
        String name1 = "Tom";
        int age1 = 3;
        String color1 = "Black";
        System.out.println(tom.equals(jerry));

    }
}