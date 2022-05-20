package ss3_array.Practice;

import java.util.Objects;
import java.util.Scanner;

public class FindVariableInArray {
    public static void main(String[] args) {
        String[] name = {"I","See","Forever","In","Your","Eyes"};
        Scanner scanner = new Scanner(System.in);
        String inputName = scanner.nextLine();
        boolean flag = false;
        for (int i = 0; i < name.length; i++) {
            if (Objects.equals(inputName, name[i])){
                System.out.println("I found name " + inputName + " at: " + i);
                flag = true;
                break;
            }

        }
        if (!flag) {
            System.out.println("Sorry! I not found " + inputName + " in Programing");
        }
    }
}
