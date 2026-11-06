
import java.util.Scanner;

public class BasicJavaExamples {

    // 1. Display Welcome Message
    static void welcomeMessage() {
        System.out.println("Welcome to Java Programming!");
    }

    // 2. Variables and Data Types
    static void demonstrateDataTypes() {
        System.out.println("\n1. DATA TYPES");

        int age = 25;
        double salary = 45000.50;
        float percentage = 85.5f;
        char grade = 'A';
        boolean isLearning = true;
        String name = "Amol Tathe";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Learning Java: " + isLearning);
    }

    // 3. Arithmetic Operators
    static void arithmeticOperations() {
        System.out.println("\n2. ARITHMETIC OPERATORS");

        int a = 20;
        int b = 10;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));
    }

    // 4. Comparison Operators
    static void comparisonOperations() {
        System.out.println("\n3. COMPARISON OPERATORS");

        int x = 15;
        int y = 20;

        System.out.println("x == y: " + (x == y));
        System.out.println("x != y: " + (x != y));
        System.out.println("x > y: " + (x > y));
        System.out.println("x < y: " + (x < y));
        System.out.println("x >= y: " + (x >= y));
    }

    // 5. Logical Operators
    static void logicalOperations() {
        System.out.println("\n4. LOGICAL OPERATORS");

        int age = 25;
        boolean hasId = true;

        System.out.println("AND: " + (age >= 18 && hasId));
        System.out.println("OR: " + (age >= 18 || hasId));
        System.out.println("NOT: " + (!hasId));
    }

    // 6. Type Casting
    static void typeCasting() {
        System.out.println("\n5. TYPE CASTING");

        int number = 100;
        double converted = number;

        double value = 99.99;
        int convertedValue = (int) value;

        System.out.println("Widening: " + converted);
        System.out.println("Narrowing: " + convertedValue);
    }

    // 7. User Input
    static void userInputExample() {
        System.out.println("\n6. USER INPUT");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        // Scanner is closed in main after all operations.
    }

    public static void main(String[] args) {

        System.out.println("===== BASIC JAVA EXAMPLES =====");

        welcomeMessage();
        demonstrateDataTypes();
        arithmeticOperations();
        comparisonOperations();
        logicalOperations();
        typeCasting();

        userInputExample();

        System.out.println("\nBasic Java Examples Completed!");
    }
}
