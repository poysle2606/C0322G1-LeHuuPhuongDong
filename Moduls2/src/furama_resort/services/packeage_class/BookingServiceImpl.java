package furama_resort.services.packeage_class;

import furama_resort.models.Booking;
import furama_resort.models.facilitys.Facility;
import furama_resort.models.facilitys.House;
import furama_resort.models.facilitys.Room;
import furama_resort.models.facilitys.Villa;
import furama_resort.models.persons.Customer;
import furama_resort.services.package_impl.BookingService;
import furama_resort.services.utils.BookingComparator;
import furama_resort.services.utils.ReadAndWrite;
import furama_resort.services.utils.RegexExceptions;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    private static final String LINK_BOOKING = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\booking.csv";
    private static final String LINK_VILLA = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\villa.csv";
    private static final String LINK_HOUSE = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\house.csv";
    private static final String LINK_ROOM = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\room.csv";

    static Scanner input = new Scanner(System.in);

    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    static List<Customer> customerList = new LinkedList<>();

    static Map<Facility, Integer> integerMap = new LinkedHashMap<>();


    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void display() {
        List<String[]> list = ReadAndWrite.readFile(LINK_BOOKING);

        for (String[] item : list) {
            Booking booking = new Booking(Integer.parseInt(item[0]), item[1],
                    item[2], Integer.parseInt(item[3]), item[4], item[5]);
            bookingSet.add(booking);
        }

        if (bookingSet.isEmpty()) {
            System.err.println("The list is empty and needs to be added");
        }
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }

    }

    @Override
    public void add() {
        ReadAndWrite.readFile(LINK_BOOKING);

        int id = 1;

        if (!bookingSet.isEmpty()) {
            id = bookingSet.size() + 1;
        }
        Customer customer = chooseCustomer();

        Facility facility = chooseFacility();

        System.out.println("Ng??y b???t ?????u thu??: ");
        String starDay = RegexExceptions.getRegexAge();

        System.out.println("Ng??y k???t th??c thu??: ");
        String endDay = RegexExceptions.getRegexAge();

        System.out.println("Ch???n t??n d???ch v???:");
        String bookingFacility = facility();

        Booking booking = new Booking(id, starDay, endDay, customer.getCode(), facility.getNameService(), bookingFacility);
        bookingSet.add(booking);

        String line = "";

        for (Booking booking1 : bookingSet) {
            line += String.format("%s,%s,%s,%s,%s,%s", booking1.getCodeBooking(),
                    booking1.getStartDay(), booking1.getEndDay(),
                    booking1.getIdCustomer(), booking1.getNameFacility(), booking1.getFacility());
        }

        ReadAndWrite.writeFile(LINK_BOOKING, line);

        System.out.println("Th??m m???i Booking th??nh c??ng.");
    }

    @Override
    public void update() {

    }

    public static String facility() {
        System.out.println("1.Villa\n" +
                "2.House.\n" +
                "3.Room.");

        int choose = Integer.parseInt(input.nextLine());

        switch (choose) {
            case 1:
                return "Villa";
            case 2:
                return "House";
            case 3:
                return "Room";
            default:
                System.err.println("B???n ch??? ???????c ch???n 1- 3. Vui l??ng nh???p l???i.");
        }
        return "";
    }

    public static Customer chooseCustomer() {
        List<String[]> listCustomer = ReadAndWrite.readFile("D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\customer.csv");
        for (String[] customer : listCustomer) {
            Customer customer1 = new Customer(Integer.parseInt(customer[0]), customer[1], customer[2], customer[3],
                    Integer.parseInt(customer[4]), Long.parseLong(customer[5]), customer[6], customer[7], customer[8]);
            customerList.add(customer1);
            System.out.println(customer1);
        }

        int check = -1;

        do {
            try {
                System.out.println("Nh???p m?? kh??ch h??ng: ");

                int idCustomer = Integer.parseInt(input.nextLine());

                for (int i = 0; i < customerList.size(); i++) {
                    if (idCustomer == customerList.get(i).getCode()) {
                        check = 1;
                        return customerList.get(i);
                    }

                }
                if (check == -1) {
                    System.out.println("Kh??ng t??m th???y m?? kh??ch h??ng.");
                }
            } catch (NumberFormatException e) {
                System.err.println("vui l??ng kh??ng nh???p ch???.");
            }
        } while (true);
    }

    public static Facility chooseFacility() {
        readHouse();
        readVilla();
        readRoom();

        for (Map.Entry<Facility, Integer> facilityList : integerMap.entrySet()) {
            System.out.println(facilityList.getKey().toString());
        }

        boolean flag = false;
        do {
            System.out.println("Nh???p t??n d???ch v???: ");
            String idFacility = input.nextLine();
            for (Map.Entry<Facility, Integer> facilityList : integerMap.entrySet()) {
                if (idFacility.equals(facilityList.getKey().getNameService())) {
                    flag = true;
                    return facilityList.getKey();
                }

            }
            if (!flag) {
                System.out.println("Kh??ng t??m th???y t??n d???ch v???.");
            }
        } while (true);
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
            integerMap.put(villa, 5);
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
            integerMap.put(house, 0);
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
            integerMap.put(room, 0);
        }

    }
}
