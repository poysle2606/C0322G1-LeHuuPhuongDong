package ss19_regex.excersie;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Input number phone to check:");
            String numberPhone = input.nextLine();
            String regexNumberPhone = "^[0-9]{2,}(-0[0-9]{9,}$)";
            boolean checkNumberPhone = Pattern.matches(regexNumberPhone, numberPhone);
            if (checkNumberPhone) {
                System.out.println(numberPhone + " This is a number phone!");
            } else {
                System.out.println(numberPhone + " This is NOT a number phone!");
            }
        } while (true);
    }
}
