package ss16_io_binary_file.excersie.product_file;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ServiceProduct {
    static Scanner input = new Scanner(System.in);
    static List<ProductBinaryFile> list = new LinkedList<>();
    static String link = "src/ss16_io_binary_file/excersie/product_file/binary.csv";

    public static void displayMenu() {
        list = Utils.readFileProduct(link);
        for (ProductBinaryFile item : list) {
            System.out.println(item);
        }
    }

    public static void addProduct() {
        try {
            Utils.readFileProduct(link);

            int code = list.size() + 1;
            System.out.println("Enter name of Product to add: ");
            String name = input.nextLine();
            System.out.println("Enter production to add: ");
            String production = input.nextLine();
            System.out.println("Enter price to add: ");
            double price = Double.parseDouble(input.nextLine());
            list.add(new ProductBinaryFile(code, name, production, price));
            System.out.println("Add product success.");
            Utils.writeFileProduct(link, list);
        } catch (NumberFormatException e) {
            System.err.println("Bạn nhập sai định dạng số.");
        }
    }

    public static void searchProduct() {
        System.out.println("You need known Name to search!:");
        String name = input.nextLine();
        boolean flag = false;
        for (ProductBinaryFile item1 : list) {
            if (item1.getName().contains(name)) {
                System.out.println(item1);
                flag = true;
            }
        }
        Utils.readFileProduct(link);
        if (!flag) {
            System.out.println("I not found name in List.");
        }
    }
}
