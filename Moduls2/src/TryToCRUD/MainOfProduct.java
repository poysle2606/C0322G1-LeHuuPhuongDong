package TryToCRUD;

import java.util.Objects;
import java.util.Scanner;

public class MainOfProduct {

    //tạo mảng để chứa số lượng sản phẩm.
    public static Product[] products = new Product[50];
    static Scanner input = new Scanner(System.in);
    static int count;

    //tạo khối static và cho giá trị vào mảng.
    static {
        products[0] = new Product(1, "Lamborghini", 3000, 5, "Italia");
        products[1] = new Product(2, "LeXus", 1500, 2, "USA");
        products[2] = new Product(3, "Porches", 2000, 4, "England");
        products[3] = new Product(4, "Audi", 1600, 7, "France");
        products[4] = new Product(5, "Mazda", 900, 3, "Korea");
        count = 5;
    }

    public static void display() {
        for (Product display : products) {
            if (display != null)
                System.out.println(display);
        }

    }

    public static void addProduct() {
        System.out.println("Enter name of product: ");
        String name = input.nextLine();
        System.out.println("Enter price of product: ");
        double price = Double.parseDouble(input.nextLine());
        System.out.println("Enter amount");
        int amount = Integer.parseInt(input.nextLine());
        System.out.println("Enter national of product: ");
        String nation = input.nextLine();

        Product product = new Product(count + 1, name, price, amount, nation);
        products[count] = product;
        count++;

    }

    public static void updateProduct() {
        System.out.println("You want to update at position: ");
        int position = Integer.parseInt(input.nextLine());
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && products[i].getId() == position) {
                System.out.println("Name to change: ");
                String name = input.nextLine();
                System.out.println("Price to change: ");
                double price = Double.parseDouble(input.nextLine());
                System.out.println("Amount to change: ");
                int amount = Integer.parseInt(input.nextLine());
                System.out.println("National to change: ");
                String national = input.nextLine();
                products[i] = new Product(i + 1, name, price, amount, national);
            }
        }
    }


    public static void delete() {
        System.out.println("Enter Name of product to delete: ");
        String id = input.nextLine();
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null && Objects.equals(products[i].getName(), id)) {
                for (int j = i; j < products.length - 1; j++) {
                    products[j] = products[j + 1];
                }
                products[count] = null;
            }
        }
    }

    public static void search() {
        System.out.println("You are looking for? ");
        String name = input.nextLine();
        boolean flag = false;
        for (Product product : products) {
            if (product != null && product.toString().contains(name)) {
                System.out.println(product);
                flag = true;
            }

        }
        if (!flag) {
            System.out.println("Sorry I'm not Found!");
        }
    }

    public static void exit() {
        System.exit(0);
    }

    public static void main(String[] args) {
        do {
            System.out.println("------List Product------");
            System.out.println("1. Display list\n" +
                    "2. Add new product\n" +
                    "3. Update product\n" +
                    "4. Delete product\n" +
                    "5. Search product\n" +
                    "6. Exit program\n");
            System.out.print("Your choose is: ");

            int choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Display list");
                    display();
                    break;
                case 2:
                    System.out.println("Enter the product you want to add: ");
                    addProduct();
                    System.out.println("Add product success!");
                    break;
                case 3:
                    updateProduct();
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    System.out.println("Exited!");
                    exit();
            }
        } while (true);
    }
}

//   CODE mấy anh khóa trên chỉ em để nghiên cứu thêm

//    public static void search() {
//        System.out.println("You looking for?");
//        String name = input.nextLine();
//        if (checkNameExists(name)) {
//            for (Product product : products) {
//                if (product != null && product.toString().contains(name)) {
//                    System.out.println(product);
//                }
//            }
//        } else {
//            System.out.println("Not found!");
//        }
//
//    }
//
//    private static boolean checkNameExists(String name) {
//        for (Product product : products) {
//            if (product != null && product.toString().contains(name)) {
//                return true;
//            }
//        }
//        return false;
//    }
