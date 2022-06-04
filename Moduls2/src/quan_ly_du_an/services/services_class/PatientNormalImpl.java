package quan_ly_du_an.services.services_class;

import quan_ly_du_an.exception.CodePatientException;
import quan_ly_du_an.exception.LocalTimeException;
import quan_ly_du_an.exception.Regex;
import quan_ly_du_an.files_data.ReadAndWrite;
import quan_ly_du_an.person.PatientNormal;
import quan_ly_du_an.services.services_impl.PatientNormalService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PatientNormalImpl implements PatientNormalService {
    static Scanner input = new Scanner(System.in);

    List<PatientNormal> listNormal = new ArrayList<>();

    private static final String LINK = "src/quan_ly_du_an/files_data/patient_normal.csv";

    List<String[]> list;

    @Override
    public void list() {
        list = ReadAndWrite.readFile(LINK);

        for (String[] item : list) {
            PatientNormal patientVip1 = new PatientNormal(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4],
                    item[5], item[6], Double.parseDouble(item[7]));
            listNormal.add(patientVip1);
        }

        for (String[] patient : list) {
            System.out.println(Arrays.toString(patient));
        }
    }

    @Override
    public void add() {
        list = ReadAndWrite.readFile(LINK);

        for (String[] item : list) {
            PatientNormal patientVip1 = new PatientNormal(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4],
                    item[5], item[6], Double.parseDouble(item[7]));
            listNormal.add(patientVip1);
        }
        System.out.println("Số thứ tự bệnh án: ");
        int number = listNormal.size() + 1;


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


        System.out.println("Tổng tiền:  ");
        double money = Double.parseDouble(input.nextLine());


        PatientNormal normal = new PatientNormal(number, codeBa, codeBn, name, firstDay, lastDay, reason, money);
        listNormal.add(normal);

        String line = "";

        for (PatientNormal normal1 : listNormal) {
            line += normal1.inFor() + "\n";
        }
        ReadAndWrite.writeFile(LINK, line);
        System.out.println("Thêm mới bệnh án của bênh nhân thành công.");
    }

    @Override
    public void delete() {
        list = ReadAndWrite.readFile(LINK);

        for (String[] item : list) {
            PatientNormal patientVip1 = new PatientNormal(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4],
                    item[5], item[6], Double.parseDouble(item[7]));
            listNormal.add(patientVip1);
        }
        System.out.println("Để xóa bệnh án bạn cần biết Mã bệnh án: \n" +
                "1. Tôi đã biết. \n" +
                "2. Cho tôi xem lại. \n" +
                "Chọn số?.");

        int hold = Integer.parseInt(input.nextLine());

        switch (hold) {
            case 1:
                System.out.println("Nhập mã Bệnh án tại đây: ");

                boolean flag = false;

                int code = Integer.parseInt(input.nextLine());

                for (int i = 0; i < listNormal.size(); i++) {
                    if (code == listNormal.get(i).getNumericalOder()) {
                        System.out.println("Bạn có chắc xóa bệnh án này không? \n" +
                                "1. Có. \n" +
                                "2. Không. \n" +
                                "Lựa chọn của bạn? ");

                        int choose = Integer.parseInt(input.nextLine());

                        switch (choose) {
                            case 1:
                                listNormal.remove(listNormal.get(i));

                                System.out.println("Xóa bệnh án thành công.");

                                flag = true;

                                ReadAndWrite.writeFileRemove(LINK);

                                String line = "";

                                for (PatientNormal normal1 : listNormal) {
                                    line += normal1.inFor() + "\n";
                                }

                                ReadAndWrite.writeFile(LINK, line);

                                list();
                                break;
                            case 2:
                                return;
                            default:
                                System.err.println("Vui lòng nhập đúng.");
                        }

                    }
                }
                if (!flag) {
                    System.out.println("Tôi tìm không thấy mã bệnh án.");
                }
                break;
            case 2:
                break;
            default:
                System.err.println("Mời chọn lại!");
        }

    }

}
