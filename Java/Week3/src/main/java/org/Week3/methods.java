package org.Week3;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        int sum = calculateSum(numbers);
        System.out.println("Sum of elements in the array: " + sum);

        double average = calculateAverage(numbers);
        System.out.println("Average of elements in the array: " + average);
    }

    public int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public double calculateAverage(int[] arr) {
        int sum = calculateSum(arr);
        double average = (double) sum / arr.length;
        return average;
    }
}
