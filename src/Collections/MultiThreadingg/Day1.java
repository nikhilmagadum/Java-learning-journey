package Collections.MultiThreadingg;

import java.util.Scanner;

public class Day1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 ");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("The result of addition is :" + res);

        System.out.println("Printinh characters started ");
        for (int i = 65; i <= 75; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(1000, 1000);
            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
                e.printStackTrace();
            }
        }
        System.out.println("Printing characters ended ");

        System.out.println("Printing Numbers");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
