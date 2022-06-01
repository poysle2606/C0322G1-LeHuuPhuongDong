package furama_resort.services.packeage_class;

import furama_resort.models.Booking;
import furama_resort.models.Contract;
import furama_resort.models.persons.Customer;
import furama_resort.services.package_impl.ContactService;

import java.util.*;

public class ContractServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    @Override
    public void display() {
        for (Contract list : contractList) {
            System.out.println(list);
        }
    }

    @Override
    public void addPerson() {
        Queue<Booking> contracts = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            contracts.add(booking);
        }
        while (!contracts.isEmpty()) {
            Booking booking = contracts.poll();
            int codeBooking = booking.getCodeBooking();
            int customer = booking.getIdCustomer();
            System.out.println("Đang tạo hợp đồng Booking có thông tin: " + booking);
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer);
            System.out.println("Nhập ID hợp đồng: ");
            int id = Integer.parseInt(input.nextLine());
            System.out.println("Số tiền cọc trước: ");
            double moneyPre = Double.parseDouble(input.nextLine());
            System.out.println("Tổng số tiền phải trả là: ");
            double totalMoney = Double.parseDouble(input.nextLine());
            Contract contract = new Contract(id,codeBooking, moneyPre, totalMoney, customer);
            contractList.add(contract);
            System.out.println("Tạo hợp đồng thành công " + contract);
        }
    }

    @Override
    public void deletePerson() {

    }

    @Override
    public void updatePerson() {

    }
}
