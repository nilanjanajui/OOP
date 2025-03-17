package OOP;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

// Custom Exception
@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionExample {

    // Method that throws a custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        } else {
            System.out.println("Age is valid.");
        }
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        try {
            // Example of ArithmeticException
            System.out.print("Enter a number to divide 100: ");
            int number = scanner.nextInt();
            int result = 100 / number; // May throw ArithmeticException
            System.out.println("Result: " + result);

            // Example of ArrayIndexOutOfBoundsException
            System.out.print("Enter an index (0-4) to access an array: ");
            int index = scanner.nextInt();
            int[] numbers = {10, 20, 30, 40, 50};
            System.out.println("Array value at index " + index + ": " + numbers[index]);

            // Custom Exception Example
            System.out.print("Enter your age: ");
            int age = scanner.nextInt();
            checkAge(age); // May throw InvalidAgeException

            // File Reading Example
            System.out.println("Reading a file...");
            FileReader file = new FileReader("example.txt"); // May throw FileNotFoundException
            int data;
            while ((data = file.read()) != -1) {
                System.out.print((char) data);
            }
            file.close();

        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Cannot divide by zero.");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid index.");
        }
        catch (InvalidAgeException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        } 
        catch (IOException e) {
            System.out.println("IOException caught: File not found or error reading file.");
        } 
        finally {
            System.out.println("Finally block executed: Cleaning up resources.");
            scanner.close();
        }

        System.out.println("Program continues after exception handling.");
    }
}
