package furama_resort.services.utils;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Scanner;

public class RegexExceptions {
    private static final String REGEX_ID = "^SVVL[-][0-9]{4}$";
    private static final String REGEX_ROOM = "^SVRO[-][0-9]{4}$";
    private static final String REGEX_HOUSE = "^SVHO[-][0-9]{4}$";
    private static final String REGEX_NAME = "^[A-Z][a-z]{0,5}$";
    private static final String REGEX_AREA = "^[0-9]{2}+$";
    private static final String REGEX_AMOUNT = "^[0-9]+$";
    private static final String REGEX_PEOPLE = "^(([1-9])|(20))$";
    private static final String REGEX_AGE = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)" +
            "(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:" +
            "(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^" +
            "(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
    private static Scanner input = new Scanner(System.in);

    public static String idHouse() {
        System.out.println("Enter ID of service:");
        return RegexData.regexStr(input.nextLine(), REGEX_HOUSE, "You must enter the Form SVHO-YYYY. \n" +
                " YYYY has number 0-9. ");
    }

    public static String idRoom() {
        System.out.println("Enter ID of service:");
        return RegexData.regexStr(input.nextLine(), REGEX_ROOM, "You must enter the Form SVRO-YYYY. \n" +
                " YYYY has number 0-9. ");
    }

    public static String regexId() {
        System.out.println("Enter ID of service:");
        return RegexData.regexStr(input.nextLine(), REGEX_ID, "You must enter the Form SVVL-YYYY. \n" +
                " YYYY has number 0-9. ");
    }

    public static String regexName() {
        System.out.println("Name of service: ");
        return RegexData.regexStr(input.nextLine(), REGEX_NAME, "\n" +
                "Name service must capitalize the first character," +
                " the following characters are normal characters");

    }

    public static String regexArea() {
        System.out.println("Enter area Pool: ");
        return RegexData.regexStr(input.nextLine(), REGEX_AREA, " \n" +
                "Pool area must be more than 30 m^2. ");
    }

    public static String regexAmount() {
        System.out.println("Enter price: ");
        return RegexData.regexStr(input.nextLine(), REGEX_AMOUNT,
                "Only positive Integers can be entered");
    }

    public static String regexPeople() {
        System.out.println("Enter max People: ");
        return RegexData.regexStr(input.nextLine(), REGEX_PEOPLE, "Enter < 20 People.");
    }

    public static String regexRoomStandard() {
        System.out.println("Enter room standard: ");
        return RegexData.regexStr(input.nextLine(), REGEX_NAME, "\n" +
                "Standard room must capitalize the first character," +
                " the following characters are normal characters");
    }

    public static String regexFloor() {
        System.out.println("Enter number Floor: ");
        return RegexData.regexStr(input.nextLine(), REGEX_AMOUNT,
                "Only positive Integers can be entered");
    }

}
