package training.person;

import training.services.impl.TimeKeeping;

public class ManagementStaff extends Human implements TimeKeeping {
    private long salary;
    private double coefficientsSalary; //hệ số lương.

    public ManagementStaff() {
    }

    public ManagementStaff(long salary, double coefficientsSalary) {
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public ManagementStaff(String name, String dateBirth, String address,
                           long salary, double coefficientsSalary) {
        super(name, dateBirth, address);
        this.salary = salary;
        this.coefficientsSalary = coefficientsSalary;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public double getCoefficientsSalary() {
        return coefficientsSalary;
    }

    public void setCoefficientsSalary(double coefficientsSalary) {
        this.coefficientsSalary = coefficientsSalary;
    }

    @Override
    public String toString() {
        return "ManagementStaff" + super.toString() +
                " simple Salary = " + salary +
                ", coefficientsSalary= " + coefficientsSalary +
                " Salary = " + salary();
    }

    @Override
    public double salary() {
        return salary * coefficientsSalary;
    }

    @Override
    public void timeKeeping() {
        System.out.println("I have timed.");
    }
}
