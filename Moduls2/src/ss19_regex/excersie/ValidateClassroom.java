package ss19_regex.excersie;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassroom {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input name of class to check!");
            String nameClass = input.nextLine();
            String regexNameClass = "^[C | A | P][0-9]{4,}[G | H | K | L | M | I]$";
            boolean checkName = Pattern.matches(regexNameClass, nameClass);
            if (checkName) {
                System.out.println(nameClass + " it's class name.");
            } else {
                System.out.println(nameClass + " NOT it's class name.");
            }
        } while (true);
    }
}
