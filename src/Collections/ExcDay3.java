package Collections;

import java.util.Scanner;

class Demo1 {
    void alpha() {
        try {
            System.out.println("Connection Established.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Numberator : ");
            int a = sc.nextInt();
            System.out.println("Enter the Denominator : ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
            System.out.println("Connection Terminated.");
        } catch (Exception e) {
            System.out.println("Handled in Alpha method.");
        }
    }
}


public class ExcDay3 {
    static void main(String[] args) {
        Demo1 d1 = new Demo1();
        d1.alpha();
    }
}
