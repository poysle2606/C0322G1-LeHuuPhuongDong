package ss14_erro.excerise;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhập cạnh A:");
                double sizeA = Double.parseDouble(input.nextLine());
                System.out.println("Nhập cạnh B:");
                double sizeB = Double.parseDouble(input.nextLine());
                System.out.println("Nhập cạnh C:");
                double sizeC = Double.parseDouble(input.nextLine());
                try {
                    if (sizeA <= 0 || sizeB <= 0 || sizeC <= 0) {
                        throw new IllegalTriangleException("Tam giác không được có số âm");
                    } else if ((sizeA + sizeB < sizeC) || (sizeA + sizeC < sizeB) || (sizeB + sizeC < sizeA)) {
                        throw new IllegalTriangleException("Tổng hai số phải hớn hơn số còn lại");
                    } else {
                        System.out.println("Tam giác là tác giam, tác giam là tam giác.");
                        System.exit(0);
                    }
                } catch (IllegalTriangleException str) {
                    str.printStackTrace();
                    System.out.println(str.getMessage());

                }

            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.out.println("Không đúng định dạng.");

            }
        } while (true);
    }
}
