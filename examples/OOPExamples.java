
public class OOPExamples {

    // 1. Encapsulation
    static class Student {
        private String name;
        private int age;

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setAge(int age) {
            if (age > 0) {
                this.age = age;
            }
        }

        public int getAge() {
            return age;
        }
    }

    // 2. Inheritance
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    static class Dog extends Animal {
        void bark() {
            System.out.println("Dog is barking");
        }
    }

    // 3. Polymorphism
    static class Calculator {

        int add(int a, int b) {
            return a + b;
        }

        double add(double a, double b) {
            return a + b;
        }
    }

    // 4. Abstraction
    abstract static class Shape {
        abstract double calculateArea();
    }

    static class Circle extends Shape {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double calculateArea() {
            return Math.PI * radius * radius;
        }
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("===== JAVA OOP CONCEPTS =====");

        // Encapsulation
        System.out.println("\n1. ENCAPSULATION");

        Student student = new Student();
        student.setName("Amol Tathe");
        student.setAge(25);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());

        // Inheritance
        System.out.println("\n2. INHERITANCE");

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        // Polymorphism
        System.out.println("\n3. POLYMORPHISM");

        Calculator calculator = new Calculator();

        System.out.println("Integer Addition: " +
                calculator.add(10, 20));

        System.out.println("Double Addition: " +
                calculator.add(10.5, 20.5));

        // Abstraction
        System.out.println("\n4. ABSTRACTION");

        Shape circle = new Circle(5);

        System.out.printf("Circle Area: %.2f%n",
                circle.calculateArea());

        System.out.println("\nOOP Examples Completed!");
    }
}
