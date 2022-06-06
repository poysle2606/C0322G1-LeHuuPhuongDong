package quan_ly_du_an.services.services_class;

import quan_ly_du_an.exception.CodePatientException;
import quan_ly_du_an.exception.LocalTimeException;
import quan_ly_du_an.exception.NotFoundMedialRecordException;
import quan_ly_du_an.exception.Regex;
import quan_ly_du_an.files_data.ReadAndWrite;
import quan_ly_du_an.person.PatientVip;
import quan_ly_du_an.services.services_impl.PatientVipService;

import java.util.*;

public class PatientVipImpl implements PatientVipService {
    static Scanner input = new Scanner(System.in);

    List<PatientVip> patientVips = new ArrayList<>();

    private static final String LINK_VIP = "src/quan_ly_du_an/files_data/patient_vip.csv";

    List<String[]> list;

    @Override
    public void list() {
        list = ReadAndWrite.readFile(LINK_VIP);
        if (list.isEmpty()) {
            System.err.println("Danh sách rỗng vui lòng nhập thêm dữ liệu.");
        }

        for (String[] item : list) {
            PatientVip patientVip1 = new PatientVip(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4],
                    item[5], item[6], item[7], item[8]);
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
                    item[5], item[6], item[7], item[8]);
            patientVips.add(patientVip1);
        }
        System.out.println("Số thứ tự bệnh án: ");
        int number = list.size() + 1;

        String codeBa;
        do {
            try {
                System.out.println("Mã bệnh án theo định dạng BA-XXXX (XXXX-là số từ 0-9): ");
                codeBa = input.nextLine();
                if (Regex.formatBa(codeBa)) {
                    break;
                } else {
                    throw new CodePatientException("Bạn nhập sai định dạng. xin nhập lại.");
                }
            } catch (CodePatientException e) {
                e.printStackTrace();
            }

        } while (true);

        String codeBn;
        do {
            try {
                System.out.println("Mã bệnh nhân theo định dạng BN-XXXX (XXXX-là số từ 0-9): ");
                codeBn = input.nextLine();
                if (Regex.formatBn(codeBn)) {
                    break;
                } else {
                    throw new CodePatientException("Bạn nhập sai định dạng. xin nhập lại.");
                }
            } catch (CodePatientException e) {
                e.printStackTrace();
            }

        } while (true);

        System.out.println("Tên bệnh nhân: ");
        String name = input.nextLine();

        String firstDay;
        do {
            try {
                System.out.println("Ngày nhập viện phải nhập theo định dạng dd/MM/yyyy: ");
                firstDay = input.nextLine();
                if (Regex.formatDay(firstDay)) {
                    break;
                } else {
                    throw new LocalTimeException("Bạn nhập sai định dạng.");
                }

            } catch (LocalTimeException e) {
                e.printStackTrace();
            }

        } while (true);

        String lastDay;
        do {
            try {
                System.out.println("Ngày xuất viện phải nhập theo định dạng dd/MM/yyyy: ");
                lastDay = input.nextLine();
                if (Regex.formatDay(lastDay)) {
                    break;
                } else {
                    throw new LocalTimeException("Bạn nhập sai định dạng.");
                }
            } catch (LocalTimeException e) {
                e.printStackTrace();
            }

        } while (true);


        System.out.println("Lý do nhập viện: ");
        String reason = input.nextLine();

        String combo = getVip2();

        String timeVip;
        do {
            try {
                System.out.println("Thời hạn VIP nhập theo định dạng dd/MM/yyyy: ");
                timeVip = input.nextLine();
                if (Regex.formatDay(timeVip)) {
                    break;
                } else {
                    throw new LocalTimeException("Bạn nhập sai định dạng.");
                }
            } catch (LocalTimeException e) {
                e.printStackTrace();
            }

        } while (true);

        PatientVip patientVip = new PatientVip(number, codeBa, codeBn, name, firstDay, lastDay, reason, combo, timeVip);
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
        list = ReadAndWrite.readFile(LINK_VIP);

        for (String[] item : list) {
            PatientVip patientVip1 = new PatientVip(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4],
                    item[5], item[6], item[7], item[8]);
            patientVips.add(patientVip1);
        }
        do {
            System.out.println("Để xóa bệnh án bạn cần biết Mã bệnh án: \n" +
                    "1. Tôi đã biết. \n" +
                    "2. Cho tôi xem lại. \n" +
                    "3. Quay lại. \n" +
                    "Chọn số?.");

            int hold = Integer.parseInt(input.nextLine());

            switch (hold) {
                case 1:
                    System.out.println("Nhập mã Bệnh án tại đây: ");

                    try {
                        String code = input.nextLine();
                        boolean flag = false;

                        for (int i = 0; i < patientVips.size(); i++) {
                            if (Objects.equals(code, patientVips.get(i).getPatient())) {
                                System.out.println("Bạn có chắc xóa bệnh án này không? \n" +
                                        "1. Có. \n" +
                                        "2. Không. \n" +
                                        "Lựa chọn của bạn? ");

                                int choose = Integer.parseInt(input.nextLine());

                                switch (choose) {
                                    case 1:
                                        patientVips.remove(patientVips.get(i));

                                        System.out.println("Xóa bệnh án thành công.");


                                        ReadAndWrite.writeFileRemove(LINK_VIP);

                                        String line = "";

                                        for (PatientVip normal1 : patientVips) {
                                            line += normal1.inFor() + "\n";
                                        }

                                        ReadAndWrite.writeFile(LINK_VIP, line);

                                        list();
                                        flag = true;
                                        break;
                                    case 2:
                                        return;
                                    default:
                                        System.err.println("Vui lòng nhập đúng.");
                                }

                            }
                        }
                        if (!flag) {
                            throw new NotFoundMedialRecordException("Bệnh án không tồn tại.");
                        }
                    } catch (NotFoundMedialRecordException e) {
                        e.printStackTrace();
                    }
                    break;
                case 2:
                    for (int i = 0; i < patientVips.size(); i++) {
                        String code = patientVips.get(i).getPatient();
                        System.out.println(code);
                    }
                    break;
                default:
                    System.err.println("Mời chọn lại!");
            }
        } while (true);
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
