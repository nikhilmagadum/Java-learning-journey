package PracticeFile;
import java.util.Scanner;

public class Fibanaccii {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        int firstNumber = 0;
        int secondNumber = 1;
        int third = 0;
        for (int i = 0; i <= n; i++) {
            System.out.print(firstNumber + ",");
            third = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = third;

        }
    }
}
