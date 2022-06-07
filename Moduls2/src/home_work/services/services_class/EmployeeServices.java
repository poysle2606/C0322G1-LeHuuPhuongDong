package home_work.services.services_class;

import home_work.person.ManagementProduct;
import home_work.person.ManagementStaff;
import home_work.person.Person;
import home_work.services.impl_class.ServicesImpl;
import quan_ly_du_an.files_data.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServices implements ServicesImpl {
    static Scanner input = new Scanner(System.in);

    public static final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    static final String LINK_STAFF = "src/home_work/files/employee.csv";

    List<Person> staffList = new LinkedList<>();

    List<Person> productList = new LinkedList<>();

    static List<String[]> list;

    public void display() {
        list = ReadAndWrite.readFile(LINK_STAFF);

    }
    @Override
    public void displayStaff() {
        list = ReadAndWrite.readFile(LINK_STAFF);

        staffList.clear();

        for (String[] item : list) {
            Person staff = new ManagementStaff(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    item[5], item[6]);
            staffList.add(staff);
            if (item[1].contains("STAFF")) {
                System.out.println(staff);
            }
        }

        if (staffList.isEmpty()) {
            System.err.println("Danh sách rỗng cần thêm mới để hiển thị.");
        }
    }

    @Override
    public void displayProduct() {
        list = ReadAndWrite.readFile(LINK_STAFF);

        for (String[] item : list) {
            Person product = new ManagementProduct(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Integer.parseInt(item[5]), Double.parseDouble(item[6]));
            productList.add(product);
            if(item[1].contains("PRODUCT")){
                System.out.println(product);
            }
        }
        if (productList.isEmpty()) {
            System.err.println("Danh sách rỗng cần thêm mới để hiển thị.");
        }

    }

    @Override
    public void addStaff() {

    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteStaff() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void search(){

    }

}
