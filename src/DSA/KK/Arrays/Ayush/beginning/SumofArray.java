package DSA.KK.Arrays.Ayush.beginning;

import java.util.Scanner;

public class SumofArray {

    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size:  ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        System.out.println("Enter the array elements: ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The sum of array: ");

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
