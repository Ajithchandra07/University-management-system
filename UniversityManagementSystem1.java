import java.util.Scanner;

class Person {
    public String name;
    public int age;
    public int salary;
    public String grade;
    public int studentClass;

    public Person(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
}

class Teacher extends Person {
    public Teacher(String name, int age, int salary) {
        super(name, age, salary);
    }

    public void details() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person {
    public Student(String name, String grade, int studentClass) {
        super(name, 0, 0);
        this.grade = grade;
        this.studentClass = studentClass;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Class: " + studentClass);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        int choice;

        while (true) {
            System.out.println("1. Teacher");
            System.out.println("2. Student");
            System.out.println("3. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:

        System.out.println("Enter the number of teachers:");
        n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of teacher " + (i + 1));
            System.out.println("Enter the name:");
            String name = sc.nextLine();
            System.out.println("Enter the age:");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter the salary:");
            int salary = sc.nextInt();
            sc.nextLine();

            Teacher teacher = new Teacher(name, age, salary);
            teacher.details();
            System.out.println();
        }
Case 2:

        System.out.println("Enter the number of students:");
        m = sc.nextInt();
        sc.nextLine();

        for (int j = 0; j < m; j++) {
            System.out.println("Enter the details of student " + (j + 1));
            System.out.println("Enter the name:");
            String name = sc.nextLine();
            System.out.println("Enter the grade:");
            String grade = sc.nextLine();
            System.out.println("Enter the class:");
            int studentClass = sc.nextInt();
            sc.nextLine();

            Student student = new Student(name, grade, studentClass);
            student.display();
            System.out.println();
        }
         case 3:
                              System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }