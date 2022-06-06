package home_work.person;

public class ManagementStaff extends Person {
    private String salary;
    private String coefficientsSalary;    //Hệ số lương;

    public ManagementStaff() {
    }

    public ManagementStaff(String salary, String coefficientsSalary) {
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public ManagementStaff(int id, String codePerson, String name, String birthDay,
                           String address, String salary, String coefficientsSalary) {
        super(id, codePerson, name, birthDay, address);
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(String coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public String inFor() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getCodePerson(),
                super.getName(),
                super.getBirthDay(),
                super.getAddress(),
                getSalary(),
                getCoefficientsSalary());
    }

    @Override
    public String toString() {
        return super.toString() +
                " lương cơ bản = " + salary +
                ", hệ số lương =" + coefficientsSalary;
    }
}
