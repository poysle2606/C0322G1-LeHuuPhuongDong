package home_work2.utils;

import home_work2.models.PersonSchool;

import java.util.Comparator;

public class SoftBirthDay implements Comparator<PersonSchool> {
    @Override
    public int compare(PersonSchool o1, PersonSchool o2) {
        if (o1.getBirthDay().compareTo(o2.getBirthDay()) < 0) {
            return 1;
        } else if (o1.getBirthDay().compareTo(o2.getBirthDay()) > 0) {
            return -1;
        } else {
            if(o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}
