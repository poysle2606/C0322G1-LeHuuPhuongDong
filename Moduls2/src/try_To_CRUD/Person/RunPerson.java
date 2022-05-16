package try_To_CRUD.Person;


import java.util.Scanner;

public class RunPerson {
    public static Person[] personBig = new Person[100];
    static Scanner input = new Scanner(System.in);
    static int countOfTeacher;
    static int countOfStudent;
    static int index;

    static {
        personBig[0] = new Teacher(1, " John", 30, "Men", 6000000);
        personBig[1] = new Teacher(2, " Jax", 27, "Men", 5000000);
        personBig[2] = new Teacher(3, " Jap", 27, "Men", 5000000);
        personBig[3] = new Student(1, " Austine", 27, "Men", 7.0);
        personBig[4] = new Student(2, " Marry", 19, "Women", 8.5);
        countOfTeacher = 4;
        countOfStudent = 3;
        index = 5;
    }

    public static void display() {
        System.out.println("Which list you want to display?");
        System.out.println("1.List Teacher and Student \n" +
                "2.List Teacher. \n" +
                "3.List Student.");
        System.out.println("Your choose is: ");
        int chooseDisplay = Integer.parseInt(input.nextLine());
        switch (chooseDisplay) {
            case 1:
                System.out.println("List of the Teacher and Student");
                for (Person total : personBig) {
                    if (total != null)
                        System.out.println(total);
                }
                break;
            case 2:
                System.out.println("This is the Teacher list:");
                for (Person teacher : personBig) {
                    if (teacher instanceof Teacher) {
                        System.out.println(teacher);
                    }
                }
                break;
            case 3:
                System.out.println("This is the Student list:");
                for (Person student : personBig) {
                    if (student instanceof Student) {
                        System.out.println(student);
                    }
                }
                break;
        }
    }

    public static void addPerson() {
        int numberChooseToAdd;
        do {
            System.out.println(" You want to add Teacher or Student? \n " +
                    "1. Teacher. \n" +
                    " 2. Student.");
            numberChooseToAdd = Integer.parseInt(input.nextLine());
        } while (numberChooseToAdd > 2);
        switch (numberChooseToAdd) {
            case 1:
                System.out.println("Name of Teacher is: ");
                String name = input.nextLine();
                System.out.println("ID already available ");
                int id = countOfTeacher;
                System.out.println("Old of Teacher is: ");
                int old = Integer.parseInt(input.nextLine());
                System.out.println("Gender is: ");
                String gender = input.nextLine();
                System.out.println("Salary is: ");
                double salary = Double.parseDouble(input.nextLine());
                Teacher teacher = new Teacher(id, name, old, gender, salary);
                personBig[index] = teacher;
                countOfTeacher++;
                index++;
                System.out.println("Add new Teacher success!");
                break;
            case 2:
                System.out.println("Name of Student is: ");
                String name1 = input.nextLine();
                System.out.println("ID already available");
                int id1 = countOfStudent;
                System.out.println("Old of Student is: ");
                int old1 = Integer.parseInt(input.nextLine());
                System.out.println("Gender is: ");
                String gender1 = input.nextLine();
                System.out.println("Point is: ");
                double point = Double.parseDouble(input.nextLine());
                Student student = new Student(id1, name1, old1, gender1, point);
                personBig[index] = student;
                countOfStudent++;
                index++;
                System.out.println("Add new Student success!");
                break;
        }
    }

    public static void delete() {
        int numberChooseToDelete;
        do {
            System.out.println("You need to know ID to delete.");
            System.out.println("You want to delete Teacher or Student? \n" +
                    "1. Teacher. \n" +
                    " 2. Student. \n");
            numberChooseToDelete = Integer.parseInt(input.nextLine());
        } while (numberChooseToDelete > 2);
        switch (numberChooseToDelete) {
            case 1:
                System.out.println("Enter ID of Teacher to delete:");
                int numberIdOfTeacher = Integer.parseInt(input.nextLine());
                boolean flag = false;
                for (int i = 0; i < personBig.length; i++) {
                    if (personBig[i] != null && numberIdOfTeacher == personBig[i].getId()) {
                        for (int j = i; j < personBig.length - 1; j++) {
                            personBig[j] = personBig[j + 1];
                            flag = true;

                        }

                    }
                    personBig[countOfTeacher] = null;

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
                for (int i = 0; i < personBig.length; i++) {
                    if (personBig[i] != null && numberIdOfStudent == personBig[i].getId()) {
                        for (int j = i; j < personBig.length - 1; j++) {
                            personBig[j] = personBig[j + 1];
                            flag1 = true;
                        }
                    }
                    personBig[countOfStudent] = null;
                }
                System.out.println("Delete success!");
                if (!flag1) {
                    System.out.println("Not found Id!");

                }
                break;
        }
    }

    public static void search() {
        int numberToSearch;
        do {
            System.out.println("You want to search name of Teacher or Student: \n" +
                    "1. Teacher. \n" +
                    "2. Student. \n");
            System.out.println("Your choose is: ");
            numberToSearch = Integer.parseInt(input.nextLine());
        } while (numberToSearch > 2);
        switch (numberToSearch) {
            case 1:
                System.out.println("Are you looking for?");
                String nameToFind = input.nextLine();
                boolean flagOfTeacher = false;
                for (Person teacher : personBig) {
                    if (teacher != null && teacher.getName().contains(nameToFind)) {
                        System.out.println(teacher);
                        flagOfTeacher = true;

                    }
                }
                if (!flagOfTeacher) {
                    System.out.println("Sorry not found Name of Teacher");
                }
                break;
            case 2:
                System.out.println("Are you looking for?:");
                String nameOfStudent = input.nextLine();
                boolean flagOfStudent = false;
                for (Person student : personBig) {
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
