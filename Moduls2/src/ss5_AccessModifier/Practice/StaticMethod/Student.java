package ss5_AccessModifier.Practice.StaticMethod;

public class Student {
    private final int rollno;
    private final String name;
    private static String college = "BBDIT";

    //khởi tạo giá trị cho constructor;
    Student(int r, String n) {
       rollno = r;
       name = n;

    }
    //thay đổi phương thức tĩnh thành giá trị biến tĩnh
    static void change() {
        college = " có người yêu";
    }
    static void chance() {
        college = " khong co nguoi yeu";
    }

    //phương thức hiển thị giá trị
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
