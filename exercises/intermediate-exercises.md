
# Java Intermediate Programming Exercises

Practice these exercises to improve Java programming, OOP, collections, and problem-solving skills.

## 1. Find Duplicate Elements

**Task:** Find duplicate numbers in an array.

```java
import java.util.HashSet;

public class DuplicateElements {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 20, 40, 10};

        HashSet<Integer> seen = new HashSet<>();

        for (int number : numbers) {
            if (!seen.add(number)) {
                System.out.println("Duplicate: " + number);
            }
        }
    }
}
```

## 2. Find Second Largest Number

**Task:** Find the second largest distinct number.

```java
public class SecondLargest {
    public static void main(String[] args) {
        int[] numbers = {10, 50, 30, 80, 60};

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                second = largest;
                largest = number;
            } else if (number > second && number != largest) {
                second = number;
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("No second largest number.");
        } else {
            System.out.println("Second Largest: " + second);
        }
    }
}
```

## 3. Student Management Using ArrayList

**Task:** Store and display student names.

```java
import java.util.ArrayList;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Amol");
        students.add("Rahul");
        students.add("Priya");

        for (String student : students) {
            System.out.println(student);
        }
    }
}
```

## 4. Bank Account Using OOP

**Task:** Implement deposit and withdrawal operations.

```java
class BankAccount {
    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal.");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        account.deposit(500);
        account.withdraw(200);

        System.out.println("Balance: " + account.getBalance());
    }
}
```

## 5. Sort Numbers Using Bubble Sort

**Task:** Sort an integer array without using built-in sorting.

```java
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {50, 20, 40, 10, 30};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}
```

## Learning Outcomes

- Array manipulation and searching.
- Object-oriented programming.
- Java Collections Framework.
- Sorting algorithms.
- Logical thinking and problem-solving.

## Author

Amol Tathe

**Project:** Java Programming Learning Platform
