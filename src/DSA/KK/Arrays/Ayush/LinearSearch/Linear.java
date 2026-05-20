package DSA.KK.Arrays.Ayush.LinearSearch;

import java.util.Scanner;

public class Linear {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("The search element is : ");
        int k = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.println("key found " + k);
                return ;
            } else {
                System.out.println("Key not found ");
            }
        }
    }
}
