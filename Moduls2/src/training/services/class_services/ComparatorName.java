package training.services.class_services;

import training.person.Human;

import java.util.Comparator;

public class ComparatorName implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        if (o1.getName().compareTo(o2.getName()) < 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) > 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
/**
 * i: Muốn sử dụng comparator thì cần làm gì?
 * -tạo class riêng =))))
 * <p>
 * ii: Muốn sử dụng comparable thì cần làm gì?
 * -implements tại class cha.
 * <p>
 * iii: Suy nghĩ xem nên sử dụng Comparable hay Comparator? Vì sao?
 * -Nên dùng Comparator vì tình linh hoạt.
 * Comparable chỉ i implements cho lớp đối tượng cần được so sánh.
 **/