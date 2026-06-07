package Problems;

import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int size = sc.nextInt();
        int [] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i < arr.length;i++) {
            if (arr[i] == n) {
                System.out.println(i);
                break;
            } else {
                System.out.println("-1");
            }
        }
        sc.close();
    }

}