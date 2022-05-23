package training.services.class_services;

import training.person.DailyWorkers;
import training.person.Human;
import training.person.ManagementStaff;
import training.person.ProductionStaff;
import training.services.impl.Work;

import java.util.Collections;

public class ArrayHuman implements Work {
    static Human[] arr = new Human[1000];

    static {
        arr[0] = new ManagementStaff("Đông", "26/06/1998", "Cẩm Lệ", 7000000, 2.0);
        arr[1] = new DailyWorkers("Đú", "27/06/1998", "Cẩm Lệ", 28.5);
        arr[2] = new ProductionStaff("Đởn", "28/06/1998", "Cẩm Lệ", 500);
    }

    @Override
    public void display() {
        for (Human human :
                arr) {
            if (!(human == null)) {
                System.out.println(human);
            }
        }
    }

    public void displayManagementStaff() {
        for (Human human : arr) {
            if (human instanceof ManagementStaff) {
                System.out.println(human);
            }
        }
    }

    public void displayDailyWorkers() {
        for (Human person : arr) {
            if (person instanceof DailyWorkers) {
                System.out.println(person);
            }

        }
    }

    public void displayProductionStaff() {
        for (Human people : arr) {
            if (people instanceof ProductionStaff) {
                System.out.println(people);
            }
        }
    }

}


/**
 * iii: Suy nghĩ xem có những khó khăn gì khi hiển thị thông tin (phải check null, …)
 * - nếu không check null thì sẽ hiển thị cả phần tử null.
 * <p>
 * iv: Suy nghĩ xem từ khóa instanceof làm chức năng gì?
 * -instanceOf để kiểm tra một đối tượng có phải là thể hiển của một kiểu dữ của lớp con hay không.
 * <p>
 * v: Suy nghĩ xem nếu có 1001 nhân viên trong công ty thì chuyện gì xảy ra?
 * - Sẽ bị lỗi "Ngoại lệ trong lỗi khởi tạo."... Exception In Initializer Error.
 * <p>
 * vi: Đa hình lúc runtime thể hiện ở đâu?
 * - thể hiện ở lúc ta chạy chương trình và nhập dữ liệu vào để hiển thị ra kêst quả.
 * <p>
 * vii:Đa hình lúc compile thể hiện ở đâu?
 * -Thể hiện ở lúc thời gian biên dịch.
 **/

