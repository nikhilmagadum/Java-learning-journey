package DSA.KK.Arrays.Mycode;

import java.util.Scanner;

public class Q12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int ans = Factorial(n);
        System.out.println(ans);

    }
    public static int Factorial(int n) {

        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
