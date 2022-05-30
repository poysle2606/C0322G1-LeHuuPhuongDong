package furama_resort.services.packeage_class;

import furama_resort.models.facilitys.Facility;
import furama_resort.models.facilitys.House;
import furama_resort.models.facilitys.Room;
import furama_resort.models.facilitys.Villa;
import furama_resort.services.package_impl.FacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService{
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner input = new Scanner(System.in);
    static {
    }

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> item:
             facilityIntegerMap.entrySet()) {
            System.out.println("Service " + item.getKey() + "\n" +" number standard: " + item.getValue() );
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

    @Override
    public void addNew() {

    }

    @Override
    public void listToUpdate() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Enter name of service:");
        String nameService = input.nextLine();
        System.out.println("Enter area: ");
        double area = Double.parseDouble(input.nextLine());
        System.out.println("Enter price: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("Enter people: ");
        int people = Integer.parseInt(input.nextLine());
        System.out.println("Enter room standard: ");
        String standard  = input.nextLine();
        System.out.println("Enter rental type : ");
        Villa villa = new Villa();
        String rentalType = villa.getRentalType2();
        System.out.println("Area Pool: ");
        int pool = Integer.parseInt(input.nextLine());
        System.out.println("Enter number Floor: ");
        int floor = Integer.parseInt(input.nextLine());
        Villa villa1 = new Villa(nameService, area, price,people,rentalType,standard,pool,floor);
        facilityIntegerMap.put(villa1, 0);
        System.out.println("Add NEW Villa success!");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Enter name of service:");
        String nameService = input.nextLine();
        System.out.println("Enter area: ");
        double area = Double.parseDouble(input.nextLine());
        System.out.println("Enter price: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("Enter people: ");
        int people = Integer.parseInt(input.nextLine());
        System.out.println("Enter room standard: ");
        String standard  = input.nextLine();
        System.out.println("Enter rental type : ");
        House house = new House();
        String rentalType = house.getRentalType2();
        System.out.println("Enter number Floor: ");
        int floor = Integer.parseInt(input.nextLine());
        House house1 = new House(nameService, area, price,people,rentalType,standard,floor);
        facilityIntegerMap.put(house1, 0);
        System.out.println("Add NEW House success!");

    }

    @Override
    public void addNewRoom() {
        System.out.println("Enter name of service:");
        String nameService = input.nextLine();
        System.out.println("Enter area: ");
        double area = Double.parseDouble(input.nextLine());
        System.out.println("Enter price: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("Enter people: ");
        int people = Integer.parseInt(input.nextLine());
        System.out.println("Enter rental type : ");
        Room room = new Room();
        String rentalType = room.getRentalType2();
        System.out.println("Service free: ");
        String service = input.nextLine();
        Room room1 = new Room(nameService, area, price,people,rentalType,service);
        facilityIntegerMap.put(room1, 0);
        System.out.println("Add NEW Room success!");
    }
}
