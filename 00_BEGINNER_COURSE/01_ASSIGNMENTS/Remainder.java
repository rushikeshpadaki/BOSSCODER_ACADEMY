/*
Title: Remainder
Problem Statement: Calculate the remainder when one number is divided by another
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes two integers as input from the user and calculates the remainder when the first number is divided by the second using the modulus operator (%). It then displays the result.

Sample Output(s):
Enter first number: 15
Enter second number: 4
15 % 4 = 3

Enter first number: 23
Enter second number: 5
23 % 5 = 3
*/
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}
