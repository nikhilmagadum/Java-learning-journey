package PracticeFile;
import java.util.Scanner;
public class COuntNumnber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");

        int count = 0 ;
        int n = sc.nextInt();
        for(int i = 1 ; i <=n ; i ++){
          if (n > 0) {
              n = n/10;
              count++;
          }
        }
        System.out.println(count);
    }
}
