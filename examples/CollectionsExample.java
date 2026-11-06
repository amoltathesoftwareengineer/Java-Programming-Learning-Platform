
import java.util.*;

public class CollectionsExample {

    public static void main(String[] args) {

        System.out.println("===== JAVA COLLECTIONS FRAMEWORK =====");

        // 1. ArrayList
        System.out.println("\n1. ARRAYLIST");

        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("SQL");
        languages.add("JavaScript");

        System.out.println("Languages: " + languages);

        languages.remove("Python");

        System.out.println("After Removal: " + languages);
        System.out.println("First Language: " + languages.get(0));

        // 2. HashSet
        System.out.println("\n2. HASHSET");

        HashSet<Integer> numbers = new HashSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(10);

        System.out.println("Unique Numbers: " + numbers);

        // 3. HashMap
        System.out.println("\n3. HASHMAP");

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Amol");
        students.put(102, "Rahul");
        students.put(103, "Priya");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println(
                "ID: " + entry.getKey() +
                ", Name: " + entry.getValue()
            );
        }

        // 4. Queue
        System.out.println("\n4. QUEUE");

        Queue<String> queue = new LinkedList<>();

        queue.offer("First");
        queue.offer("Second");
        queue.offer("Third");

        System.out.println("Queue: " + queue);
        System.out.println("Removed: " + queue.poll());
        System.out.println("Remaining: " + queue);

        // 5. Stack
        System.out.println("\n5. STACK");

        Stack<Integer> stack = new Stack<>();

        stack.push(100);
        stack.push(200);
        stack.push(300);

        System.out.println("Stack: " + stack);
        System.out.println("Top Element: " + stack.peek());
        System.out.println("Popped: " + stack.pop());

        // 6. Sorting
        System.out.println("\n6. SORTING");

        ArrayList<Integer> marks = new ArrayList<>(
            Arrays.asList(80, 45, 95, 60, 75)
        );

        Collections.sort(marks);

        System.out.println("Sorted Marks: " + marks);

        // 7. Searching
        System.out.println("\n7. SEARCHING");

        boolean found = languages.contains("Java");

        System.out.println("Java Found: " + found);

        System.out.println("\nCollections Examples Completed!");
    }
}
