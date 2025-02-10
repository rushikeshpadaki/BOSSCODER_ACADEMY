/*
Title: Natural Number Sum
Problem Statement: Calculate the sum of the first N natural numbers
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program calculates the sum of the first N natural numbers using the formula N*(N+1)/2. The user inputs a number N, and the program computes and prints the sum of all natural numbers from 1 to N.

Sample Output(s):
Enter a number: 5
The sum of first 5 natural numbers = 15

Enter a number: 10
The sum of first 10 natural numbers = 55
*/
import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("The sum of first " + num + " natural numbers = " + ((num * (num+1)) / 2));
    }
}
