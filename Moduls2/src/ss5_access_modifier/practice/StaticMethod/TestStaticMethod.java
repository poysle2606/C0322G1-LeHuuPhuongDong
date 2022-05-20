package ss5_access_modifier.practice.StaticMethod;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();  // gọi phương thức thay đổi
        Student student1 = new Student(111, " Đông");
        Student student2 = new Student(222, " Tây");
        Student student3 = new Student(333, " Nam");
        Student student4 = new Student(444, " Bắc");

        student1.display();
        student2.display();
        student3.display();
        student4.display();

        Student.chance();
        Student student5 = new Student(555, "Đức");
        student5.display();

    }
}
