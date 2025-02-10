/*
Title: Odd or Even
Problem Statement: Determine whether a given number is odd or even
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes an integer input from the user and determines whether it is odd or even. It uses a separate method `isEven(int num)` to check divisibility by 2 using the modulus operator (%). If the number is divisible by 2, it is classified as even; otherwise, it is classified as odd.

Sample Output(s):
Enter a number: 8
The entered number is Even!

Enter a number: 15
The entered number is Odd!
*/
import java.util.Scanner;

public class OddOrEven {
    static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("The entered number is Even!");
        } else {
            System.out.println("The entered number is Odd!");
        }
    }
}
