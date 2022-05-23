package training.services.class_services;

import training.person.Human;

import java.util.Comparator;

public class ComparatorSalary implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        if (o1.salary() > o2.salary()) {
            return 1;
        } else if (o1.salary() < o2.salary()) {
            return -1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
