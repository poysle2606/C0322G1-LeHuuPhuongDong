package furama_resort.services.packeage_class;

import furama_resort.models.persons.Person;
import furama_resort.services.package_impl.BookingService;

import java.util.*;

public class BookingServiceImpl implements BookingService {
static Scanner input = new Scanner(System.in);
    @Override
    public void display() {
        System.out.println("1.List Customer.\n" +
                "2.List Facility.\n" +
                "Your choose is:");
        int choose = Integer.parseInt(input.nextLine());
        switch (choose) {
            case 1:

        }

    }

    @Override
    public void addPerson() {

    }

    @Override
    public void deletePerson() {

    }

    @Override
    public void updatePerson() {

    }
}
