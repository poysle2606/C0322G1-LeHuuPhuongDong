package ss2_loop.Practice;

import java.util.Scanner;

public class Text_4 {
    public static void main(String[] args) {
        int choose = 1;
        while (choose != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("1. Draw the triangle");
            System.out.println("2. Draw the square");
            System.out.println("3. Draw the rectangle");
            System.out.println("0. Exit: ");
            System.out.println("Your choose is: ");
             choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Draw the triangle");
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("Draw the square");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 3:
                    System.out.println("Draw the rectangle");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    System.out.println("* * * * * *");
                    break;
                case 0:
                    System.out.println("Programing is close!");
                    System.exit(0);
                    // System.exit(0) đóng vai trò như lời giải thích lý do dừng chương trình ngay lập tức.
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
