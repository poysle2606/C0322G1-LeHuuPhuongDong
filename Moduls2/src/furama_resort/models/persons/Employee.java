package furama_resort.models.persons;

public class Employee extends Person {
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    @Override
    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,%s",
                super.getCode(),
                super.getName(),
                super.getOld(),
                super.getGender(),
                super.getId(),
                super.getNumberPhone(),
                super.getEmail(),
                getLevel(),
                getPosition(),
                getSalary());
    }

    public Employee(String level, String position, int salary) {
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public Employee(int code, String name, String old, String gender, int id, long numberPhone,
                    String email, String level, String position, int salary) {
        super(code, name, old, gender, id, numberPhone, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee have " +
                super.toString() +
                " level is: " + this.getLevel() +
                ", position is: " + this.getPosition() +
                ", salary= " + this.getSalary();

    }
}
