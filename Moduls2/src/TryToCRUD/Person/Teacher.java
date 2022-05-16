package TryToCRUD.Person;

public class Teacher extends Person{
    private double salary;

    public Teacher(){

    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(int id, String name, int old, String gender, double salary) {
        super(id, name, old, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher have name is: " + this.getName() + " ID is: " + this.getId()
                + " age is: " + this.getOld() + " gender is " + this.getGender()
                + " salary is: " + this.getSalary();
    }
}
