package ss5_access_modifier.excersie.Student;

public class Test {
    public static void main(String[] args) {
        Student myStudent = new Student();
        myStudent.setName(" Đông");
        myStudent.setClassed(" C0322G1");
        System.out.println(myStudent.getName() + myStudent.getClassed());
    }
}
