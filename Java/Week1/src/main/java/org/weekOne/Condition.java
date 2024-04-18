package org.weekOne;

import java.util.Scanner;


public class Condition {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter Weekday Number : ");
        int weekDayNum = s.nextInt();

        if(weekDayNum == 1){
            System.out.println("Monday");
        } else if(weekDayNum == 2){
            System.out.println("Tuesday");
        } else if(weekDayNum == 3){
            System.out.println("wednesday");
        } else if(weekDayNum == 4){
            System.out.println("thursday");
        } else if(weekDayNum == 5){
            System.out.println("Friday");
        } else if(weekDayNum == 6){
            System.out.println("Saturday");
        } else if(weekDayNum == 7){
            System.out.println("Sunday");
        } else {
            System.out.println("Invalid number.Please, enter a number between 1 : 7");
        }
    }
}
