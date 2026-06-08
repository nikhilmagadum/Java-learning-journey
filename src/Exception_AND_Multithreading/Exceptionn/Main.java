package Exception_AND_Multithreading.Exceptionn;

import java.util.Scanner;

class Demo1 {
    void alpha() throws Exception {
        try {
            System.out.println("Connection Established.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Numberator : ");
            int a = sc.nextInt();
            System.out.println("Enter the Denominator : ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Handled in Alpha method.");
            throw e;
        } finally {
            System.out.println("Connection Terminated.");

        }
    }
}


public class Main {
    static void main(String[] args) {
        Demo1 d1 = new Demo1();
        try {
            d1.alpha();
        } catch (Exception e) {
            System.out.println("Handled exception in Main");
        }
    }
}
