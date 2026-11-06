
public class ConditionalStatements {

    // 1. If Statement
    static void checkPositive(int number) {
        System.out.println("\n1. IF STATEMENT");

        if (number > 0) {
            System.out.println(number + " is Positive");
        }
    }

    // 2. If-Else Statement
    static void checkEvenOdd(int number) {
        System.out.println("\n2. IF-ELSE STATEMENT");

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    // 3. If-Else-If Ladder
    static void checkGrade(int marks) {
        System.out.println("\n3. IF-ELSE-IF LADDER");

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid Marks");
        } else if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }

    // 4. Nested If
    static void checkEligibility(int age, boolean hasLicense) {
        System.out.println("\n4. NESTED IF");

        if (age >= 18) {
            if (hasLicense) {
                System.out.println("Eligible to drive.");
            } else {
                System.out.println("License required.");
            }
        } else {
            System.out.println("Age requirement not satisfied.");
        }
    }

    // 5. Switch Statement
    static void displayDay(int day) {
        System.out.println("\n5. SWITCH STATEMENT");

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    // 6. Ternary Operator
    static void findLargest(int a, int b) {
        System.out.println("\n6. TERNARY OPERATOR");

        int largest = (a > b) ? a : b;

        System.out.println("Largest Number: " + largest);
    }

    public static void main(String[] args) {

        System.out.println("===== JAVA CONDITIONAL STATEMENTS =====");

        checkPositive(10);
        checkEvenOdd(15);
        checkGrade(85);
        checkEligibility(25, true);
        displayDay(3);
        findLargest(50, 80);

        System.out.println("\nConditional Examples Completed!");
    }
}
