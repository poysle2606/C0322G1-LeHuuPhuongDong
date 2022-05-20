package ss9_dsa.practice.SimpleList;

public class TestMyList {
    public static void main(String[] args) {
        Mylist listInteger = new Mylist<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));

    }
}
