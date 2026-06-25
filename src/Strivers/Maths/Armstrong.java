package Strivers.Maths;

import java.util.Scanner;

public class Armstrong {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n = sc.nextInt();

        Boolean res =  isArmStrong(n);
        System.out.println("is armstrong number : " + res);


    }
    public static boolean isArmStrong(int n ) {
        int temp = n;
        int digits = 0;
        double sum = 0;

        while (temp > 0) {
            temp = temp /  10;
            digits++;
        }
        System.out.println("Number of digits  " + digits );

        temp = n ;
        while (temp > 0) {
            int lastdigit = temp % 10;
          sum =   Math.pow(lastdigit,digits);
          temp = temp / 10;
        }

        if (sum == n)
            return true;
        else
            return false;

    }
}
