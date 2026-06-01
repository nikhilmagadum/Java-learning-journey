package PracticeFile;
import java.util.Scanner;

public class ARu {
    static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array :");

        int n = sc.nextInt();

        int [] arr =  new int [n] ;
        
        System.out.println("Enter the array elements : ");
        
        for(int i = 0 ; i <= arr.length-1 ; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("The array elements are : ");
        
        for(int i = 0 ; i <= arr.length-1 ; i++) {
            System.out.println(arr[i]);
        }
        
    }
}
