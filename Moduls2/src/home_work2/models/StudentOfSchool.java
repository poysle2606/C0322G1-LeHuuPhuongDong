package home_work2.models;

public class StudentOfSchool extends PersonSchool {
    private String codeStudent;
    private double point;

    public StudentOfSchool() {
    }

    public StudentOfSchool(String codeStudent, double point) {
        this.codeStudent = codeStudent;
        this.point = point;
    }

    public StudentOfSchool(int id, String name, String gender, String birthDay, String address, String codeStudent, double point) {
        super(id, name, gender, birthDay, address);
        this.codeStudent = codeStudent;
        this.point = point;
    }

    public String getCodeStudent() {
        return codeStudent;
    }

    public void setCodeStudent(String codeStudent) {
        this.codeStudent = codeStudent;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String inForOfSchool() {
        return String.format("%s,%s,%s,%s,%s,%s,%s",
                super.getId(),
                super.getName(),
                super.getGender(),
                super.getBirthDay(),
                super.getAddress(),
                getCodeStudent(),
                getPoint());
    }

    @Override
    public String toString() {
        return "Học sinh có ID = " +
                super.getId() +
                ", tên là " + super.getName() + ", giới tính là " + super.getGender() +
                ", ngày sinh là " + super.getBirthDay() + ", địa chỉ ở " + super.getAddress() +
                ", mã học sinh " + codeStudent +
                ", điểm = " + point;
    }
}
