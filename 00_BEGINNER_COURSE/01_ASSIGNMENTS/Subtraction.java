/*
Title: Subtraction
Problem Statement: Subtract the second number from the first number
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes two integers as input from the user and calculates the result of subtracting the second number from the first. It then displays the result using the subtraction operator (-).

Sample Output(s):
Enter first number: 10
Enter second number: 4
10 - 4 = 6

Enter first number: 20
Enter second number: 7
20 - 7 = 13
*/
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }
}
