package DSA.KK.Arrays.Mycode;
import java.util.Scanner;

public class Rrev {
    static void main(String[] args) {
        Scanner  sc = new Scanner (System.in);
        System.out.println("Enter the array size");

        int n = sc.nextInt();

        int [] ar = new int[n];

        System.out.println("Enter the array elements ");

        for(int i = 0; i <ar.length;i++) {
            ar[i] = sc.nextInt();
        }

        for(int i = 0; i <ar.length;i++) {
            if(ar[i] % 2 ==0 ) {
                System.out.println(ar[i]);
            }
        }

//        System.out.println("Array elements after reversing is ");

//        for(int i = ar.length-1 ; i >= 0 ;i--) {
//            System.out.println(ar[i]);
//        }
    }
}
