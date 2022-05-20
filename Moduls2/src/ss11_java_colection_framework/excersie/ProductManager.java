package ss11_java_colection_framework.excersie;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class ProductManager {
    static LinkedList<Product> listProduct = new LinkedList<>();
    static Scanner input = new Scanner(System.in);
    static int count;

    static {
        listProduct.add(new Product(1, "IphoneX", 500, 4, "Apple"));
        listProduct.add(new Product(2, "Iphone11", 1500, 5, "Apple"));
        listProduct.add(new Product(3, "Iphone11 Pro", 400, 6, "Apple"));
        listProduct.add(new Product(4, "Iphone11 ProMax", 3500, 7, "Apple"));
        listProduct.add(new Product(5, "Iphone 12", 400, 8, "Apple"));
        listProduct.add(new Product(6, "Iphone 12", 400, 8, "Apple"));
        count = 7;
    }

    public static void addProduct() {
        System.out.println("Enter name to add:");
        String name = input.nextLine();
        System.out.println("Enter price to add:");
        int price = Integer.parseInt(input.nextLine());
        System.out.println("Enter amount to add:");
        int amount = Integer.parseInt(input.nextLine());
        System.out.println("Enter production to add:");
        String production = input.nextLine();
        listProduct.add(new Product(count, name, price, amount, production));
        count++;
    }

    public static void displayProduct() {
        for (Product item :
                listProduct) {
            System.out.println(item);
        }
    }

    public static void updateProduct() {
        System.out.println("Enter id to update:");
        int idProduct = Integer.parseInt(input.nextLine());
        for (Product product : listProduct) {
            if (idProduct == product.getId()) {
                System.out.println("Enter name: ");
                String name = input.nextLine();
                System.out.println("Enter price: ");
                int price = Integer.parseInt(input.nextLine());
                System.out.println("Enter amount: ");
                int amount = Integer.parseInt(input.nextLine());
                System.out.println("Enter production: ");
                String production = input.nextLine();
                product.setName(name);
                product.setPrice(price);
                product.setAmount(amount);
                product.setProduction(production);
            }
        }
    }

    public static void deleteProduct() {
        System.out.println("Enter ID to delete: ");
        int idDelete = Integer.parseInt(input.nextLine());
        for (int i = 0; i < listProduct.size(); i++) {
            if (idDelete == listProduct.get(i).getId()) {
                listProduct.remove(i);
                System.out.println("Delete success");
            }
        }
    }

    public static void searchProduct() {
        System.out.println("Enter name to search:");
        String name = input.nextLine();
        boolean flag = false;
        for (Product item :
                listProduct) {
            if (item.getName(name).contains(name)) {
                System.out.println(item);
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("Not found");
        }
    }

    public static void sortAcendingProduct() {
        Collections.sort(listProduct);
        System.out.println("List Product");
        for (Product item :
                listProduct) {
            System.out.println(item);
        }
    }

    public static void sortDecendingProduct() {
        //Collections.revereOrder() để đảo ngược giá lại.
        listProduct.sort(Collections.reverseOrder());
        System.out.println("List Product");
        for (Product item :
                listProduct) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        int choose;
        do {
            System.out.println("------List Product------");
            System.out.println("1. Add new product\n" +
                    "2. Update product by ID\n" +
                    "3. Delete product by ID\n" +
                    "4. Display list product\n" +
                    "5. Search product by name\n" +
                    "6. Sort products ascending, descending by price\n");
            System.out.print("Your choose is: ");

            choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updateProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    displayProduct();
                    break;
                case 5:
                    searchProduct();
                    break;
                case 6:
                    System.out.println("1.Sort products ascending.\n" +
                            "2.Sort products descending");
                    int chooseSort = Integer.parseInt(input.nextLine());
                    switch (chooseSort) {
                        case 1:
                            sortAcendingProduct();
                            break;
                        case 2:
                            sortDecendingProduct();
                    }
                default:
                    System.out.println("Please enter again.");
            }
        } while (true);
    }

}
