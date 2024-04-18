package org.weekOne;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int num1 = s.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = s.nextInt();

        int sum = num1 + num2 ;
        int difference = num1 - num2 ;
        int product = num1 * num2 ;
        double division = num1 / num2 ;

        System.out.println(sum);
        System.out.println(difference);
        System.out.println(product);
        System.out.println(division);
    }
}
