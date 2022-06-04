package furama_resort.services.packeage_class;

import furama_resort.models.Booking;
import furama_resort.models.Contract;
import furama_resort.services.package_impl.ContactService;
import furama_resort.services.utils.ReadAndWrite;

import java.util.*;

public class ContractServiceImpl implements ContactService {
    static List<Contract> contractList = new ArrayList<>();
    private static final String LINK_CONTRACT = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\contract.csv";

    static Scanner input = new Scanner(System.in);

    @Override
    public void display() {

        List<String[]> list = ReadAndWrite.readFile(LINK_CONTRACT);
        contractList.clear();
        for (String[] item : list) {
            Contract contract = new Contract(Integer.parseInt(item[0]),
                    Integer.parseInt(item[1]),
                    Double.parseDouble(item[2]),
                    Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]));
            contractList.add(contract);
        }
        if (contractList.isEmpty()) {
            System.err.println("This is list is empty.");
        }

        for (Contract list1 : contractList) {
            System.out.println(list1);
        }
    }

    @Override
    public void add() {
        List<String[]> list = ReadAndWrite.readFile(LINK_CONTRACT);

        for (String[] item : list) {
            Contract contract = new Contract(Integer.parseInt(item[0]),
                    Integer.parseInt(item[1]),
                    Double.parseDouble(item[2]),
                    Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]));
            contractList.add(contract);
        }

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

            Contract contract = new Contract(id, codeBooking, moneyPre, totalMoney, customer);
            contractList.add(contract);

            System.out.println("Tạo hợp đồng thành công " + contract);

            String line = "";
            for (Contract item1 : contractList) {
                line += String.format("%s,%s,%s,%s,%s",
                        item1.getCodeContract(),
                        item1.getCodeBooking(),
                        item1.getFirstMoney(),
                        item1.getTotalMoney(),
                        item1.getIdCustomer()) + "\n";
            }
            ReadAndWrite.writeFile(LINK_CONTRACT, line);
        }
    }

    @Override
    public void update() {

    }
}
