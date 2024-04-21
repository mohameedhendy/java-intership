package org.Week3;

import java.util.Scanner;

public class occurrence {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Input target number
        System.out.print("Enter the target number to find: ");
        int target = scanner.nextInt();


        int position = -1; // Position of the first occurrence

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                position = i;
                break;
            }
        }

        if (position < 5) {
            position = -1; // Reset position if it's less than 5
            for (int i = 5; i < numbers.length; i++) {
                if (numbers[i] == target) {
                    position = i;
                    break;
                }
            }
        }

        if (position != -1) {
            System.out.println("First occurrence of " + target + " is at position: " + position);
        } else {
            System.out.println("The number " + target + " was not found after position 5.");
        }
    }
}
