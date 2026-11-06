
public class MethodExamples {

    // 1. Method Without Parameters
    static void greet() {
        System.out.println("Welcome to Java Programming!");
    }

    // 2. Method With Parameters
    static void displayName(String name) {
        System.out.println("Hello, " + name);
    }

    // 3. Method With Return Value
    static int add(int a, int b) {
        return a + b;
    }

    // 4. Subtraction
    static int subtract(int a, int b) {
        return a - b;
    }

    // 5. Multiplication
    static int multiply(int a, int b) {
        return a * b;
    }

    // 6. Division
    static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }

        return a / b;
    }

    // 7. Method Overloading
    static int calculate(int a, int b) {
        return a + b;
    }

    static double calculate(double a, double b) {
        return a + b;
    }

    // 8. Recursive Method
    static int factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                "Number cannot be negative."
            );
        }

        if (number <= 1) {
            return 1;
        }

        return number * factorial(number - 1);
    }

    // 9. Check Even or Odd
    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // 10. Find Maximum
    static int findMaximum(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {

        System.out.println("===== JAVA METHOD EXAMPLES =====");

        System.out.println("\n1. METHOD WITHOUT PARAMETERS");
        greet();

        System.out.println("\n2. METHOD WITH PARAMETERS");
        displayName("Amol Tathe");

        System.out.println("\n3. RETURN VALUE");
        System.out.println("Addition: " + add(10, 20));

        System.out.println("\n4. ARITHMETIC METHODS");
        System.out.println("Subtraction: " + subtract(30, 10));
        System.out.println("Multiplication: " + multiply(5, 4));
        System.out.println("Division: " + divide(20, 5));

        System.out.println("\n5. METHOD OVERLOADING");
        System.out.println("Integer: " + calculate(10, 20));
        System.out.println("Double: " + calculate(10.5, 20.5));

        System.out.println("\n6. RECURSION");
        System.out.println("Factorial: " + factorial(5));

        System.out.println("\n7. EVEN OR ODD");
        System.out.println(isEven(10) ? "Even" : "Odd");

        System.out.println("\n8. MAXIMUM NUMBER");
        System.out.println("Maximum: " + findMaximum(25, 50));

        System.out.println("\nMethod Examples Completed!");
    }
}
