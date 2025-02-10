/*
Title: Addition
Problem Statement: Add two numbers and display the result
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes two integers as input from the user and calculates their sum using the addition operator (+). It then prints the result of the addition in a user-friendly format.

Sample Output(s):
Enter first number: 5
Enter second number: 3
5 + 3 = 8

Enter first number: 15
Enter second number: 7
15 + 7 = 22
*/
import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }
}
