package training.person;

import java.util.Comparator;

public abstract class Human {
    private String name;
    private String dateBirth;
    private String address;

    public Human() {
    }

    public Human(String name, String dateBirth, String address) {
        this.name = name;
        this.dateBirth = dateBirth;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(String dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return " have name is: " + name +
                ", dateBirth is: " + dateBirth +
                ", address is: " + address;

    }

    public abstract double salary();

}
