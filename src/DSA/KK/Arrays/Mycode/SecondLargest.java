package DSA.KK.Arrays.Mycode;

import java.util.Scanner;

public class SecondLargest {

    public static int secLargest(int[] ar) {
        int p = 0, vp = 0;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > p){
                vp = p;
                p = ar[i];
            } else if (ar[i] > vp) {
                vp = ar[i];
            }
        }
        return vp;
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

       int res  = secLargest(arr);
        System.out.println(res);

    }
}
