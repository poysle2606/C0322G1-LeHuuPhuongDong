package try_To_CRUD.Person;

public class Student  extends Person{
    private double point;

    public Student() {

    }

    public Student(double point) {
        this.point = point;
    }

    public Student(int id, String name, int old, String gender, double point) {
        super(id, name, old, gender);
        this.point = point;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student have name is: " + this.getName() + " ID is: " + this.getId()
                + " old is: " + this.getOld() + " gender is: " + this.getGender()
                + " have point is: " + this.getPoint() ;
    }
}
