package furama_resort.services;

import furama_resort.controllers.FuramaControllers;
import furama_resort.models.persons.Employee;
import furama_resort.models.persons.Person;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    static ArrayList<Person> arrayEmployee = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static int countCode;

    static {
        arrayEmployee.add(new Employee(100, "Dong", 25, "Men", 1001, 383178456, "dongle2606@gmail.com", "Intermediate", "Truong phong", 6000000));
        arrayEmployee.add(new Employee(101, "Duc", 24, "Woman", 1002, 383178456, "ducga113@gmail.com", "University", "Pho Truong phong", 5500000));
        arrayEmployee.add(new Employee(102, "Huy", 26, "Woman", 1003, 383178456, "huyhaihuoc@gmail.com", "Colleges", "To Truong", 5000000));
        arrayEmployee.add(new Employee(103, "Khan", 28, "Men", 1004, 383178456, "khanpro@gmail.com", "University", "Nhan vien", 4000000));
        countCode = 104;
    }

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
                    System.out.println("If you entered it wrong, please re-enter it.");
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
                    System.out.println("If you entered it wrong, please re-enter it.");
                    break;
            }
        } while (true);
    }

    @Override
    public void display() {
        for (Person person :
                arrayEmployee) {
            System.out.println(person);
        }
    }

    @Override
    public void addPerson() {
        System.out.println("Employee Code is auto increase!");
        int code = countCode++;
        System.out.println("Enter name to add: ");
        String name = input.nextLine();
        System.out.println("Date of employee: ");
        int date = Integer.parseInt(input.nextLine());
        System.out.println("Gender of employee is: ");
        String gender = input.nextLine();
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
        arrayEmployee.add(new Employee(code, name, date, gender, cmnd, numberPhone, email, level, position, salary));
        countCode++;
        System.out.println("Add employee success!");
    }

    @Override
    public void deletePerson() {
//        System.out.println("You need CODE EMPLOYEE to delete \n" +
//                "1.I known \n" +
//                "2.I need return.");
//        int knowCode = Integer.parseInt(input.nextLine());
//        switch (knowCode) {
//            case 1:
//                System.out.println("Enter code in here:");
//                int code = Integer.parseInt(input.nextLine());
//                for (Person human:
//                     arrayEmployee) {
//                    if(code == human.getId()) {
//                        arrayEmployee.remove(human.getId());
//                        System.out.println("Delete success!");
//                    } else {
//                        System.out.println("I not found CODE you need enter again");
//                    }
//                }
//            case 2:
//                display();
//     }
    }

    @Override
    public void updatePerson() {
        System.out.println("You need CODE EMPLOYEE to update \n" +
                "1.I known \n" +
                "2.I will show listing for you search Employee CODE.");
        int knowCode = Integer.parseInt(input.nextLine());
        switch (knowCode) {
            case 1:
                System.out.println("Enter code in here:");
                int code = Integer.parseInt(input.nextLine());
                Employee employee = new Employee();
                for (int i = 0; i < arrayEmployee.size(); i++) {
                    if (code == arrayEmployee.get(i).getCode()) {
                        arrayEmployee.set(i, employee);
                        System.out.println("Enter name to update: ");
                        String nameToUpdate = input.nextLine();
                        System.out.println("Date of employee: ");
                        int dateToUpdate = Integer.parseInt(input.nextLine());
                        System.out.println("Gender of employee is: ");
                        String genderToUpdate = input.nextLine();
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
                        System.out.println("Update success!");
                    }
                }
                break;
            case 2:
                display();
        }

    }
}
