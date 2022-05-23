package training.services.class_services;

import training.person.DailyWorkers;
import training.person.Human;
import training.person.ManagementStaff;
import training.person.ProductionStaff;

import java.util.HashMap;
import java.util.Map;

public class MapToSave {
    static Map<Integer, Human> map = new HashMap<>();

    static {
        map.put(1, new ManagementStaff("Đông", "26/06/1998", "Cẩm Lệ", 100000, 2.0));
        map.put(2, new DailyWorkers("Lê", "27/06/1998", "Cẩm Lệ", 20));
        map.put(3, new ProductionStaff("Phương", "28/06/1998", "Cẩm Lệ", 500));
    }

    public static void main(String[] args) {
        for (Integer human : map.keySet()) {
            System.out.println(map.get(human));
        }

    }
}
//keySet() trả về 1 danh sách chứa key dạng Map dưới dạng Set.
//get(human) để lấy đc giá trị chỗ key.
/**
 * Để biết 1 key có tồn tại hay không ta dùng containsKey để kiểm tra 1 key.
 * Nếu có trả về true nếu không thì trả về false.
 * if(map.containsKey(human)) {
 * System.out.println("Đã tồn tại key");
 * }else {
 * System.out.println("chưa thấy key");
 * }
 **/