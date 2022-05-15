package TryToCRUD.Person;

public abstract class Person {
    private int id;
    private String name;
    private int old;
    private String gender;

    public Person() {

    }

    public Person(int id, String name, int old, String gender) {
        this.id = id;
        this.name = name;
        this.old = old;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

}
