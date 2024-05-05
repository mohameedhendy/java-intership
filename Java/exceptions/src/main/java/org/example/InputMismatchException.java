package org.example;

import java.util.Scanner;

public class InputMismatchException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        while (true) {
            try {
                System.out.print("Enter first number : ");
                num1 = s.nextInt();
                System.out.print("Enter second number : ");
                num2 = s.nextInt();

                // I didn't declare a variable called sum because it will take a space in memory and i won't use it again.
                System.out.println(num1 + num2);
                break;
            } catch (java.util.InputMismatchException ex) {
                System.out.println("Invalid input, please try again");
                s.nextLine();
            }
        }
    }
}
