package TryToCRUD.Person;


import java.util.Arrays;
import java.util.Scanner;

public class RunPerson {
    public static Person[] personBig = new Person[200];
    public static Person[] personTeacher = new Person[100];
    public static Person[] personStudent = new Person[100];
    static Scanner input = new Scanner(System.in);
    static int count;

    static {
        personTeacher[0] = new Teacher(1, " John", 30, "Men", 6000000);
        personTeacher[1] = new Teacher(2, " Jax", 27, "Men", 5000000);
        personStudent[0] = new Student(1, " Austine", 27, "Men", 7.0);
        personStudent[1] = new Student(2, " Marry", 19, "Women", 8.5);
        count = 3;
    }

    public static void display() {
        for (int i = 0; i < personTeacher.length; i++) {
            personBig[i] = personTeacher[i];
        }
        for (int i = 0; i < personStudent.length; i++) {
            personBig[personTeacher.length + i] = personStudent[i];
        }
        for (Person human : personBig) {
            if (human != null) {
                System.out.println(human);
            }
        }
    }

    public static void addPerson() {
        System.out.println(" You want to add Teacher or Student? \n " +
                "1. Teacher. \n" +
                "2. Student.");
        int numberChoose = Integer.parseInt(input.nextLine());
        switch (numberChoose) {
            case 1:
                System.out.println("Name of Teacher is: ");
                String name = input.nextLine();
                System.out.println("ID already available ");
                int id = count++;
                System.out.println("Old of Teacher is: ");
                int old = Integer.parseInt(input.nextLine());
                System.out.println("Gender is: ");
                String gender = input.nextLine();
                System.out.println("Salary is: ");
                double salary = Double.parseDouble(input.nextLine());
                Teacher teacher = new Teacher(id, name, old, gender, salary);
                personTeacher[count] = teacher;
                count++;
                System.out.println("Add new Teacher success!");
                break;
            case 2:
                System.out.println("Name of Student is: ");
                String name1 = input.nextLine();
                System.out.println("ID already available");
                int id1 = count++;
                System.out.println("Old of Teacher is: ");
                int old1 = Integer.parseInt(input.nextLine());
                System.out.println("Gender is: ");
                String gender1 = input.nextLine();
                System.out.println("Point is: ");
                double point = Double.parseDouble(input.nextLine());
                Student student = new Student(id1, name1, old1, gender1, point);
                personStudent[count] = student;
                count++;
                System.out.println("Add new Student success!");
                break;
        }
    }

    public static void delete() {
        System.out.println("You need to know ID to delete.");
        System.out.println("You want to delete Teacher or Student? \n" +
                "1. Teacher. \n" +
                "2. Student. \n" +
                "3.Return");
        int numberChoose = Integer.parseInt(input.nextLine());
        switch (numberChoose) {
            case 1:
                System.out.println("Enter ID of Teacher to delete:");
                int numberIdOfTeacher = Integer.parseInt(input.nextLine());
                boolean flag = false;
                for (int i = 0; i < personTeacher.length; i++) {
                    if (personTeacher[i] != null && numberIdOfTeacher == personTeacher[i].getId()) {
                        for (int j = i; j < personTeacher.length - 1; j++) {
                            personTeacher[j] = personTeacher[j + 1];
                            flag = true;

                        }

                    }
                    personTeacher[count] = null;

                }
                System.out.println("Delete success!");
                if (!flag) {
                    System.out.println("Not found ID!");

                }
                break;
            case 2:
                System.out.println("Enter ID of Student to delete:");
                int numberIdOfStudent = Integer.parseInt(input.nextLine());
                boolean flag1 = false;
                for (int i = 0; i < personStudent.length; i++) {
                    if (personStudent[i] != null && numberIdOfStudent == personStudent[i].getId()) {
                        for (int j = i; j < personStudent.length - 1; j++) {
                            personStudent[j] = personStudent[j + 1];
                            flag1 = true;
                        }
                    }
                    personStudent[count] = null;
                }
                System.out.println("Delete success!");
                if (!flag1) {
                    System.out.println("Not found Id!");

                }
                break;
        }
    }

    public static void search() {
        System.out.println("You want to search name of Teacher or Student: \n" +
                "1. Teacher. \n" +
                "2. Student. \n" +
                "3. Return");
        System.out.println("Your choose is: ");
        int choose = Integer.parseInt(input.nextLine());
        switch (choose) {
            case 1:
                System.out.println("Are you looking for?");
                String nameToFind = input.nextLine();
                boolean flagOfTeacher = false;
                for (Person teacher : personTeacher) {
                    if (teacher != null && teacher.getName().contains(nameToFind)) {
                        System.out.println(teacher);
                        flagOfTeacher = true;
                        break;
                    }
                }
                if (!flagOfTeacher) {
                    System.out.println("Sorry not found Name of Teacher");
                   break;
                }
            case 2:
                System.out.println("Are you looking for?:");
                String nameOfStudent = input.nextLine();
                boolean flagOfStudent = false;
                for (Person student : personStudent) {
                    if (student != null && student.getName().contains(nameOfStudent)) {
                        System.out.println(student);
                        flagOfStudent = true;
                        break;
                    }

                }
                if (!flagOfStudent) {
                    System.out.println("Sorry not found Name of Student");
                }
                break;
        }
    }


    public static void main(String[] args) {
        do {
            System.out.println("----Management Teacher and Student----");
            System.out.println("1. Display List. \n" +
                    "2. Add new Teacher(Student). \n" +
                    "3. Delete Teacher(Student). \n" +
                    "4. Search Teacher(Student). \n" +
                    "5. Exit Program.");
            System.out.println("Your choose is: ");
            int choose = Integer.parseInt(input.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("Display List: ");
                    display();
                    break;
                case 2:
                    addPerson();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.out.println("Exited program");
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
