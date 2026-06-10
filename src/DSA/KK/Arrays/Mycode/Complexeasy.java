package DSA.KK.Arrays.Mycode;

import java.util.Scanner;

public class Complexeasy {
    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size ");

        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum - max);
        System.out.println(sum - min);

    }
}
