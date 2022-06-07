package home_work2.models;

public class TeacherOfSchool extends PersonSchool {
    private String classroom;
    private double salary;
    private int hours;

    public TeacherOfSchool() {
    }

    public TeacherOfSchool(String classroom, double salary, int hours) {
        this.classroom = classroom;
        this.salary = salary;
        this.hours = hours;
    }

    public TeacherOfSchool(int id, String name, String gender, String birthDay, String address, String classroom, double salary, int hours) {
        super(id, name, gender, birthDay, address);
        this.classroom = classroom;
        this.salary = salary;
        this.hours = hours;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public String inForOfSchool() {
        return String.format("%s,%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getName(),
                super.getGender(),
                super.getBirthDay(),
                super.getAddress(),
                getClassroom(),
                getSalary(),
                getHours());
    }

    @Override
    public String toString() {
        return "Giáo viên có ID = " +
                super.getId() +
                ", tên là " + super.getName() + ", giới tính là " + super.getGender() +
                ", ngày sinh là " + super.getBirthDay() + ", địa chỉ ở " + super.getAddress() +
                ", lớp dạy " + classroom +
                ", lương = " + salary +
                ", giờ dạy trong tháng " + hours;
    }
}
