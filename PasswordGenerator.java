
    import java.util.Random;
import java.util.Scanner;

// A class to create a password generator
class PasswordGenerator {

  // A scanner to read user input
  Scanner scanner;

  // Constructor
  public PasswordGenerator() {
    scanner = new Scanner(System.in);
  }

  // A method to generate a random password
  public String generatePassword(int length, String charset) {
    // Create a random object
    Random random = new Random();

    // Create a string builder to store the password
    StringBuilder password = new StringBuilder();

    // Loop for the length of the password
    for (int i = 0; i < length; i++) {
      // Generate a random index from the character set
      int index = random.nextInt(charset.length());

      // Append the character at the index to the password
      password.append(charset.charAt(index));
    }

    // Convert the password to a string and return it
    return password.toString();
  }

}

// A class to test the program
class Main {

  public static void main(String[] args) {

    // Create a password generator object
    PasswordGenerator generator = new PasswordGenerator();

    // A loop to display the menu and perform actions
    boolean exit = false;

    while (!exit) {

      // Display the menu
      System.out.println("Welcome to the Password Generator Program");
      System.out.println("Please choose an option:");
      System.out.println("1. Generate a password");
      System.out.println("2. Exit");

      // Read the user choice
      int choice = generator.scanner.nextInt();
      generator.scanner.nextLine(); // Consume the newline

      // Perform actions based on the choice
      switch (choice) {
        case 1:
          System.out.println("Enter the length of the password:");
          int length = generator.scanner.nextInt();
          generator.scanner.nextLine(); // Consume the newline

          System.out.println("Enter the character set of the password:");
          String charset = generator.scanner.nextLine();

          String password = generator.generatePassword(length, charset);
          System.out.println("The generated password is: " + password);
          break;
        case 2:
          exit = true;
          break;
        default:
          System.out.println("Invalid option. Please try again.");
          break;
      }

      System.out.println();

    }

    // Close the scanner
    generator.scanner.close();

    System.out.println("Thank you for using the program. Goodbye.");

  }
}

    

