package ss10_stack_queue.excersie;

import java.util.Scanner;
import java.util.Stack;

public class TestBracket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter here:");
        String inputChar = input.nextLine();
        String[] arr = inputChar.split("");
        Stack<String> bStack = new Stack<>();
        boolean flag = true;
        for (String sym : arr) {
            if (sym.equals("(")) {
                bStack.push(sym);

            } else if (sym.equals(")")) {
                if (bStack.isEmpty()) {
                    flag = false;
                } else {
                    String left = bStack.peek();
                    if (left.equals("(")) {
                        bStack.pop();
                    }
                }
            }
        }
        System.out.println(bStack);
        if (bStack.isEmpty()) {
            flag = true;
        }
        if (flag) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
