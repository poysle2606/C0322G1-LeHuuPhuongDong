package training.services.class_services;

import training.person.DailyWorkers;
import training.person.Human;
import training.person.ManagementStaff;
import training.person.ProductionStaff;
import training.services.impl.Work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListHuman implements Work {
    static ArrayList<Human> human = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    static {
        human.add(new ManagementStaff("Đông", "26/06/1998", "Cẩm Lệ", 100000, 2.0));
        human.add(new DailyWorkers("Lê", "27/06/1998", "Cẩm Lệ", 20));
        human.add(new ProductionStaff("Phương", "28/06/1998", "Cẩm Lệ", 500));
    }

    @Override
    public void display() {
        for (Human people :
                human) {
            System.out.println(people);
        }
    }

    public void displayManagementStaff() {
        for (Human human : human) {
            if (human instanceof ManagementStaff) {
                System.out.println(human);
            }
        }
    }

    public void displayDailyWorkers() {
        for (Human person : human) {
            if (person instanceof DailyWorkers) {
                System.out.println(person);
            }

        }
    }

    public void displayProductionStaff() {
        for (Human people : human) {
            if (people instanceof ProductionStaff) {
                System.out.println(people);
            }
        }
    }

    public void comparatorSalary() {
        Collections.sort(human, new ComparatorSalary());
    }

    public void comparatorName() {
        Collections.sort(human, new ComparatorName());
    }

    public void chooseSort() {
        System.out.println("---Bạn muốn chọn sắp xếp như nào?--- \n" +
                "1.Sắp xếp theo lương. \n" +
                "2.Sắp xếp theo tên.");
        System.out.println("Chọn đi chế: ");
        do {
            int choose = Integer.parseInt(input.nextLine());
            switch (choose) {
                case 1:
                    human.sort(new ComparatorSalary());
                    break;
                case 2:
                    new ComparatorName();
                    break;
                default:
                    System.out.println("Enter again please!");
            }
        } while (true);
    }
}
/**
 * iii: Suy nghĩ xem vì sao ArrayList không cần khởi tạo 1000 phần tử trước?
 * - Kích thước của arrayList có thể co giản nên không cần khởi tạo 1000 phần tử trước.
 * <p>
 * iv: Nếu công ty có 1001 nhân viên thì có vấn đề gì không?
 * - Không có vấn đề gì.
 * <p>
 * v: Nêu ưu và nhược điểm của ArrayList so với Array.(Trong bài này).
 * -Ưu: Chứa được nhiều phần tử. Nhiều method thao tác với mảng.
 * Nhược: Tốc độ lưu trữ và thao tác chậm hơn Array.
 **/