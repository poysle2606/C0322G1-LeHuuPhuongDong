package Nhap;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Human human = null;
        Scanner input = new Scanner(System.in);
        String action = input.nextLine();
        if (action.equals("Duc")) {
            human = new Duc();
        } else if (action.equals("Dong")) {
            human = new Dong();
        }
        assert human != null;
        human.walk();
    }
}
