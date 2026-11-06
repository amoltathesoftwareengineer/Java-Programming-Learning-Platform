
import java.io.*;
import java.nio.file.*;
import java.util.List;

public class FileHandlingExample {

    private static final String FILE_NAME = "java-learning-notes.txt";

    // 1. Create and Write File
    static void writeFile() {

        try (FileWriter writer = new FileWriter(FILE_NAME)) {

            writer.write("Welcome to Java Programming!\n");
            writer.write("Learn Java File Handling.\n");
            writer.write("Practice coding every day.\n");

            System.out.println("File written successfully!");

        } catch (IOException e) {
            System.out.println("Write Error: " + e.getMessage());
        }
    }

    // 2. Read File
    static void readFile() {

        try (BufferedReader reader =
                new BufferedReader(new FileReader(FILE_NAME))) {

            String line;

            System.out.println("\nFile Contents:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("Read Error: " + e.getMessage());
        }
    }

    // 3. Append Data
    static void appendFile() {

        try (FileWriter writer = new FileWriter(FILE_NAME, true)) {

            writer.write("New Java topic added successfully.\n");

            System.out.println("\nData appended successfully!");

        } catch (IOException e) {
            System.out.println("Append Error: " + e.getMessage());
        }
    }

    // 4. Check File Information
    static void fileInformation() {

        File file = new File(FILE_NAME);

        System.out.println("\nFile Information:");

        System.out.println("Exists: " + file.exists());

        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("File Size: " + file.length() + " bytes");
            System.out.println("Absolute Path: " + file.getAbsolutePath());
        }
    }

    // 5. Read All Lines Using NIO
    static void readAllLines() {

        try {
            List<String> lines = Files.readAllLines(
                Paths.get(FILE_NAME)
            );

            System.out.println("\nTotal Lines: " + lines.size());

        } catch (IOException e) {
            System.out.println("NIO Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {

        System.out.println("===== JAVA FILE HANDLING =====");

        writeFile();

        readFile();

        appendFile();

        readFile();

        fileInformation();

        readAllLines();

        System.out.println("\nFile Handling Examples Completed!");
    }
}
