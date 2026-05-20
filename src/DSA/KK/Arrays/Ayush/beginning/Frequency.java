package DSA.KK.Arrays.Ayush.beginning;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Create a new arry for visited
        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == 1) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = 1;
                }
            }
            System.out.println(arr[i] + " " + count);
        }

    }
}

