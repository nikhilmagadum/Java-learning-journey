package PracticeFile;
import java.util.Scanner;

public class Testetc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for first input array
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[m];

        int[] merge = new int[arr1.length + arr2.length];

        int min = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[0] < arr1[i]) {
                min = arr1[i];
            }
        }

        int max = arr2[0];

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[0] > arr2[i]) {
                max = arr2[i];
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            merge[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            merge[arr1.length + i] = arr2[i];
        }
        System.out.println("Merged Array: [");
        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + ", ");
        }
        System.out.println("]");

        System.out.println("Minimum Array: " + min);
        System.out.println("Maximum Array: " + max);

        // TODO: Ask user for second input array
        // TODO: Merge both arrays into a third array
        // TODO: Find and print the minimum and maximum values
        scanner.close();
    }
}