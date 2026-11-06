
public class LoopExamples {

    // 1. For Loop
    static void forLoopExample() {
        System.out.println("\n1. FOR LOOP");

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }

    // 2. While Loop
    static void whileLoopExample() {
        System.out.println("\n2. WHILE LOOP");

        int i = 1;

        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
    }

    // 3. Do-While Loop
    static void doWhileExample() {
        System.out.println("\n3. DO-WHILE LOOP");

        int i = 1;

        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);

        System.out.println();
    }

    // 4. Multiplication Table
    static void multiplicationTable(int number) {
        System.out.println("\n4. MULTIPLICATION TABLE");

        for (int i = 1; i <= 10; i++) {
            System.out.println(
                number + " x " + i + " = " + (number * i)
            );
        }
    }

    // 5. Sum of Natural Numbers
    static void sumOfNumbers(int number) {
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("\n5. SUM OF NATURAL NUMBERS");
        System.out.println("Sum: " + sum);
    }

    // 6. Factorial
    static void factorial(int number) {
        long result = 1;

        for (int i = 1; i <= number; i++) {
            result *= i;
        }

        System.out.println("\n6. FACTORIAL");
        System.out.println("Factorial: " + result);
    }

    // 7. Star Pattern
    static void starPattern() {
        System.out.println("\n7. STAR PATTERN");

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    // 8. Break and Continue
    static void breakContinueExample() {
        System.out.println("\n8. BREAK AND CONTINUE");

        for (int i = 1; i <= 10; i++) {

            if (i == 3) {
                continue;
            }

            if (i == 8) {
                break;
            }

            System.out.print(i + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("===== JAVA LOOP EXAMPLES =====");

        forLoopExample();
        whileLoopExample();
        doWhileExample();

        multiplicationTable(5);
        sumOfNumbers(10);
        factorial(5);

        starPattern();
        breakContinueExample();

        System.out.println("\nLoop Examples Completed!");
    }
}
