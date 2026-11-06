
public class StringExamples {

    // 1. Reverse String
    static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    // 2. Check Palindrome
    static boolean isPalindrome(String text) {
        String cleaned = text.replaceAll("\\s+", "")
                             .toLowerCase();

        return cleaned.equals(reverseString(cleaned));
    }

    // 3. Count Vowels and Consonants
    static void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        for (char ch : text.toLowerCase().toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) >= 0) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // 4. Count Words
    static void countWords(String text) {
        String trimmed = text.trim();

        int count = trimmed.isEmpty()
                ? 0
                : trimmed.split("\\s+").length;

        System.out.println("Word Count: " + count);
    }

    // 5. Convert Case
    static void convertCase(String text) {
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
    }

    // 6. Remove Spaces
    static void removeSpaces(String text) {
        System.out.println(
            "Without Spaces: " + text.replaceAll("\\s+", "")
        );
    }

    // 7. Character Frequency
    static void characterFrequency(String text) {
        int[] frequency = new int[256];

        for (char ch : text.toCharArray()) {
            if (ch < 256) {
                frequency[ch]++;
            }
        }

        System.out.println("Character Frequency:");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(
                    (char) i + " : " + frequency[i]
                );
            }
        }
    }

    public static void main(String[] args) {

        String text = "Java Programming";

        System.out.println("===== JAVA STRING EXAMPLES =====");

        System.out.println("\n1. ORIGINAL STRING");
        System.out.println(text);

        System.out.println("\n2. REVERSE STRING");
        System.out.println(reverseString(text));

        System.out.println("\n3. PALINDROME CHECK");
        System.out.println(
            isPalindrome("madam") ? "Palindrome" : "Not Palindrome"
        );

        System.out.println("\n4. VOWELS AND CONSONANTS");
        countVowelsAndConsonants(text);

        System.out.println("\n5. WORD COUNT");
        countWords(text);

        System.out.println("\n6. CASE CONVERSION");
        convertCase(text);

        System.out.println("\n7. REMOVE SPACES");
        removeSpaces(text);

        System.out.println("\n8. CHARACTER FREQUENCY");
        characterFrequency("Java");

        System.out.println("\nString Examples Completed!");
    }
}
