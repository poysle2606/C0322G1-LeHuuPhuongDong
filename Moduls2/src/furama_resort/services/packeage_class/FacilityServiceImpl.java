package furama_resort.services.packeage_class;

import furama_resort.models.facilitys.Facility;
import furama_resort.models.facilitys.House;
import furama_resort.models.facilitys.Room;
import furama_resort.models.facilitys.Villa;
import furama_resort.services.package_impl.FacilityService;
import furama_resort.services.utils.RegexData;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    static Scanner input = new Scanner(System.in);
    private static final String REGEX_ID = "^[SV]+[VL|HO|RO][-][0-9]{4}$";
    private static final String REGEX_ROOM = "^[SV]+[RO][-][0-9]{4}$";
    private static final String REGEX_HOUSE = "^[SV]+[HO][-][0-9]{4}$";
    private static final String REGEX_NAME = "^[A-Z][a-z]{0,5}$";
    private static final String REGEX_AREA = "^[0-9]{2}+$";
    private static final String REGEX_AMOUNT = "^[0-9]+$";
    private static final String REGEX_PEOPLE = "^(([1-9])|(20))$";

    @Override
    public void display() {
        for (Map.Entry<Facility, Integer> item :
                facilityIntegerMap.entrySet()) {
            System.out.println("Service " + item.getKey() + "\n" + " number standard: " + item.getValue());
        }
    }

    @Override
    public void addNewVilla() {
        String idService = regexId();
        String nameService = regexName();
        double area = Double.parseDouble(regexArea());
        double price = Double.parseDouble(regexAmount());
        int people = Integer.parseInt(regexPeople());
        String standard = regexRoomStandard();
        System.out.println("Enter rental type : ");
        Villa villa = new Villa();
        String rentalType = villa.getRentalType2();
        double pool = Double.parseDouble(regexArea());
        int floor = Integer.parseInt(regexArea());
        Villa villa1 = new Villa(idService, nameService, area, price, people, rentalType, standard, pool, floor);
        facilityIntegerMap.put(villa1, 0);
        System.out.println("Add NEW Villa success!");
    }

    @Override
    public void addNewHouse() {
        String nameService = nameHouse();
        double area = Double.parseDouble(regexArea());
        double price = Double.parseDouble(regexAmount());
        int people = Integer.parseInt(regexPeople());
        String standard = regexRoomStandard();
        System.out.println("Enter rental type : ");
        House house = new House();
        String rentalType = house.getRentalType2();
        int floor = Integer.parseInt(regexFloor());
        House house1 = new House(nameService, area, price, people, rentalType, standard, floor);
        facilityIntegerMap.put(house1, 0);
        System.out.println("Add NEW House success!");

    }

    @Override
    public void addNewRoom() {
        String nameService = nameRoom();
        double area = Double.parseDouble(regexArea());
        double price = Double.parseDouble(regexAmount());
        int people = Integer.parseInt(regexPeople());
        System.out.println("Enter rental type : ");
        Room room = new Room();
        String rentalType = room.getRentalType2();
        System.out.println("Service free: ");
        String service = input.nextLine();
        Room room1 = new Room(nameService, area, price, people, rentalType, service);
        facilityIntegerMap.put(room1, 0);
        System.out.println("Add NEW Room success!");
    }

    public static String regexId() {
        System.out.println("Enter ID of service:");
        return RegexData.regexStr(input.nextLine(), REGEX_ID, "You must enter the Form SVXX-YYYY. \n" +
                " XX has Name of service (Villa - VL or House - HO or ROOM - RO). YYYY has number 0-9. ");
    }

    public static String regexName() {
        System.out.println("Name of service: ");
        return RegexData.regexStr(input.nextLine(), REGEX_NAME, "\n" +
                "Name service must capitalize the first character," +
                " the following characters are normal characters");
    }

    public static String regexArea() {
        System.out.println("Enter area Pool: ");
        return RegexData.regexStr(input.nextLine(), REGEX_AREA, " \n" +
                "Pool area must be more than 30 m^2. ");
    }

    public static String regexAmount() {
        System.out.println("Enter price: ");
        return RegexData.regexStr(input.nextLine(), REGEX_AMOUNT,
                "Only positive Integers can be entered");
    }

    public static String regexPeople() {
        System.out.println("Enter max People: ");
        return RegexData.regexStr(input.nextLine(), REGEX_PEOPLE, "Enter < 20 People.");
    }

    public static String regexRoomStandard() {
        System.out.println("Enter room standard: ");
        return RegexData.regexStr(input.nextLine(), REGEX_NAME, "\n" +
                "Standard room must capitalize the first character," +
                " the following characters are normal characters");
    }

    public static String regexFloor() {
        System.out.println("Enter number Floor: ");
        return RegexData.regexStr(input.nextLine(), REGEX_AMOUNT,
                "Only positive Integers can be entered");
    }

    public static String nameHouse() {
        System.out.println("Enter name of service:");
        return RegexData.regexStr(input.nextLine(), REGEX_HOUSE, "You must enter the Form SVXX-YYYY. \n" +
                " XX has Name of service (Villa - VL or House - HO or ROOM - RO). YYYY has number 0-9. ");
    }

    public static String nameRoom() {
        System.out.println("Enter name of service:");
        return RegexData.regexStr(input.nextLine(), REGEX_ROOM, "You must enter the Form SVXX-YYYY. \n" +
                " XX has Name of service (Villa - VL or House - HO or ROOM - RO). YYYY has number 0-9. ");
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
}
