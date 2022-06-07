package home_work2.utils;

import furama_resort.exceptions.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexOfSchool {
    static Scanner input = new Scanner(System.in);

     public static boolean formatStudent(String str) {

        final String VALID_BA = "^[0-9]{8}$";
        Pattern pattern = Pattern.compile(VALID_BA);
        return pattern.matcher(str).matches();
    }

    public static boolean formatPoint(String str) {

        final String VALID_BA = "^[0-9]{8}$";
        Pattern pattern = Pattern.compile(VALID_BA);
        return pattern.matcher(str).matches();
    }

    public static String regexAge1(String temp, String regex) {

        boolean flag = true;

        while (flag) {
            try {

                if (Pattern.matches(regex, temp)) {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    LocalDate age = LocalDate.parse(temp, formatter);

                    LocalDate now = LocalDate.now();

                    int current = Period.between(age, now).getYears();

                    if (current > 18) {
                        flag = false;
                    } else {
                        throw new AgeException("Chưa đủ 18 tuổi. Yêu cầu nhập lại.");
                    }
                } else {
                    throw new AgeException("Bạn nhận sai vui lòng  nhập lại");
                }
            } catch (AgeException e) {

                e.printStackTrace();

                System.err.println(e.getMessage());

                temp = input.nextLine();
            }
        }
        return temp;
    }
}
