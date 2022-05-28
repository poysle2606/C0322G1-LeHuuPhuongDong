package ss16_io_binary_file.excersie.product_file;

import java.util.Scanner;

public class TestBinaryFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            try {
                System.out.println("-----Main Menu----- \n" +
                        "1.Display product List \n" +
                        "2.Add new product List \n" +
                        "3.Search product List. \n" +
                        "4.Exit.");

                System.out.println("Your choose: ");
                int choose = Integer.parseInt(input.nextLine());
                switch (choose) {
                    case 1:
                        ServiceProduct.displayMenu();
                        break;
                    case 2:
                        ServiceProduct.addProduct();
                        break;
                    case 3:
                        ServiceProduct.searchProduct();
                        break;
                    case 4:
                        System.exit(0);
                }
            } catch (NumberFormatException e) {
                System.err.println("Nhập sai định dạng số!");
            }
        } while (true);
    }
}
