package TryToCRUD;

import java.util.Scanner;

public class Main {

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

        public static void addProduct () {
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

        }

    }
