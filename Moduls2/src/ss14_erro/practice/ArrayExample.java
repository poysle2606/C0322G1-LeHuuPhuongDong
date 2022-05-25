package ss14_erro.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
     public Integer[] createRandom() {
          Random rd = new Random();
          Integer[] integers = new Integer[100];
          System.out.println("Danh sach cua mang: ");
          for (int i = 0; i < integers.length; i++) {
               integers[i] = rd.nextInt(100);
               System.out.println(integers[i] + " ");
          }
          return integers;
     }

     public static void main(String[] args) {
          ArrayExample arrayExample = new ArrayExample();
          Integer[] arr = arrayExample.createRandom();

          Scanner scaner = new Scanner(System.in);
          System.out.println("\nVui lòng nhập chỉ số của một phần tử bất kỳ: ");
          int x = scaner.nextInt();
          try {
               System.out.println("Giá trị của phần tử có chỉ số 5" + x + " là " + arr[x]);
          } catch (IndexOutOfBoundsException e) {
               System.err.println("Chỉ số vượt quá giới hạn của mảng");
          }
     }
}
