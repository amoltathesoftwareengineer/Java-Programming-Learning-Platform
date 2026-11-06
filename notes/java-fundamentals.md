
# Java Programming Fundamentals

Complete beginner-friendly notes covering essential Java programming concepts.

## 1. Introduction to Java

Java is a high-level, object-oriented, platform-independent programming language.

### Key Features
- Object-Oriented
- Platform Independent
- Secure
- Robust
- Multithreaded
- Portable

## 2. Basic Java Program

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java!");
    }
}
```

### Explanation
- `class`: Defines a class.
- `main()`: Entry point of the program.
- `System.out.println()`: Prints output.
- `String[] args`: Accepts command-line arguments.

## 3. Variables and Data Types

Variables store data values.

| Data Type | Example |
|---|---|
| int | 100 |
| double | 10.5 |
| float | 5.5f |
| char | 'A' |
| boolean | true |
| String | "Java" |
| long | 100000L |

```java
int age = 25;
double salary = 45000.50;
char grade = 'A';
boolean active = true;
String name = "Amol";
```

## 4. Operators

### Arithmetic Operators
`+`, `-`, `*`, `/`, `%`

### Comparison Operators
`==`, `!=`, `>`, `<`, `>=`, `<=`

### Logical Operators
`&&`, `||`, `!`

### Assignment Operators
`=`, `+=`, `-=`, `*=`, `/=`

## 5. Conditional Statements

Conditional statements execute code based on conditions.

```java
int number = 10;

if (number > 0) {
    System.out.println("Positive");
} else if (number < 0) {
    System.out.println("Negative");
} else {
    System.out.println("Zero");
}
```

## 6. Loops

Loops execute statements repeatedly.

### For Loop
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

### While Loop
```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### Do-While Loop
```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

## 7. Arrays

Arrays store multiple values of the same data type.

```java
int[] numbers = {10, 20, 30, 40};

for (int number : numbers) {
    System.out.println(number);
}
```

## 8. Methods

Methods are reusable blocks of code.

```java
public class Main {

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(10, 20));
    }
}
```

## 9. Classes and Objects

A class is a blueprint. An object is an instance of a class.

```java
class Student {
    String name = "Amol";

    void display() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.display();
    }
}
```

## 10. Object-Oriented Programming (OOP)

Java supports four major OOP principles.

1. **Encapsulation** – Bundling data and methods together.
2. **Inheritance** – Acquiring properties from another class.
3. **Polymorphism** – One interface with multiple implementations.
4. **Abstraction** – Hiding implementation details.

## 11. Exception Handling

Exception handling manages runtime errors.

```java
public class Main {
    public static void main(String[] args) {

        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        } finally {
            System.out.println("Execution completed");
        }
    }
}
```

## 12. Collections Framework

Collections store and manage groups of objects.

Common interfaces:
- List
- Set
- Queue
- Map

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("SQL");

        System.out.println(languages);
    }
}
```

## 13. File Handling

Java provides classes to read and write files.

```java
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("notes.txt");
            writer.write("Welcome to Java Programming!");
            writer.close();

            System.out.println("File created successfully");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
```

## 14. Important Java Keywords

| Keyword | Purpose |
|---|---|
| class | Defines a class |
| public | Access modifier |
| static | Class-level member |
| final | Restricts modification or extension |
| new | Creates objects |
| this | Refers to current object |
| super | Refers to parent class |
| return | Returns a value |
| extends | Inherits a class |
| implements | Implements an interface |

## 15. Best Practices

- Use meaningful variable names.
- Follow Java naming conventions.
- Write reusable methods.
- Handle exceptions properly.
- Keep code clean and readable.
- Practice coding regularly.
- Use Git for version control.

## Learning Resources

- Java Documentation: https://docs.oracle.com/en/java/
- Java Tutorials: https://dev.java/learn/
- Practice: https://leetcode.com/

---

**Author:** Amol Tathe
**Project:** Java Programming Learning Platform
