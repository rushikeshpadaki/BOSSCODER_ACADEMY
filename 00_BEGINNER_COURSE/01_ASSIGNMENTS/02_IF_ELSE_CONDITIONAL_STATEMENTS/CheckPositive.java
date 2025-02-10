/*
Title: Check Positive Number
Problem Statement: Determine whether a given number is positive
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes an integer input from the user and checks whether it is positive. It uses a separate method `isPositive(int num)` to check if the number is greater than zero. If the number is positive, the program prints a corresponding message; otherwise, it indicates that the number is not positive.

Sample Output(s):
Enter a number: 7
The entered number is Positive!

Enter a number: -3
The entered number is not positive!

Enter a number: 0
The entered number is not positive!
*/
import java.util.Scanner;

public class CheckPositive {
    static boolean isPositive(int num) {
        return (num > 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPositive(num)) {
            System.out.println("The entered number is Positive!");
        } else {
            System.out.println("The entered number is not positive!");
        }
    }
}
