/*
Title: Leap Year Checker
Problem Statement: Determine whether a given year is a leap year
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes a year as input from the user and determines whether it is a leap year.
A year is a leap year if:
  - It is divisible by 4 but not by 100, OR
  - It is divisible by 400
The program uses a helper method `isLeap(int year)` to check these conditions and return the appropriate result.

Sample Output(s):
Enter a year: 2024
The entered year is a Leap Year!

Enter a year: 1900
The entered year is not a Leap Year!

Enter a year: 2000
The entered year is a Leap Year!

Enter a year: -500
The entered year is not a Leap Year!
*/
import java.util.Scanner;

public class LeapYear {
    static boolean isLeap(int year) {
        if(year <= 0)
            return false;

        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeap(year))
            System.out.println("The entered year is a Leap Year!");
        else
            System.out.println("The entered year is not a Leap Year!");
    }
}
