package ss10_stack_queue.excersie.demerging;

public class Person {
    private String name;
    private boolean gender;
    private String age;

    public Person() {
    }

    public Person(String name, boolean gender, String age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name is: " + name + ", gender is: " + gender + ", age= " + age + "\n";
    }

}
