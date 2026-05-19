package DSA.KK.Arrays.Ayush;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Ask for array size
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        // Create array
        int[] arr = new int[n];

        // Take array input
        System.out.println("Enter array elements:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize max with first element
        int max = arr[0];

        // Find maximum value
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Print array
        System.out.print("Array: [");

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i]);

            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("]");

        // Print maximum value
        System.out.println("Maximum value: " + max);

        scanner.close();
    }
}