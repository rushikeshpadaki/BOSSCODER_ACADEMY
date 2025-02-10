/*
Title: Multiple of Three
Problem Statement: Determine whether a given number is a multiple of three
Author: Rushikesh Padaki
Date: 10/02/2025

Description:
This program takes an integer input from the user and checks whether it is a multiple of three. It uses a separate method `isMultipleOfThree(int num)` to check divisibility by 3 using the modulus operator (%). If the number is divisible by 3, it prints a message indicating that; otherwise, it states that the number is not a multiple of three.

Sample Output(s):
Enter a number: 9
The entered number is a multiple of three!

Enter a number: 14
The entered number is not a multiple of three!

Enter a number: 21
The entered number is a multiple of three!
*/
import java.util.Scanner;

public class MultipleOfThree {
    static boolean isMultipleOfThree(int num) {
        return (num % 3 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isMultipleOfThree(num)) {
            System.out.println("The entered number is a multiple of three!");
        } else {
            System.out.println("The entered number is not a multiple of three!");
        }
    }
}
