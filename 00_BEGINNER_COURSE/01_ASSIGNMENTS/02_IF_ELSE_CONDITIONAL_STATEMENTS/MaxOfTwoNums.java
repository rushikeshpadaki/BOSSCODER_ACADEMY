/*
Title: Maximum of Two Numbers
Problem Statement: Determine the maximum of two given numbers
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes two integers as input from the user and determines the maximum of the two.
It uses the `Math.max()` function inside a helper method `maxOfTwo(int num1, int num2)` to find the larger number.
The program then prints the maximum value in a user-friendly format.

Sample Output(s):
Enter first number: 8
Enter second number: 12
The maximum of 8 and 12 = 12

Enter first number: 25
Enter second number: 17
The maximum of 25 and 17 = 25

Enter first number: 10
Enter second number: 10
The maximum of 10 and 10 = 10
*/
import java.util.Scanner;

public class MaxOfTwoNums {
    static int maxOfTwo(int num1, int num2) {
        return Math.max(num1, num2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("The maximum of " + num1 + " and " + num2 + " = " + maxOfTwo(num1, num2));
    }
}
