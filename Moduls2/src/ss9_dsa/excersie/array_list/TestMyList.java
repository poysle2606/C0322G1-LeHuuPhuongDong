package ss9_dsa.excersie.array_list;

public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> arrayList = new MyList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        //remove() lấy và xóa đi giá trị ở(index).
        System.out.println(arrayList.remove(2));

        System.out.println(arrayList.get(2));

        System.out.println(arrayList.indexOf(2));
    }
}