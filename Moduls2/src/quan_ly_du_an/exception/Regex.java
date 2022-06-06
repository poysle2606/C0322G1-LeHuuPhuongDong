package quan_ly_du_an.exception;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    public static boolean formatBa(String str) {
        final String VALID_BA = "^BA-[0-9]{4}$";
        Pattern pattern = Pattern.compile(VALID_BA);
        return pattern.matcher(str).matches();

    }

    public static boolean formatBn(String str) {
        final String VALID_BA = "^BN-[0-9]{4}$";
        Pattern pattern = Pattern.compile(VALID_BA);
        return pattern.matcher(str).matches();

    }

    public static boolean formatDay(String str) {
        final String VALID_BA = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";
        Pattern pattern = Pattern.compile(VALID_BA);
        return pattern.matcher(str).matches();

    }



}
