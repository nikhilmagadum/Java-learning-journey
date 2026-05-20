package DSA.KK.Arrays.Ayush.beginning;
import java.util.Scanner;
public class EvenArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the array elements: ");
        for(int i =0; i<=arr.length-1;i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("The even elements in the array are : ");
        for(int i = 0;i <= arr.length -1;i++) {
            if(arr[i] % 2 ==0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
