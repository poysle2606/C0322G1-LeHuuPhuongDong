package home_work.person;

public abstract class Person {
    private int id;
    private String codePerson;
    private String name;
    private String birthDay;
    private String address;

    public Person() {
    }

    public Person(int id, String codePerson, String name, String birthDay, String address) {
        this.id = id;
        this.codePerson = codePerson;
        this.name = name;
        this.birthDay = birthDay;
        this.address = address;
    }

    public abstract String inFor();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCodePerson() {
        return codePerson;
    }

    public void setCodePerson(String codePerson) {
        this.codePerson = codePerson;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Nhân viên có " +
                "ID là: " + id +
                ", mã nhân viên là " + codePerson +
                ", tên nhân viên là " + name +
                ", ngày sinh là " + birthDay +
                ", địa chỉ ở " + address;
    }
}
