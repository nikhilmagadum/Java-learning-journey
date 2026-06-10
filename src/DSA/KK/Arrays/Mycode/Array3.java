package DSA.KK.Arrays.Mycode;
import java.util.Scanner;

public class Array3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] arr = new int[n];

        for(int i =0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int max =  0;

        for(int i =0 ; i < arr.length;i++) {
            if(arr[i] < arr[max]) {

            }

        }
        max= max-1;
        System.out.println(max);
    }
}
