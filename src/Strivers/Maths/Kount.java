package Strivers.Maths;

import java.util.Scanner;

public class Kount {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number: ");

        int n = sc.nextInt();

        int res =  count(n);
        System.out.println(res);


    }

   public static int count(int n ) {

        if (n == 0) {
            return 1;
        }
       int count = 0 ;

       while (n > 0 ) {
           n = n / 10;
           count++;
       }
       return count;
    }
}
