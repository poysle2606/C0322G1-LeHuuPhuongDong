package furama_resort.services.packeage_class;

import furama_resort.models.Booking;
import furama_resort.models.facilitys.Facility;
import furama_resort.models.facilitys.Villa;
import furama_resort.models.persons.Customer;
import furama_resort.services.package_impl.BookingService;
import furama_resort.services.utils.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner input = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new LinkedList<>();
    static Map<Facility, Integer> integerMap = new LinkedHashMap<>();

    static {
        customerList.add(new Customer(1, "Vinh", 24, "Men", 2335334, 113,
                "vinhpro@gmail.com", "Gold", "113 Auburt Street."));
        customerList.add(new Customer(2, "Yen", 22, "Women", 222235334, 115,
                "yenpro@gmail.com", "Silver", "113 Auburt Street."));
        integerMap.put(new Villa("Villa 1", 30, 15000000, 5,
                "Day", "Good room", 20, 3), 0);
        integerMap.put(new Villa("Villa 2", 45, 20000000, 6,
                "Week", "Normal", 15, 2), 0);
    }

    @Override
    public void display() {
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }

    }

    @Override
    public void addPerson() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Ngày bắt đầu thuê: ");
        String starDay = input.nextLine();
        System.out.println("Ngày kết thúc thuê: ");
        String endDay = input.nextLine();
        Booking booking = new Booking(id, starDay, endDay, customer.getCode(), facility.getNameService(), facility.getRentalType());
        bookingSet.add(booking);
        System.out.println("Thêm mới Booking thành công.");
    }

    @Override
    public void deletePerson() {

    }

    @Override
    public void updatePerson() {

    }

    public static Customer chooseCustomer() {
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
        boolean flag = false;
        do {
            System.out.println("Nhập mã khách hàng: ");
            int idCustomer = Integer.parseInt(input.nextLine());
            for (Customer customer : customerList) {
                if (idCustomer == customer.getCode()) {
                    flag = true;
                    return customer;
                }

            }
            if (!flag) {
                System.out.println("Không tìm thấy mã khách hàng.");
            }
        } while (true);
    }

    public static Facility chooseFacility() {
        for (Map.Entry<Facility, Integer> facilityList : integerMap.entrySet()) {
            System.out.println(facilityList.getKey().toString());
        }

        boolean flag = false;
        do {
            System.out.println("Nhập tên dịch vụ: ");
            String idFacility = input.nextLine();
            for (Map.Entry<Facility, Integer> facilityList : integerMap.entrySet()) {
                if (idFacility.equals(facilityList.getKey().getNameService())) {
                    flag = true;
                    return facilityList.getKey();
                }

            }
            if (!flag) {
                System.out.println("Không tìm thấy tên dịch vụ.");
            }
        } while (true);
    }
}
