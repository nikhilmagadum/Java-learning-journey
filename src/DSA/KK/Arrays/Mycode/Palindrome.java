package DSA.KK.Arrays.Mycode;

import java.util.Scanner;

public class Palindrome {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = sc.nextInt();
        int rev = 0;
        int temp = number;

        while (temp > 0) {
            int remainder = temp % 10; //  remainder we are getting last digit
            rev = rev * 10 + remainder;
            temp = temp / 10; // to elminiate last number
        }

        if (rev == number) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
