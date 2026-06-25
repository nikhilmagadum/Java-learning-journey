package Problems;

import java.util.Scanner;

public class Base4 {

    public static int evenArray(int[] arr ){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] =  sc.nextInt();
        }

        System.out.println("the even numbers in the arrays are : ");

         int res = evenArray(arr);
        System.out.println(res);

    }
}
