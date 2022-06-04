package quan_ly_du_an.services.services_class;

import quan_ly_du_an.files_data.ReadAndWrite;
import quan_ly_du_an.person.PatientVip;
import quan_ly_du_an.services.services_impl.PatientVipService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PatientVipImpl implements PatientVipService {
    static Scanner input = new Scanner(System.in);

    List<PatientVip> patientVips = new ArrayList<>();

    private static final String LINK_VIP = "src/quan_ly_du_an/files_data/patient_vip.csv";

    List<String[]> list;

    @Override
    public void list() {
        list = ReadAndWrite.readFile(LINK_VIP);

        for (String[] item : list) {
            PatientVip patientVip1 = new PatientVip(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4],
                    item[5], item[6], item[7], LocalDate.parse(item[8]));
            patientVips.add(patientVip1);
        }
        for (String[] patient : list) {
            System.out.println(Arrays.toString(patient));
        }
    }

    @Override
    public void add() {
        list = ReadAndWrite.readFile(LINK_VIP);

        for (String[] item : list) {
            PatientVip patientVip1 = new PatientVip(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4],
                    item[5], item[6], item[7], LocalDate.parse(item[8]));
            patientVips.add(patientVip1);
        }
        System.out.println("Số thứ tự bệnh án: ");
        int number = list.size() + 1;

        System.out.println("Mã bệnh án: ");
        String codeBa = input.nextLine();

        System.out.println("Mã bệnh nhân: ");
        String codeBn = input.nextLine();

        System.out.println("Tên bệnh nhân: ");
        String name = input.nextLine();

        System.out.println("Ngày nhập viện: ");
        String firstDay = input.nextLine();

        System.out.println("Ngày xuất viện: ");
        String lastDay = input.nextLine();

        System.out.println("Lý do nhập viện: ");
        String reason = input.nextLine();

        String combo = getVip2();

        System.out.println("Vui lòng nhập thời hạn của gói VIP: ");
        LocalDate time = LocalDate.parse(input.nextLine());

        PatientVip patientVip = new PatientVip(number, codeBa, codeBn, name, firstDay, lastDay, reason, combo, time);
        patientVips.add(patientVip);
        String line = "";
        for (PatientVip patientVip1 : patientVips) {
            line += patientVip1.inFor() + "\n";
        }
        ReadAndWrite.writeFile(LINK_VIP, line);

        System.out.println("Thêm mới bệnh án của bênh nhân thành công.");
    }

    @Override
    public void delete() {

    }

    public static String getVip2() {

        do {
            System.out.println("Bạn muốn chọn gói VIP nào: \n" +
                    "1. VIP I. \n" +
                    "2. VIP II. \n" +
                    "3. VIP III. \n" +
                    "Vui lòng chọn ở đây: ");
            try {
                int choose = Integer.parseInt(input.nextLine());
                switch (choose) {
                    case 1:
                        return "VIP I";
                    case 2:
                        return "VIP II";
                    case 3:
                        return "VIP III";
                    default:
                        System.out.println("Gói bạn họn không hợp lệ. Hãy nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Xin đừng nhập chữ.!!");
            }
        } while (true);

    }

}
