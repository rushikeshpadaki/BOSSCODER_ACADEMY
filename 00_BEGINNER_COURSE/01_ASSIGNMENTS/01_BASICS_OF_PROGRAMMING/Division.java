/*
Title: Division
Problem Statement: Divide the first number by the second number, handling division by zero
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes two integers as input from the user and divides the first number by the second using the division operator (/). If the second number is zero, the program handles the division by zero error and displays a warning message instead of performing the division.

Sample Output(s):
Enter first number: 20
Enter second number: 5
20 / 5 = 4

Enter first number: 10
Enter second number: 0
The second number is Zero. Division operation cannot be performed!
*/
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num2 != 0) {
            System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("The second number is Zero. Division operation cannot be performed!");
        }
    }
}
