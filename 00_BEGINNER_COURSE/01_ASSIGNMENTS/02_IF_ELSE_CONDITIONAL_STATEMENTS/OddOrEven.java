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
