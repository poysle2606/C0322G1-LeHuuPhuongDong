package ss10_stack_queue.excersie;

import java.util.Scanner;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String strings = input.nextLine();
        char[] word = strings.toLowerCase().toCharArray();
        TreeMap<Character, Integer> map = new TreeMap<>();
        int value;
        for (char words : word) {
            if (map.containsKey(words)) {
                value = map.get(words) + 1;
                map.put(words, value);
            } else {
                value = 1;
                map.put(words, value);
            }
        }
        System.out.println(map);

    }
}
