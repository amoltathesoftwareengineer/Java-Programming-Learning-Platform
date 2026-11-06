
# Java Beginner Programming Exercises

A collection of beginner-friendly Java programming exercises with solutions to improve coding skills and problem-solving abilities.

## 1. Hello World
**Task:** Print Hello, World! on the screen.

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

## 2. Add Two Numbers
**Task:** Add two integers.

```java
public class AddNumbers {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println("Sum: " + (a + b));
    }
}
```

## 3. Check Even or Odd
**Task:** Check whether a number is even or odd.

```java
public class EvenOdd {
    public static void main(String[] args) {
        int number = 15;

        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
```

## 4. Find Largest Number
**Task:** Find the largest of three numbers.

```java
public class LargestNumber {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15;

        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}
```

## 5. Factorial of a Number
**Task:** Calculate factorial using a loop.

```java
public class Factorial {
    public static void main(String[] args) {
        int number = 5;
        long factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial: " + factorial);
    }
}
```

## 6. Multiplication Table
**Task:** Print the multiplication table of a number.

```java
public class MultiplicationTable {
    public static void main(String[] args) {
        int number = 5;

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
```

## 7. Reverse a String
**Task:** Reverse a given string.

```java
public class ReverseString {
    public static void main(String[] args) {
        String text = "Java";

        String reversed = new StringBuilder(text)
                .reverse().toString();

        System.out.println(reversed);
    }
}
```

## 8. Check Palindrome
**Task:** Check whether a string is a palindrome.

```java
public class Palindrome {
    public static void main(String[] args) {
        String text = "madam";

        String reversed = new StringBuilder(text)
                .reverse().toString();

        if (text.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
```

## 9. Fibonacci Series
**Task:** Print the first 10 Fibonacci numbers.

```java
public class Fibonacci {
    public static void main(String[] args) {
        int first = 0, second = 1;

        for (int i = 1; i <= 10; i++) {
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }
    }
}
```

## 10. Sum of Array Elements
**Task:** Calculate the sum of array elements.

```java
public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};
        int sum = 0;

        for (int number : numbers) {
            sum += number;
        }

        System.out.println("Array Sum: " + sum);
    }
}
```

## Learning Outcomes

- Understand Java syntax and fundamentals.
- Practice conditional statements and loops.
- Work with strings and arrays.
- Develop logical thinking.
- Improve problem-solving skills.

## Author

Amol Tathe
