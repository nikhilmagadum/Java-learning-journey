package Exception_AND_Multithreading.Exceptionn;

import java.util.Scanner;

class Demo11 {
    void alpha() throws Exception {
            System.out.println("Connection Established.");
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Numberator : ");
            int a = sc.nextInt();
            System.out.println("Enter the Denominator : ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println(c);
            System.out.println("Connection Terminated.");
    }
}

public class Duck {
    static void main(String[] args) {
        Demo11 d =  new Demo11();
        try {
            d.alpha();
        }catch(Exception e) {
            System.out.println("handled in Main");
        }
    }
}
// wherever Exception is happening that is not going to catch it
// This way of handing an exception is called as Dukcing an exception
//Instead of handling the exception inside the method, the method “passes” the responsibility to the calling method using throws.