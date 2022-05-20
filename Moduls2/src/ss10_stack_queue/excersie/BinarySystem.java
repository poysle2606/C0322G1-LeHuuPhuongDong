package ss10_stack_queue.excersie;

import java.util.Scanner;
import java.util.Stack;

public class BinarySystem {
    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        Stack<Integer> numberStack = new Stack<>();
        System.out.println("Enter number to change: ");
        int number = Integer.parseInt(inputNumber.nextLine());
        while (number != 0) {
            int hold = number % 2;
            numberStack.push(hold);
            number = number / 2;
        }
        System.out.println(numberStack);
    }
}