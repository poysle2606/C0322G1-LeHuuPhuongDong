package furama_resort.models.persons;

public abstract class Person {
    private int code;
    private String name;
    private int old;
    private String gender;
    private int id;
    private int numberPhone;
    private String email;

    public Person() {

    }

    public Person(int code,String name, int old, String gender, int id, int numberPhone, String email) {
        this.code = code;
        this.name = name;
        this.old = old;
        this.gender = gender;
        this.id = id;
        this.numberPhone = numberPhone;
        this.email = email;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getOld() {
        return old;
    }

    public void setOld(int old) {
        this.old = old;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(int numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "code= " + code +
                "name='" + name + '\'' +
                ", old=" + old +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", numberPhone=" + numberPhone +
                ", email is: " + email +
                '}';
    }
}
