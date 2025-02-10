/*
Title: Multiplication
Problem Statement: Multiply two numbers and display the result
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes two integers as input from the user and calculates their product using the multiplication operator (*). It then prints the result of the multiplication in a readable format.

Sample Output(s):
Enter first number: 6
Enter second number: 4
6 * 4 = 24

Enter first number: 7
Enter second number: 9
7 * 9 = 63
*/
import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
    }
}
