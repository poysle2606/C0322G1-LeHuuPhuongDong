package training.services.class_services;

import training.person.DailyWorkers;
import training.person.Human;
import training.person.ManagementStaff;
import training.person.ProductionStaff;
import training.services.impl.Work;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListHuman implements Work {
    static LinkedList<Human> list = new LinkedList<>();

    static {
        list.add(new ManagementStaff("Đông", "26/06/1998", "Cẩm Lệ", 7000000, 2.0));
        list.add(new DailyWorkers("Đú", "27/06/1998", "Cẩm Lệ", 28.5));
        list.add(new ProductionStaff("Đởn", "28/06/1998", "Cẩm Lệ", 500));
    }

    @Override
    public void display() {
        for (Human people :
                list) {
            System.out.println(people);
        }
    }

    public void displayManagementStaff() {
        for (Human human : list) {
            if (human instanceof ManagementStaff) {
                System.out.println(human);
            }
        }
    }

    public void displayDailyWorkers() {
        for (Human person : list) {
            if (person instanceof DailyWorkers) {
                System.out.println(person);
            }

        }
    }

    public void displayProductionStaff() {
        for (Human people : list) {
            if (people instanceof ProductionStaff) {
                System.out.println(people);
            }
        }
    }

    public void comparatorSalary() {
        Collections.sort(list, new ComparatorSalary());
    }

    public void comparatorName() {
        Collections.sort(list, new ComparatorName());
    }
}
/**
 * iii: Có nên dùng vòng lặp truyền thống (for i = 0 -> size() – 1 => get(i))
 * để duyệt qua từng phần tử có trong LinkedList hay không? Lý do?
 * -Lời khuyên là vẫn nên dùng for i để duyệt qua mảng.
 * vì ở đây ta chỉ hiển thị thôi =)))))
 * <p>
 * iv: Giả sử công ty ABC thay đổi nhân sự liên tục (xóa và thêm nhân viên)
 * thì nên sử dụng ArrayList hay LinkedList? Lý do?
 * - LinkedList vì nó tốt hơn trong việc xóa + thêm..
 * <p>
 * v: Ưu và nhược điểm của ArrayList và LinkedList.
 * -Ưu: ArrayList lấy đc vị trí index của phần tử nhanh hơn LinkedList.
 * -Nhược: ArrayList thao tác xóa + thêm chậm hơn LinkedList.
 * <p>
 * vi: Suy nghĩ xem class cha có cần phương thức abstract không? Vì sao?
 * -Có...vì lớp cha sẽ định nghĩa cái hành vi này và cho toàn bộ lớp con
 * định nghĩa lại hành vi đó phù hợp với từng đối tượng.
 * <p>
 * vii: Suy nghĩ xem phải tạo ra một interface có phương thức là chấm công rồi cho
 * nhân viên quản lý và nhân viên sản xuất implements lại phương thức này,
 * hay là viết phương thức abstract ở class cha? Vì sao?
 * -Nên viết 1 interface có phương thức chấm công vì obj nhân viên quản lý và
 * và nhân viên sản xuất mới có hành động chấm công này. Còn nhân viên công nhật thì không có.
 * Nếu ta viết 1 abstract method thì tất cả lớp con phải kế thừa lại method chấm công này.
 * Như vậy là sai.
 * <p>
 * vii: Suy nghĩ xem khi nào nên dùng interface, khi nào nên dùng abstract class,
 * khi nào cần có phương thức abstract ở class cha?
 * - Dùng interface khi khi ta định nghĩa 1 phương thức cho 1 vài lớp con.
 * - Dùng abstract class thì ta muốn toàn bộ lớp con kế thừa phương thức ấy
 * hoặc để lớp con trở thành 1 class abstract.
 **/
