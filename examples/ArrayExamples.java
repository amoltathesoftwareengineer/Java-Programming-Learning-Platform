
import java.util.Arrays;

public class ArrayExamples {

    // 1. Display Array
    static void displayArray(int[] arr) {
        System.out.println("Array: " + Arrays.toString(arr));
    }

    // 2. Find Sum and Average
    static void calculateSumAndAverage(int[] arr) {
        int sum = 0;

        for (int number : arr) {
            sum += number;
        }

        double average = (double) sum / arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    // 3. Find Largest and Smallest
    static void findMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];

        for (int number : arr) {
            if (number > max) max = number;
            if (number < min) min = number;
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }

    // 4. Reverse Array
    static void reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        System.out.println("Reversed: " + Arrays.toString(arr));
    }

    // 5. Search Element
    static void searchElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found.");
    }

    // 6. Sort Array
    static void sortArray(int[] arr) {
        Arrays.sort(arr);
        System.out.println("Sorted: " + Arrays.toString(arr));
    }

    // 7. Count Even and Odd
    static void countEvenOdd(int[] arr) {
        int even = 0;
        int odd = 0;

        for (int number : arr) {
            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even Numbers: " + even);
        System.out.println("Odd Numbers: " + odd);
    }

    // Main Method
    public static void main(String[] args) {

        System.out.println("===== JAVA ARRAY EXAMPLES =====");

        int[] numbers = {45, 12, 78, 23, 56, 9};

        displayArray(numbers);

        System.out.println("\n1. SUM AND AVERAGE");
        calculateSumAndAverage(numbers);

        System.out.println("\n2. MINIMUM AND MAXIMUM");
        findMinMax(numbers);

        System.out.println("\n3. ARRAY REVERSAL");
        reverseArray(numbers);

        System.out.println("\n4. ELEMENT SEARCH");
        searchElement(numbers, 78);

        System.out.println("\n5. ARRAY SORTING");
        sortArray(numbers);

        System.out.println("\n6. EVEN AND ODD COUNT");
        countEvenOdd(numbers);

        System.out.println("\nArray Examples Completed!");
    }
}
