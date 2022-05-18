package furama_resort.models;

public abstract class Person {
    private String name;
    private int old;
    private String gender;
    private int id;
    private int numberPhone;

    public Person() {

    }

    public Person(String name, int old, String gender, int id, int numberPhone) {
        this.name = name;
        this.old = old;
        this.gender = gender;
        this.id = id;
        this.numberPhone = numberPhone;
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
                "name='" + name + '\'' +
                ", old=" + old +
                ", gender='" + gender + '\'' +
                ", id=" + id +
                ", numberPhone=" + numberPhone +
                '}';
    }
}
