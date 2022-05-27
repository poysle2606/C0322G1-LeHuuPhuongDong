package ss10_stack_queue.excersie;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class RingLink {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = input.nextLine();
        char[] word = str.toCharArray();
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char words : word) {
            queue.add(words);
            stack.push(words);
        }
        boolean flag = true;
        while (!(stack.isEmpty() && queue.isEmpty())) {
            if (stack.pop().equals(queue.poll())) {
                System.out.println(stack);
                System.out.println(queue);
                flag = false;
            } else {
                System.out.println(stack);
                System.out.println(queue);
                flag = true;
            }
        }
        if (flag){
            System.out.println("Not true");
        }
        else {
            System.out.println("This is palindrome");
        }
    }
}
