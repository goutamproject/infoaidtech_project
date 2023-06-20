
    import java.util.Scanner;

// A class to perform temperature conversions
class TemperatureConverter {

  // A scanner to read user input
  Scanner scanner;

  // Constructor
  public TemperatureConverter() {
    scanner = new Scanner(System.in);
  }

  // A method to convert Celsius to Fahrenheit
  public double celsiusToFahrenheit(double celsius) {
    return celsius * 9 / 5 + 32;
  }

  // A method to convert Celsius to Kelvin
  public double celsiusToKelvin(double celsius) {
    return celsius + 273.15;
  }

  // A method to convert Fahrenheit to Celsius
  public double fahrenheitToCelsius(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

  // A method to convert Fahrenheit to Kelvin
  public double fahrenheitToKelvin(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9 + 273.15;
  }

  // A method to convert Kelvin to Celsius
  public double kelvinToCelsius(double kelvin) {
    return kelvin - 273.15;
  }

  // A method to convert Kelvin to Fahrenheit
  public double kelvinToFahrenheit(double kelvin) {
    return (kelvin - 273.15) * 9 / 5 + 32;
  }

}

// A class to test the program
class Main {

  public static void main(String[] args) {

    // Create a temperature converter object
    TemperatureConverter converter = new TemperatureConverter();

    // A loop to display the menu and perform actions
    boolean exit = false;

    while (!exit) {

      // Display the menu
      System.out.println("Welcome to the Temperature Converter Program");
      System.out.println("Please choose an option:");
      System.out.println("1. Convert Celsius to Fahrenheit");
      System.out.println("2. Convert Celsius to Kelvin");
      System.out.println("3. Convert Fahrenheit to Celsius");
      System.out.println("4. Convert Fahrenheit to Kelvin");
      System.out.println("5. Convert Kelvin to Celsius");
      System.out.println("6. Convert Kelvin to Fahrenheit");
      System.out.println("7. Exit");

      // Read the user choice
      int choice = converter.scanner.nextInt();
      converter.scanner.nextLine(); // Consume the newline

      // Perform actions based on the choice
      switch (choice) {
        case 1:
          System.out.println("Enter the temperature in Celsius:");
          double celsius = converter.scanner.nextDouble();
          converter.scanner.nextLine(); // Consume the newline
          double fahrenheit = converter.celsiusToFahrenheit(celsius);
          System.out.printf("%.2f°C is equal to %.2f°F\n", celsius, fahrenheit);
          break;
        case 2:
          System.out.println("Enter the temperature in Celsius:");
          celsius = converter.scanner.nextDouble();
          converter.scanner.nextLine(); // Consume the newline
          double kelvin = converter.celsiusToKelvin(celsius);
          System.out.printf("%.2f°C is equal to %.2fK\n", celsius, kelvin);
          break;
        case 3:
          System.out.println("Enter the temperature in Fahrenheit:");
          fahrenheit = converter.scanner.nextDouble();
          converter.scanner.nextLine(); // Consume the newline
          celsius = converter.fahrenheitToCelsius(fahrenheit);
          System.out.printf("%.2f°F is equal to %.2f°C\n", fahrenheit, celsius);
          break;
        case 4:
          System.out.println("Enter the temperature in Fahrenheit:");
          fahrenheit = converter.scanner.nextDouble();
          converter.scanner.nextLine(); // Consume the newline
          kelvin = converter.fahrenheitToKelvin(fahrenheit);
          System.out.printf("%.2f°F is equal to %.2fK\n", fahrenheit, kelvin);
          break;
        case 5:
          System.out.println("Enter the temperature in Kelvin:");
          kelvin = converter.scanner.nextDouble();
          converter.scanner.nextLine(); // Consume the newline
          celsius = converter.kelvinToCelsius(kelvin);
          System.out.printf("%.2fK is equal to %.2f°C\n", kelvin, celsius);
          break;
        case 6:
          System.out.println("Enter the temperature in Kelvin:");
          kelvin = converter.scanner.nextDouble();
          converter.scanner.nextLine(); // Consume the newline
          fahrenheit = converter.kelvinToFahrenheit(kelvin);
          System.out.printf("%.2fK is equal to %.2f°F\n", kelvin, fahrenheit);
          break;
        case 7:
          exit = true;
          break;
        default:
          System.out.println("Invalid option. Please try again.");
          break;
      }

      System.out.println();

    }

    // Close the scanner
    converter.scanner.close();

    System.out.println("Thank you for using the program. Goodbye.");

  }
}


