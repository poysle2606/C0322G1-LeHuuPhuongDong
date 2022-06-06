package quan_ly_du_an.controllers;

import quan_ly_du_an.services.services_class.PatientNormalImpl;
import quan_ly_du_an.services.services_class.PatientVipImpl;


import java.util.Scanner;

public class AllMethod {
    static Scanner input = new Scanner(System.in);

    public static void addPatient() {
        do {
            System.out.println("Bạn muốn thêm Bệnh án cho bệnh nhân thường hay VIP: \n" +
                    "1. Bệnh án của bệnh nhân thường. \n" +
                    "2. Bệnh án của bệnh nhân VIP. \n" +
                    "3. Quay lại Menu chính. \n" +
                    "Bạn chọn số?");
            try {
                int choose = Integer.parseInt(input.nextLine());
                PatientNormalImpl normal = new PatientNormalImpl();
                PatientVipImpl vip = new PatientVipImpl();
                switch (choose) {
                    case 1:
                        normal.add();
                        break;
                    case 2:
                        vip.add();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Vui lòng nhập đúng số.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Không được nhập chữ vào đây!!");
            }
        } while (true);
    }

    public static void displayPatient() {


        do {
            System.out.println("Bạn muốn hiển thị danh sách theo dạng? \n" +
                    "1. Danh sách bệnh án của bệnh nhân thường. \n" +
                    "2. Danh sách bệnh án của bệnh nhân VIP. \n" +
                    "3. Quay lại Menu chính.\n" +
                    "Bạn chọn chức năng nào?.");
            try {
                int choose = Integer.parseInt(input.nextLine());
                PatientNormalImpl normal = new PatientNormalImpl();
                PatientVipImpl vip = new PatientVipImpl();
                switch (choose) {
                    case 1:
                        normal.list();
                        break;
                    case 2:
                        vip.list();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Vui lòng nhập đúng số.");

                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                System.err.println("Vui lòng đừng nhập chữ. xin nhập lại.");
            }
        } while (true);
    }

    public static void deletePatient() {
        do {
            System.out.println("Bạn muốn xóa bệnh án của? \n" +
                    "1. Danh sách bệnh án của bệnh nhân thường. \n" +
                    "2. Danh sách bệnh án của bệnh nhân VIP. \n" +
                    "3. Quay lại Menu chính.\n" +
                    "Bạn chọn chức năng nào?.");
            try {
                int choose = Integer.parseInt(input.nextLine());
                PatientNormalImpl normal = new PatientNormalImpl();
                PatientVipImpl vip = new PatientVipImpl();
                switch (choose) {
                    case 1:
                        normal.delete();
                        break;
                    case 2:
                        vip.delete();
                        break;
                    case 3:
                        return;
                    default:
                        System.err.println("Vui lòng nhập đúng số.");

                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng đừng nhập chữ. xin nhập lại.");
            }
        } while (true);
    }
}
