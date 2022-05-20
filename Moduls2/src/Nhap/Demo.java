package Nhap;

import java.util.Arrays;
import java.util.Stack;

public class Demo {
    public static void main(String[] args) {
        Stack<Integer> number = new Stack<>();
        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            number.push(arr[i]);
            number.pop();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length -1; i >= 0; i--) {

            number.push(arr[i]);
        }
        System.out.println(number);
    }
}
