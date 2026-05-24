package DSA.KK.Arrays.Ayush.beginning;
import java.util.Scanner;

public class MergeArray {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] a = {1,2,3,4};
        int [] b = {5,6,7};

        int [] merge = new int[a.length+ b.length];

        for (int i =0 ; i < a.length;i++) {
            merge[i] = a[i];
        }

        for(int i =0 ; i < b.length;i++) {
            merge[i + a.length] = b[i];
        }

        for(int i=0 ; i < merge.length;i++) {
            System.out.print(merge[i] + " ");
        }
    }
}
