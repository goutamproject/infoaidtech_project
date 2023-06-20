import java.util.ArrayList;
import java.util.Scanner;

// A class to represent a student
class Student {
  // Instance variables
  private String name;
  private int id;
  private double gpa;

  // Constructor
  public Student(String name, int id, double gpa) {
    this.name = name;
    this.id = id;
    this.gpa = gpa;
  }

  // Getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  // A method to display the student information
  public void display() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("GPA: " + gpa);
    System.out.println();
  }
}

// A class to manage the student records
class StudentManager {
  // A list to store the students
  private ArrayList<Student> students;

  // A scanner to read user input
  Scanner scanner;

  // Constructor
  public StudentManager() {
    students = new ArrayList<>();
    scanner = new Scanner(System.in);
  }

  // A method to add a new student
  public void addStudent() {
    System.out.println("Enter the name of the student:");
    String name = scanner.nextLine();
    System.out.println("Enter the ID of the student:");
    int id = scanner.nextInt();
    System.out.println("Enter the GPA of the student:");
    double gpa = scanner.nextDouble();
    scanner.nextLine(); // Consume the newline

    // Create a new student object and add it to the list
    Student student = new Student(name, id, gpa);
    students.add(student);

    System.out.println("Student added successfully.");
    System.out.println();
  }

  // A method to remove a student by ID
  public void removeStudent() {
    System.out.println("Enter the ID of the student to remove:");
    int id = scanner.nextInt();
    scanner.nextLine(); // Consume the newline

    // Find the student with the given ID and remove it from the list
    boolean found = false;
    for (int i = 0; i < students.size(); i++) {
      Student student = students.get(i);
      if (student.getId() == id) {
        students.remove(i);
        found = true;
        break;
      }
    }

    if (found) {
      System.out.println("Student removed successfully.");
      System.out.println();
    } else {
      System.out.println("Student not found.");
      System.out.println();
    }
    
  }

  // A method to display all the students
  public void displayStudents() {
    System.out.println("The list of students is:");
    for (Student student : students) {
      student.display();
    }
    
  }

}

// A class to test the program
class Main {
  
  public static void main(String[] args) {

    // Create a student manager object
    StudentManager manager = new StudentManager();

    // A loop to display the menu and perform actions
    boolean exit = false;
    
    while (!exit) {

      // Display the menu
      System.out.println("Welcome to the Student Manager Program");
      System.out.println("Please choose an option:");
      System.out.println("1. Add a new student");
      System.out.println("2. Remove a student by ID");
      System.out.println("3. Display all the students");
      System.out.println("4. Exit");

      // Read the user choice
      int choice = manager.scanner.nextInt();
      manager.scanner.nextLine(); // Consume the newline

      // Perform actions based on the choice
      switch (choice) {
        case 1:
          manager.addStudent();
          break;
        case 2:
          manager.removeStudent();
          break;
        case 3:
          manager.displayStudents();
          break;
        case 4:
          exit = true;
          break;
        default:
          System.out.println("Invalid option. Please try again.");
          break;
      }
      }

    // Close the scanner
    manager.scanner.close();

    System.out.println("Thank you for using the program. Goodbye.");
    
  }
}
