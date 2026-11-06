
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    private static final String[] topics = {
        "Java Introduction",
        "Variables and Data Types",
        "Operators",
        "Conditional Statements",
        "Loops",
        "Arrays",
        "Methods",
        "Classes and Objects",
        "Inheritance",
        "Polymorphism",
        "Encapsulation",
        "Abstraction",
        "Exception Handling",
        "Collections Framework",
        "File Handling"
    };

    private static final boolean[] completed = new boolean[topics.length];

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("  JAVA PROGRAMMING LEARNING PLATFORM");
        System.out.println("====================================");

        boolean running = true;

        while (running) {

            showMenu();

            System.out.print("\nEnter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Enter a number.");
                scanner.nextLine();
                continue;
            }

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    displayTopics();
                    break;

                case 2:
                    markTopicCompleted();
                    break;

                case 3:
                    showProgress();
                    break;

                case 4:
                    showJavaQuiz();
                    break;

                case 5:
                    showAbout();
                    break;

                case 0:
                    running = false;
                    System.out.println("\nThank you for learning Java!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        scanner.close();
    }

    private static void showMenu() {

        System.out.println("\n------------- MAIN MENU -------------");
        System.out.println("1. View Java Learning Topics");
        System.out.println("2. Mark Topic as Completed");
        System.out.println("3. View Learning Progress");
        System.out.println("4. Take Java Quiz");
        System.out.println("5. About Project");
        System.out.println("0. Exit");
        System.out.println("-------------------------------------");
    }

    private static void displayTopics() {

        System.out.println("\n========== JAVA LEARNING TOPICS ==========");

        for (int i = 0; i < topics.length; i++) {

            String status = completed[i] ? "[Completed]" : "[Pending]";

            System.out.println((i + 1) + ". " + topics[i] + " " + status);
        }
    }

    private static void markTopicCompleted() {

        displayTopics();

        System.out.print("\nEnter topic number: ");

        if (!scanner.hasNextInt()) {
            System.out.println("Please enter a valid number.");
            scanner.nextLine();
            return;
        }

        int number = scanner.nextInt();
        scanner.nextLine();

        if (number >= 1 && number <= topics.length) {

            completed[number - 1] = true;

            System.out.println("\nTopic completed successfully!");
            System.out.println("Completed: " + topics[number - 1]);

        } else {
            System.out.println("Invalid topic number!");
        }
    }

    private static void showProgress() {

        int total = topics.length;
        int count = 0;

        for (boolean status : completed) {
            if (status) {
                count++;
            }
        }

        double percentage = (count * 100.0) / total;

        System.out.println("\n========== LEARNING PROGRESS ==========");
        System.out.println("Total Topics     : " + total);
        System.out.println("Completed Topics : " + count);
        System.out.println("Pending Topics   : " + (total - count));
        System.out.printf("Progress         : %.2f%%\n", percentage);
        System.out.println("=======================================");
    }

    private static void showJavaQuiz() {

        String[] questions = {
            "Which keyword is used to create a class in Java?",
            "Which method is the entry point of Java?",
            "Which data type stores true or false?",
            "Which keyword creates an object?",
            "Which loop executes at least once?"
        };

        String[][] options = {
            {"1. class", "2. define", "3. struct", "4. object"},
            {"1. start()", "2. main()", "3. run()", "4. execute()"},
            {"1. int", "2. char", "3. boolean", "4. float"},
            {"1. create", "2. new", "3. object", "4. class"},
            {"1. for", "2. while", "3. foreach", "4. do-while"}
        };

        int[] answers = {1, 2, 3, 2, 4};

        int score = 0;

        System.out.println("\n========== JAVA QUIZ ==========");

        for (int i = 0; i < questions.length; i++) {

            System.out.println("\nQ" + (i + 1) + ". " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (1-4): ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid answer. Skipping question.");
                scanner.nextLine();
                continue;
            }

            int answer = scanner.nextInt();
            scanner.nextLine();

            if (answer == answers[i]) {
                System.out.println("Correct Answer!");
                score++;
            } else {
                System.out.println("Incorrect Answer!");
            }
        }

        System.out.println("\n========== QUIZ RESULT ==========");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Your Score      : " + (score * 100 / questions.length) + "%");
        System.out.println("=================================");
    }

    private static void showAbout() {

        System.out.println("\n===== ABOUT THE PROJECT =====");
        System.out.println("Project: Java Programming Learning Platform");
        System.out.println("Author : Amol Tathe");
        System.out.println("Language: Java");
        System.out.println("Features:");
        System.out.println("- Structured Java learning topics");
        System.out.println("- Topic completion tracking");
        System.out.println("- Learning progress report");
        System.out.println("- Interactive Java quiz");
        System.out.println("=============================");
    }
}
