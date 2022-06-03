package furama_resort.services.packeage_class;

import furama_resort.models.facilitys.Facility;
import furama_resort.models.facilitys.House;
import furama_resort.models.facilitys.Room;
import furama_resort.models.facilitys.Villa;
import furama_resort.services.utils.ReadAndWrite;
import furama_resort.services.utils.RegexExceptions;
import furama_resort.services.package_impl.FacilityService;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

    static Scanner input = new Scanner(System.in);

    private static final String LINK_VILLA = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\villa.csv";
    private static final String LINK_HOUSE = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\house.csv";
    private static final String LINK_ROOM = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\room.csv";

    @Override
    public void display() {
        facilityIntegerMap.clear();

        readVilla();
        readHouse();
        readRoom();

        if (facilityIntegerMap.isEmpty()) {
            System.err.println("The list is empty and needs to be added");
        }

        for (Map.Entry<Facility, Integer> item :
                facilityIntegerMap.entrySet()) {
            System.out.println("Service " + item.getKey() + "\n" + " number standard: " + item.getValue());
        }
    }

    public void maintenance() {

        readVilla();
        readHouse();
        readRoom();

        for (Map.Entry<Facility, Integer> item :
                facilityIntegerMap.entrySet()) {
            if (item.getValue() >= 5) {
                System.err.println("----Service needed Maintenance---- \n" +
                        item.getKey() + "," + item.getValue());
            }
        }
    }

    @Override
    public void addNewVilla() {
        facilityIntegerMap.clear();

        readVilla();

        String idService = RegexExceptions.regexId();

        String nameService = RegexExceptions.regexName();

        double area = Double.parseDouble(RegexExceptions.regexArea());

        double price = Double.parseDouble(RegexExceptions.regexAmount());

        int people = Integer.parseInt(RegexExceptions.regexPeople());

        String standard = RegexExceptions.regexRoomStandard();

        System.out.println("Enter rental type : ");
        Villa villa = new Villa();
        String rentalType = villa.getRentalType();

        double pool = Double.parseDouble(RegexExceptions.regexArea());

        int floor = Integer.parseInt(RegexExceptions.regexFloor());

        Villa villa1 = new Villa(idService, nameService, area, price, people, rentalType, standard, pool, floor);
        facilityIntegerMap.put(villa1, 5);

        String line = "";
        for (Map.Entry<Facility, Integer> villa2 : facilityIntegerMap.entrySet()) {
            line += villa2.getKey().information() + "," + villa2.getValue() + "\n";

        }
        ReadAndWrite.writeFile(LINK_VILLA, line);

        System.out.println("Add NEW Villa success!");
    }

    @Override
    public void addNewHouse() {
        facilityIntegerMap.clear();

        readHouse();

        String idService = RegexExceptions.idHouse();

        String nameService = RegexExceptions.regexName();

        double area = Double.parseDouble(RegexExceptions.regexArea());

        double price = Double.parseDouble(RegexExceptions.regexAmount());

        int people = Integer.parseInt(RegexExceptions.regexPeople());

        String standard = RegexExceptions.regexRoomStandard();

        System.out.println("Enter rental type : ");
        House house = new House();
        String rentalType = house.getRentalType();
        int floor = Integer.parseInt(RegexExceptions.regexFloor());

        House house1 = new House(idService, nameService, area, price, people, rentalType, standard, floor);
        facilityIntegerMap.put(house1, 0);

        String line = "";
        for (Map.Entry<Facility, Integer> house2 : facilityIntegerMap.entrySet()) {
            line += house2.getKey().information() + "," + house2.getValue() + "\n";
        }
        ReadAndWrite.writeFile(LINK_HOUSE, line);

        System.out.println("Add NEW House success!");

    }

    @Override
    public void addNewRoom() {
        facilityIntegerMap.clear();
        readRoom();
        String idService = RegexExceptions.idRoom();

        String nameService = RegexExceptions.regexName();

        double area = Double.parseDouble(RegexExceptions.regexArea());

        double price = Double.parseDouble(RegexExceptions.regexAmount());

        int people = Integer.parseInt(RegexExceptions.regexPeople());

        System.out.println("Enter rental type : ");
        Room room = new Room();
        String rentalType = room.getRentalType();

        System.out.println("Service free: ");
        String service = input.nextLine();

        Room room1 = new Room(idService, nameService, area, price, people, rentalType, service);
        facilityIntegerMap.put(room1, 0);

        String line = "";
        for (Map.Entry<Facility, Integer> room2 : facilityIntegerMap.entrySet()) {
            line += room2.getKey().information() + "," + room2.getValue() + "\n";
        }
        ReadAndWrite.writeFile(LINK_ROOM, line);

        System.out.println("Add NEW Room success!");
    }

    private static void readVilla() {
        /**
         * Villa
         */
        List<String[]> list1 = ReadAndWrite.readFile(LINK_VILLA);

        for (String[] item : list1) {
            Villa villa = new Villa(item[0], item[1], Double.parseDouble(item[2]),
                    Double.parseDouble(item[3]), Integer.parseInt(item[4]), item[5],
                    item[6], Double.parseDouble(item[7]), Integer.parseInt(item[8]));
            facilityIntegerMap.put(villa, 5);
        }
    }

    private static void readHouse() {
        /**
         * House
         */
        List<String[]> list2 = ReadAndWrite.readFile(LINK_HOUSE);

        for (String[] item2 : list2) {
            House house = new House(item2[0], item2[1], Double.parseDouble(item2[2]),
                    Double.parseDouble(item2[3]), Integer.parseInt(item2[4]), item2[5],
                    item2[6], Integer.parseInt(item2[7]));
            facilityIntegerMap.put(house, 0);
        }
    }

    private static void readRoom() {

        /**
         * Room
         */
        List<String[]> list3 = ReadAndWrite.readFile(LINK_ROOM);

        for (String[] item3 : list3) {
            Room room = new Room(item3[0], item3[1], Double.parseDouble(item3[2]),
                    Double.parseDouble(item3[3]), Integer.parseInt(item3[4]), item3[5], item3[6]);
            facilityIntegerMap.put(room, 0);
        }

    }

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void listToUpdate() {

    }
}
