package DSA.KK.Arrays.Mycode;

import java.util.Scanner;

public class Q11 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ente the Number");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println( add(a,b));
    }

   public static int  add(int a,int b) {

        return a + b ;
    }
}
