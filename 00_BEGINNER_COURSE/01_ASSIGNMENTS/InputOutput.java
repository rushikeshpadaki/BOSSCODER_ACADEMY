/*
Title: Input Output
Problem Statement: Take an integer input from the user and display it
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes an integer as input from the user and then displays the entered number back to the user. It uses the Scanner class to capture input and prints the result using the `println` method.

Sample Output(s):
Enter a number: 7
You have entered the number: 7

Enter a number: 42
You have entered the number: 42
*/
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("You have entered the number: " + num);
    }
}
