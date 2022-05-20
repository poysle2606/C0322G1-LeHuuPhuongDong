package ss10_stack_queue.excersie.demerging;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DemergingTest {
    public static void main(String[] args) {
        Queue<Person> nam = new LinkedList<>();
        Queue<Person> nu = new LinkedList<>();
        List<Person> person = new ArrayList<>();
        Person person1 = new Person("John", true, "26/06/1998");
        Person person2 = new Person("Marry", false, "26/06/1998");
        Person person3 = new Person("Jax", true, "26/06/1998");
        Person person4 = new Person("Wendy", false, "26/06/1998");
        Person person5 = new Person("Yasuo", true, "26/06/1998");

        person.add(person1);
        person.add(person2);
        person.add(person3);
        person.add(person4);
        person.add(person5);

        for (Person item : person) {
            if (item.getGender()) {
                nam.add(item);
            } else {
                nu.add(item);
            }
        }
        System.out.println(nam);
        System.out.println(nu);
    }
}
