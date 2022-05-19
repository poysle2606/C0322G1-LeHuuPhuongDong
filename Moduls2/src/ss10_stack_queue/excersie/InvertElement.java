package ss10_stack_queue.excersie;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class InvertElement {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] arr = new int[5];
        //này em cho i tự động tăng chứ không cho nhập vào :D.
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        for (int j : arr) {
            stack.push(j);
            stack.pop();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            stack.push(arr[i]);
        }
        System.out.println(stack);

        Stack<Character> strings = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter here: ");
        String words = scanner.nextLine();
        char[] word = words.toCharArray();
        for (char str : word) {
            strings.push(str);
            strings.pop();
        }
        for (int i = word.length - 1; i >= 0; i--) {
            strings.push(word[i]);
        }
        System.out.println(strings);

    }
}
