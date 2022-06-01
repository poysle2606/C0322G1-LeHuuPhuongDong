package furama_resort.services.utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexData {
    static Scanner input = new Scanner(System.in);

    public static String regexStr(String temp, String regex, String err) {
        boolean flag = true;
        do {
            if (temp.matches(regex)) {
                flag = false;
            } else {
                System.out.println(err);
                temp = input.nextLine();
            }
        } while (flag);
        return temp;
    }

    public static String regexAge(String temp, String regex) {
        boolean flag = true;
        while (flag) {
            try {
                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
                    LocalDate age = LocalDate.parse(temp, formatter);
                    LocalDate now = LocalDate.now();
                    int current = Period.between(age, now).getYears();
                    if (current > 18 && current < 100) {
                        flag = false;
                    } else {
                        throw new AgeException("Enter age > 18 && < 100");
                    }
                } else {
                    throw new AgeException("You entered it wrong, please re-enter");
                }
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                temp = input.nextLine();
            }
        }
        return temp;
    }
}
