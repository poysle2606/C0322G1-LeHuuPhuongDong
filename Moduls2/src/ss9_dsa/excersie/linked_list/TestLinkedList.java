package ss9_dsa.Excersie.linked_list;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("le");
        strings.add("huu");
        strings.add("phuong");
        strings.add("dong");

        System.out.println(strings.contains("le"));
        System.out.println(strings.get(3));
    }
}
