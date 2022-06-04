package furama_resort.services.utils;

import furama_resort.exceptions.*;

import java.util.Scanner;

public class RegexDataFile {
   static Scanner scanner = new Scanner(System.in);

    public static String regexStr(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIdVillaException("Bạn đã nhập sai mã định dạng. Mã định dạng phải là SVVL-YYYY");
                }

            } catch (InvalidIdVillaException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexStr1(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIdHouseException("Bạn đã nhập sai mã định dạng. Mã định dạng phải là SVHO-YYYY");
                }

            } catch (InvalidIdHouseException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexStr2(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIdRoomException("Bạn đã nhập sai mã định dạng. Mã định dạng phải là SVRO-YYYY");
                }

            } catch (InvalidIdRoomException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexStr3(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidStringException("Bạn đã nhập sai mã định dạng. Tên dịch vụ phải viết hoa");
                }

            } catch (InvalidStringException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexStr4(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidAmountException("Bạn đã nhập sai mã định dạng. Số lượng người tối đa phải >0 và nhỏ hơn <20");
                }

            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexStr5(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidIntException("Bạn đã nhập sai mã định dạng. Diện tích phải lớn hơn 30m^2");
                }

            } catch (InvalidIntException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }

    public static String regexStr6(String regex) {
        boolean check = true;
        String temp;
        do {
            temp = scanner.nextLine();
            check = false;
            try {
                if (!temp.matches(regex)) {
                    check = true;
                    throw new InvalidAreaException("Bạn đã nhập sai mã định dạng. Số tầng phải là số nguyên dương");
                }

            } catch (InvalidAreaException e) {
                System.out.println(e.getMessage());
            }
        } while (check);
        return temp;
    }
}
