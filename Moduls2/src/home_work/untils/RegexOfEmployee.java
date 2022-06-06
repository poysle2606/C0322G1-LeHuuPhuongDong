package home_work.untils;

import furama_resort.exceptions.AgeException;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexOfEmployee {
    static Scanner input = new Scanner(System.in);

    public static boolean formatStaff(String str) {

        final String VALID_BA = "^STAFF-[0-9]{4}$";

        Pattern pattern = Pattern.compile(VALID_BA);

        return pattern.matcher(str).matches();

    }

    public static boolean formatProduct(String str) {

        final String VALID_BA = "^PRODUCT-[0-9]{4}$";

        Pattern pattern = Pattern.compile(VALID_BA);

        return pattern.matcher(str).matches();

    }

    public static boolean formatDay(String str) {

        final String VALID_BA = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

        Pattern pattern = Pattern.compile(VALID_BA);

        return pattern.matcher(str).matches();

    }

    public static boolean formatPositive(String str) {

        final String VALID_BA = "^[0-9]{0,8}$";

        Pattern pattern = Pattern.compile(VALID_BA);

        return pattern.matcher(str).matches();

    }

    public static boolean formatPositiveSalary(String str) {

        final String VALID_BA = "^[0-5](.)[0-9]$";

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
                        throw new AgeException("Nhân viên chưa đủ 18 tuổi.");
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
