package ss3_Array.Excersie;

import java.util.Arrays;
import java.util.Scanner;

public class CountString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of string:");
        String str = scanner.nextLine();
        char[] str1 = str.toCharArray();

      // System.out.println(Arrays.toString(str1));
        //hàm to chararay chuyển chuỗi thành mảng;

        System.out.println("Enter word to find: ");
        String word = scanner.nextLine();
        char[] word1 = word.toCharArray();

        int count = 0;
        for (int i = 0; i < str1.length; i++) {
            if(word1[0] == str1[i]) {
                count++;
            }

        }
        System.out.println(word + " xuat hien " + count + " lan");
    }
}
