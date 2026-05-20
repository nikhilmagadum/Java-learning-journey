package DSA.KK.Arrays.Ayush.beginning;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write your code here
        int[] arr = new int[5];

        for(int i = 1; i < arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("[");
        for (int i = 1;i< arr.length;i++) {
            System.out.print( arr[i] + "," );
        }

        System.out.print("]");
    }
}
