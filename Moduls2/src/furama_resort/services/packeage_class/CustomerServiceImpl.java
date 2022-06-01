package furama_resort.services.packeage_class;

import furama_resort.models.persons.Customer;
import furama_resort.models.persons.Person;
import furama_resort.services.package_impl.ContactService;
import furama_resort.services.utils.ReadAndWrite;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl extends Customer implements ContactService {
    static List<Customer> list = new LinkedList<>();
    static Scanner input = new Scanner(System.in);
    private static String link = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\customer.csv";

    @Override
    public void display() {
        List<String[]> listCustomer = ReadAndWrite.readFile(link);
        list.clear();
        for (String[] item : listCustomer) {
            Customer customer = new Customer(Integer.parseInt(item[0]), item[1], item[2], item[3],
                    Integer.parseInt(item[4]), Long.parseLong(item[5]), item[6], item[7], item[8]);
            list.add(customer);
        }
        for (Person customer : list) {
            System.out.println(customer);
        }

    }

    @Override
    public void addPerson() {
        List<String[]> listCustomer = ReadAndWrite.readFile(link);
        list.clear();
        for (String[] item : listCustomer) {
            Customer customer = new Customer(Integer.parseInt(item[0]), item[1], item[2], item[3],
                    Integer.parseInt(item[4]), Long.parseLong(item[5]), item[6], item[7], item[8]);
            list.add(customer);
        }
        System.out.println("Customer Code is auto increase!");
        int code = list.size() + 1001;
        System.out.println("Enter name to ");
        String name = input.nextLine();
        System.out.println("Date of customer: ");
        String date = input.nextLine();
        System.out.println("Gender of customer is: ");
        String gender = input.nextLine();
        System.out.println("CMND of customer is: ");
        int cmnd = Integer.parseInt(input.nextLine());
        System.out.println("Number phone of customer is: ");
        long numberPhone = Integer.parseInt(input.nextLine());
        System.out.println("Email is: ");
        String email = input.nextLine();
        System.out.println("Enter type of Customer: ");
        String typeCustomer = typeCustomer();
        System.out.println("Address of customer is: ");
        String address = input.nextLine();
        list.add(new Customer(code, name, date, gender, cmnd, numberPhone, email, typeCustomer, address));

        String str = "";
        for (Customer item : list) {
            str += item.getInfo() + "," + item.getTypeCustomer() + "," + item.getAddress() + "\n";
        }

        ReadAndWrite.writeFile(link, str);
        System.out.println("Add customer success!");
    }

    @Override
    public void deletePerson() {

    }

    @Override
    public void updatePerson() {
        System.out.println("You need CODE CUSTOMER to update \n" +
                "1.I known \n" +
                "2.I will show listing for you search CUSTOMER CODE.");
        int codeCustomer = Integer.parseInt(input.nextLine());
        switch (codeCustomer) {
            case 1:
                List<String[]> listCustomer = ReadAndWrite.readFile(link);
                list.clear();
                for (String[] item : listCustomer) {
                    Customer customer = new Customer(Integer.parseInt(item[0]), item[1], item[2], item[3],
                            Integer.parseInt(item[4]), Long.parseLong(item[5]), item[6], item[7], item[8]);
                    list.add(customer);
                }
                System.out.println("Enter code in here:");
                int code = Integer.parseInt(input.nextLine());
                Customer customer = new Customer();
                boolean flag = false;
                for (int i = 0; i < list.size(); i++) {
                    if (code == list.get(i).getCode()) {
                        list.set(i, customer);
                        System.out.println("Enter name to update: ");
                        String nameToUpdate = input.nextLine();
                        System.out.println("Date of customer: ");
                        String dateToUpdate = input.nextLine();
                        System.out.println("Gender of customer is: ");
                        String genderToUpdate = input.nextLine();
                        System.out.println("CMND of customer is: ");
                        int idToUpdate = Integer.parseInt(input.nextLine());
                        System.out.println("Number phone of customer is: ");
                        long numberPhoneToUpdate = Integer.parseInt(input.nextLine());
                        System.out.println("Email is: ");
                        String emailToUpdate = input.nextLine();
                        System.out.println("Enter type of Customer:");
                        String updateType = typeCustomer();
                        System.out.println("Address to change");
                        String addressUpdate = input.nextLine();
                        customer.setCode(code);
                        customer.setName(nameToUpdate);
                        customer.setOld(dateToUpdate);
                        customer.setId(idToUpdate);
                        customer.setGender(genderToUpdate);
                        customer.setNumberPhone(numberPhoneToUpdate);
                        customer.setEmail(emailToUpdate);
                        customer.setTypeCustomer(updateType);
                        customer.setAddress(addressUpdate);
                        String str = "";
                        for (int j = 0; j < list.size(); j++) {
                            str += list.get(j).getCode() + "," + list.get(j).getName() + "," + list.get(j).getOld()
                                    + "," + list.get(j).getGender() + "," + list.get(j).getId() +  "," + list.get(j).getNumberPhone()
                                    + "," + list.get(j).getEmail() + "," + list.get(j).getTypeCustomer() + "," + list.get(j).getAddress() + "\n";
                        }
                        ReadAndWrite.writeFile(link, str);
                        System.out.println("Update success.");
                        flag = true;
                    }
                }
                if (!flag) {
                    System.err.println("I not found the code of Customer");
                }
                break;
            case 2:
                display();
                break;
            default:
                System.err.println("You entered it wrong, please re-enter.");
        }
    }

    public String typeCustomer() {
        do {
            System.out.println("1.Diamond.\n" +
                    "2.Platinum.\n" +
                    "3.Gold.\n" +
                    "4.Silver.\n" +
                    "5.Member.");
            System.out.println("Enter type of customer: ");
            int chooseType = Integer.parseInt(input.nextLine());
            switch (chooseType) {
                case 1:
                    return "Diamond";
                case 2:
                    return "Platinum";
                case 3:
                    return "Gold";
                case 4:
                    return "Silver";
                case 5:
                    return "Member";
                default:
                    System.out.println("If you entered it wrong, please re-enter it.");
            }
        } while (true);
    }
}
