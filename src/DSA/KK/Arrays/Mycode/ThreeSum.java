package DSA.KK.Arrays.Mycode;

import java.util.Scanner;

public class ThreeSum {


    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int sum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array size ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }


        int maxx = sum(arr) - max(arr);
        int minn = sum(arr) - min(arr);

        System.out.println(maxx);
        System.out.println(minn);

    }
}
