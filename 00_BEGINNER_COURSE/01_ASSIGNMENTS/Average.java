/*
Title: Average
Problem Statement: Calculate the average of two numbers
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes two integers as input from the user and calculates their average. The average is calculated by summing the two numbers and dividing the result by 2. The program then displays the calculated average.

Sample Output(s):
Enter first number: 8
Enter second number: 12
The average of 8 and 12 = 10

Enter first number: 15
Enter second number: 25
The average of 15 and 25 = 20
*/
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("The average of " + num1 + " and " + num2 + " = " + ((num1 + num2) / 2));
    }
}
