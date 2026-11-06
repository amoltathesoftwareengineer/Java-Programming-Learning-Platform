
public class ExceptionHandlingExample {

    // 1. Arithmetic Exception
    static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Division Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Division operation completed.");
        }
    }

    // 2. Array Index Exception
    static void accessArray() {
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid array index!");
        }
    }

    // 3. Number Format Exception
    static void convertString() {
        try {
            int number = Integer.parseInt("Java");
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format!");
        }
    }

    // 4. Multiple Catch Blocks
    static void multipleExceptions(int value) {
        try {
            int result = 100 / value;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception occurred.");
        } catch (Exception e) {
            System.out.println("General Exception occurred.");
        }
    }

    // 5. Custom Exception
    static void validateAge(int age) throws Exception {
        if (age < 18) {
            throw new Exception("Age must be 18 or above.");
        }

        System.out.println("Age validation successful!");
    }

    public static void main(String[] args) {

        System.out.println("===== JAVA EXCEPTION HANDLING =====");

        System.out.println("\n1. Arithmetic Exception");
        divideNumbers(10, 0);

        System.out.println("\n2. Array Index Exception");
        accessArray();

        System.out.println("\n3. Number Format Exception");
        convertString();

        System.out.println("\n4. Multiple Catch Blocks");
        multipleExceptions(0);

        System.out.println("\n5. Custom Exception");

        try {
            validateAge(16);
        } catch (Exception e) {
            System.out.println("Validation Error: " + e.getMessage());
        }

        System.out.println("\nException Handling Examples Completed!");
    }
}
