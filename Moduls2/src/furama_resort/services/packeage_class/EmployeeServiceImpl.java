package furama_resort.services.packeage_class;

import furama_resort.controllers.AllMethod;
import furama_resort.models.persons.Employee;
import furama_resort.services.package_impl.EmployeeService;
import furama_resort.services.utils.ReadAndWrite;
import furama_resort.services.utils.RegexData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static Scanner input = new Scanner(System.in);
    private final String REGEX_ID = "^[0-9]{3}$";
    private final String REGEX_AGE = "^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$";

    List<Employee> arrayEmployee = new ArrayList<>();
    private final String LINK = "D:\\C0322G1-LeHuuPhuongDong\\Moduls2\\src\\furama_resort\\files\\employee.csv";


    public String level() {
        do {
            System.out.println("1.Intermediate. \n" +
                    "2.Colleges. \n" +
                    "3.University. \n" +
                    "4.After University.\n" +
                    "5.Return main Menu");
            System.out.println("Enter level: ");

            int level = Integer.parseInt(input.nextLine());

            switch (level) {
                case 1:
                    return "Intermediate";
                case 2:
                    return "Colleges";
                case 3:
                    return "University";
                case 4:
                    return "After University";
                default:
                    System.err.println("You entered it wrong, please re-enter.");
            }
        } while (true);
    }

    public String position() {
        do {
            System.out.println("1.Receptionist \n" +
                    "2.Staff. \n" +
                    "3.Expert. \n" +
                    "4.Supervision. \n" +
                    "5.Manage. \n" +
                    "6.CEO.");
            System.out.println("Choose is here:");

            int choosePosition = Integer.parseInt(input.nextLine());

            switch (choosePosition) {
                case 1:
                    return "Receptionist";
                case 2:
                    return "Staff";
                case 3:
                    return "Expert";
                case 4:
                    return "Supervition";
                case 5:
                    return "Manage";
                case 6:
                    return "CEO";
                default:
                    System.err.println("You entered it wrong, please re-enter.");
                    break;
            }
        } while (true);
    }

    @Override
    public void display() {
        List<String[]> list = ReadAndWrite.readFile(LINK);

        for (String[] item : list) {
            Employee employee1 = new Employee(Integer.parseInt(item[0]), item[1], item[2],
                    item[3], Integer.parseInt(item[4]), Long.parseLong(item[5]),
                    item[6], item[7], item[8], Integer.parseInt(item[9]));
            arrayEmployee.add(employee1);
        }
        for (Employee person :
                arrayEmployee) {
            System.out.println(person);
        }
    }

    @Override
    public void add() {
        List<String[]> list = ReadAndWrite.readFile(LINK);

        for (String[] item : list) {
            Employee employee1 = new Employee(Integer.parseInt(item[0]), item[1], item[2],
                    item[3], Integer.parseInt(item[4]), Long.parseLong(item[5]),
                    item[6], item[7], item[8], Integer.parseInt(item[9]));
            arrayEmployee.add(employee1);
        }
        int code = Integer.parseInt(idEmployee());

        System.out.println("Enter name to add: ");
        String name = input.nextLine();

        System.out.println("Date of employee: ");
        String date = RegexData.regexAge(input.nextLine(), REGEX_AGE);

        System.out.println("Gender of employee is: ");
        String gender = AllMethod.getGender();

        System.out.println("CMND of employee is: ");
        int cmnd = Integer.parseInt(input.nextLine());

        System.out.println("Number phone of employee is: ");
        long numberPhone = Integer.parseInt(input.nextLine());

        System.out.println("Email is: ");
        String email = input.nextLine();

        System.out.println("Level of employee: ");
        String level = level();

        System.out.println("Position of employee is: ");
        String position = position();
        System.out.println("Salary of employee is: ");

        int salary = Integer.parseInt(input.nextLine());

        Employee e = new Employee(code, name, date, gender, cmnd, numberPhone, email, level, position, salary);
        arrayEmployee.add(e);

        String str = "";

        for (Employee employee : arrayEmployee) {
            str += employee.getInfo() + "\n";
        }

        ReadAndWrite.writeFile(LINK, str);

        System.out.println("Add employee success!");
    }

    @Override
    public void update() {
        System.out.println("You need CODE EMPLOYEE to update \n" +
                "1.I known \n" +
                "2.I will show listing for you search Employee CODE.");

        int knowCode = Integer.parseInt(input.nextLine());

        switch (knowCode) {
            case 1:
                System.out.println("Enter code in here:");

                boolean flag = false;

                int code = Integer.parseInt(input.nextLine());

                Employee employee = new Employee();

                List<String[]> list = ReadAndWrite.readFile(LINK);
                for (String[] item : list) {

                    Employee employee1 = new Employee(Integer.parseInt(item[0]), item[1], item[2],
                            item[3], Integer.parseInt(item[4]), Long.parseLong(item[5]),
                            item[6], item[7], item[8], Integer.parseInt(item[9]));
                    arrayEmployee.add(employee1);
                }

                for (int i = 0; i < arrayEmployee.size(); i++) {
                    if (code == arrayEmployee.get(i).getCode()) {
                        arrayEmployee.set(i, employee);

                        System.out.println("Enter name to update: ");
                        String nameToUpdate = input.nextLine();

                        System.out.println("Date of employee: ");
                        String dateToUpdate = input.nextLine();

                        System.out.println("Gender of employee is: ");
                        String genderToUpdate = AllMethod.getGender();

                        System.out.println("CMND of employee is: ");
                        int idToUpdate = Integer.parseInt(input.nextLine());

                        System.out.println("Number phone of employee is: ");
                        long numberPhoneToUpdate = Integer.parseInt(input.nextLine());

                        System.out.println("Email is: ");
                        String emailToUpdate = input.nextLine();

                        System.out.println("Level of employee: ");
                        String levelToUpdate = level();

                        System.out.println("Position of employee is: ");
                        String positionToUpdate = position();

                        System.out.println("Salary of employee is: ");
                        int salaryToUpdate = Integer.parseInt(input.nextLine());

                        employee.setCode(code);
                        employee.setName(nameToUpdate);
                        employee.setOld(dateToUpdate);
                        employee.setGender(genderToUpdate);
                        employee.setId(idToUpdate);
                        employee.setNumberPhone(numberPhoneToUpdate);
                        employee.setEmail(emailToUpdate);
                        employee.setLevel(levelToUpdate);
                        employee.setPosition(positionToUpdate);
                        employee.setSalary(salaryToUpdate);

                        String line = "";

                        for (int j = 0; j < arrayEmployee.size(); j++) {
                            line += arrayEmployee.get(j).getCode() + "," + arrayEmployee.get(j).getName() + "," + arrayEmployee.get(j).getOld()
                                    + "," + arrayEmployee.get(j).getGender() + "," + arrayEmployee.get(j).getId() + "," + arrayEmployee.get(j).getNumberPhone()
                                    + "," + arrayEmployee.get(j).getEmail() + "," + arrayEmployee.get(j).getLevel() + "," + arrayEmployee.get(j).getPosition()
                                    + "," + arrayEmployee.get(j).getSalary() + "\n";
                        }
                        ReadAndWrite.writeFile(LINK, line);

                        System.out.println("Update success!");

                        flag = true;

                    }
                }
                if (!flag) {
                    System.out.println("I NOT found code of this Employee.");
                }
                break;
            case 2:
                display();
                break;
            default:
                System.err.println("You entered it wrong, please re-enter");
        }

    }

    public String idEmployee() {
        System.out.println("Enter id of Employee.");
        return RegexData.regexStr(input.nextLine(), REGEX_ID, "Input in the form XXX is 3 positive integers");
    }

}
