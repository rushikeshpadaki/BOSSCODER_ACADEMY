/*
Title: Sum of Three Numbers
Problem Statement: Add three numbers and display the result
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes three integers as input from the user and calculates their sum. The program then displays the sum of the three numbers in a readable format using the addition operator (+).

Sample Output(s):
Enter first number: 4
Enter second number: 6
Enter third number: 8
4 + 6 + 8 = 18

Enter first number: 10
Enter second number: 20
Enter third number: 30
10 + 20 + 30 = 60
*/
import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
    }
}
