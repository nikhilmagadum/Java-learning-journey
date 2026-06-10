package DSA.KK.Arrays.Mycode;
import java.util.Scanner;
public class WithmethodOne {


    public static int maxEle(int[] ar) {
        int max = 0;

        for (int i = 0; i < ar.length; i++) {
            if (max < ar[i]) {
                max = ar[i];
            }
        }
        return max;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] ar = new int[n];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

       int res =  maxEle(ar);
        System.out.println(res);

    }
}
