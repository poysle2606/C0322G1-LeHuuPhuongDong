package home_work.services.services_class;

import home_work.person.ManagementProduct;
import home_work.services.impl_class.ProductImpl;
import home_work.untils.NotFoundEmployeeException;
import home_work.untils.PositiveNumberExceptions;
import home_work.untils.RegexOfEmployee;
import quan_ly_du_an.exception.CodePatientException;
import quan_ly_du_an.files_data.ReadAndWrite;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class ProductServices implements ProductImpl {

    static Scanner input = new Scanner(System.in);

    public static final String REGEX_BIRTHDAY = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    static final String LINK_STAFF = "src/home_work/files/product.csv";

    List<ManagementProduct> productList = new LinkedList<>();

    static List<String[]> list;

    @Override
    public void display() {

        list = ReadAndWrite.readFile(LINK_STAFF);

        for (String[] item : list) {
            ManagementProduct staff = new ManagementProduct(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Integer.parseInt(item[5]), Double.parseDouble(item[6]));
            productList.add(staff);
        }
        if (productList.isEmpty()) {
            System.err.println("Danh sách rỗng cần thêm mới để hiển thị.");
        }

        for (ManagementProduct product : productList) {
            System.out.println(product);
        }

    }


    @Override
    public void add() {

        list = ReadAndWrite.readFile(LINK_STAFF);

        for (String[] item : list) {
            ManagementProduct staff = new ManagementProduct(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Integer.parseInt(item[5]), Double.parseDouble(item[6]));
            productList.add(staff);
        }

        System.out.println("Id sẽ tự động cập nhật:");

        int max = 0;

        int id;

        if (productList.isEmpty()) {
            id = 1;
        } else {
            for (ManagementProduct item1 : productList) {
                if (item1.getId() > max) {
                    max = item1.getId();
                }
            }
            id = max + 1;
        }

        String codeEmpl;
        do {
            try {
                System.out.println("Mã nhân viên sản xuất sẽ nhập theo định dạng (PRODUCT-XXXX) - XXXX là số từ 0-9.");

                codeEmpl = input.nextLine();

                if (RegexOfEmployee.formatProduct(codeEmpl)) {
                    break;
                } else {
                    throw new CodePatientException("Bạn nhập sai định dạng. xin nhập lại.");
                }
            } catch (CodePatientException e) {
                e.printStackTrace();
            }

        } while (true);

        System.out.println("Tên của nhân viên: ");
        String name = input.nextLine();

        System.out.println("Ngày sinh của nhân viên: ");
        String birthDay = RegexOfEmployee.regexAge1(input.nextLine(), REGEX_BIRTHDAY);

        System.out.println("Địa chỉ của nhân viên: ");
        String address = input.nextLine();

        System.out.println("Số lượng sản phẩm: ");
        int product = Integer.parseInt(input.nextLine());
        if (product <= 0) {
            System.err.println("Nhập số lượng sản phẩm sai");
        }

        System.out.println("Giá của sản phẩm: ");
        int price = Integer.parseInt(input.nextLine());
        if (price <= 0) {
            System.err.println("Nhập giá của sản phẩm sai");
        }

        ManagementProduct staff = new ManagementProduct(id, codeEmpl, name, birthDay, address, product, price);
        productList.add(staff);

        String line = "";
        for (ManagementProduct person : productList) {
            line += person.inFor() + "\n";
        }
        ReadAndWrite.writeFile(LINK_STAFF, line);
        System.out.println("Thêm mới nhân viên thành công.");


    }

    @Override
    public void delete() {

        list = ReadAndWrite.readFile(LINK_STAFF);

        for (String[] item : list) {
            ManagementProduct staff = new ManagementProduct(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Integer.parseInt(item[5]), Double.parseDouble(item[6]));
            productList.add(staff);
        }

        System.out.println("Bạn cần biết mã nhân viên để xóa: \n" +
                "1.Tôi đã biết. \n" +
                "2.Cho tôi xem lại. \n" +
                "3.Quay lại. \n" +
                "Chọn chức năng.");
        try {
            int choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:

                    System.out.println("Nhập mã nhân viên tai đây.");

                    try {
                        String codePerson = input.nextLine();

                        boolean flag = false;

                        for (int i = 0; i < productList.size(); i++) {
                            if (Objects.equals(codePerson, productList.get(i).getCodePerson())) {
                                System.out.println("Bạn có muốn xóa Nhân viên này không: \n" +
                                        "1.Chắc chắn xóa. \n" +
                                        "2.Không. \n" +
                                        "Chọn chức năng.");

                                int choose1 = Integer.parseInt(input.nextLine());

                                switch (choose1) {
                                    case 1:
                                        productList.remove(productList.get(i));

                                        System.out.println("Xóa nhân viên này thành công");

                                        String line = "";

                                        for (ManagementProduct staff : productList) {
                                            line += staff.inFor() + "\n";
                                        }

                                        ReadAndWrite.writeFile(LINK_STAFF, line);

                                        flag = true;

                                        break;
                                    case 2:
                                        return;
                                    default:
                                        System.err.println("Không có chức năng này.");
                                }

                            }

                        }
                        if (!flag) {
                            throw new NotFoundEmployeeException("Mã nhân viên này không có.");
                        }
                    } catch (NotFoundEmployeeException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    for (int i = 0; i < productList.size(); i++) {

                        String code = productList.get(i).getCodePerson();

                        System.out.println(code);
                    }
                    break;
                case 3:
                    return;
                default:
                    System.err.println("Không có chức năng này.");
            }

        } catch (NumberFormatException e) {
            System.err.println("Bạn nhập sai định dạng.");
        }

    }

    @Override
    public void search() {

        list = ReadAndWrite.readFile(LINK_STAFF);

        for (String[] item : list) {
            ManagementProduct staff = new ManagementProduct(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Integer.parseInt(item[5]), Double.parseDouble(item[6]));
            productList.add(staff);
        }

        do {
            System.out.println("Bạn có thể tìm kiêm theo Mã nhân viên, họ tên, ngày sinh, địa chỉ. \n" +
                    "1.Mã nhân viên. \n" +
                    "2.Họ và tên. \n" +
                    "3.Ngày sinh. \n" +
                    "4.Địa chỉ. \n" +
                    "5.Quay lại \n" +
                    "Chọn chức năng.");
            try {

                int choose = Integer.parseInt(input.nextLine());

                switch (choose) {
                    case 1:
                        searchIdEmployee();
                        break;
                    case 2:
                        searchName();
                        break;
                    case 3:
                        searchBirthDay();
                        break;
                    case 4:
                        searchAddress();
                        break;
                    case 5:
                        return;
                    default:
                        System.err.println("Chức năng này không có.");
                }

            } catch (NumberFormatException e) {
                System.err.println("Bạn không được nhập chữ.");
            }
        } while (true);

    }

    public void searchName() {

        System.out.println("Nhập tên cần tìm kiếm tại đây.");

        String name = input.nextLine();

        boolean flag = false;

        for (ManagementProduct managementProduct : productList) {
            if (managementProduct.getName().contains(name)) {
                flag = true;
                System.out.println(managementProduct);
            }

        }
        if (!flag) {
            System.out.println("Không có tên Nhân viên này.");
        }
    }

    public void searchIdEmployee() {

        System.out.println("Nhập mã nhân viên cần tìm kiếm tại đây.");

        String code = input.nextLine();

        boolean flag = false;

        for (ManagementProduct managementProduct : productList) {
            if (managementProduct.getCodePerson().contains(code)) {
                flag = true;
                System.out.println(managementProduct);
            }

        }
        if (!flag) {
            System.out.println("Không tìm thấy nhân viên này.");
        }

    }

    public void searchBirthDay() {

        System.out.println("Nhập ngày sinh nhân viên cần tìm kiếm tại đây.");

        String day = input.nextLine();

        boolean flag = false;

        for (ManagementProduct managementProduct : productList) {
            if (managementProduct.getBirthDay().contains(day)) {
                flag = true;
                System.out.println(managementProduct);
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy Nhân viên này.");
        }
    }

    public void searchAddress() {

        System.out.println("Nhập địa chỉ nhân viên cần tìm kiếm tại đây.");

        String address = input.nextLine();

        boolean flag = false;

        for (ManagementProduct managementProduct : productList) {
            if (managementProduct.getAddress().contains(address)) {
                flag = true;
                System.out.println(managementProduct);
            }
        }
        if (!flag) {
            System.out.println("Không tìm thấy Nhân viên này.");
        }
    }
}
