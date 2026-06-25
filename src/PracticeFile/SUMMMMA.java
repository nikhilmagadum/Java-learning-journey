package PracticeFile;

import java.util.Scanner;

public class SUMMMMA {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array : ");

        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i = 0 ; i <  arr.length; i ++) {
            arr[i] =  sc.nextInt();
        }

        int max =  arr[0];
        int count = 0 ;
        System.out.println("The array output is ");
        for(int i = 0; i < arr.length; i++) {
//           if(max < arr[i]){
//               max = arr[i];
//           }

            if(arr[i]  % 2 == 0) {
               int res =  count++;
            }
        }
        System.out.println(count);


    }
}
