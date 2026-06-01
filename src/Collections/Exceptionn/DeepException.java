package Collections.Exceptionn;

import java.util.Scanner;

public class DeepException {
    static void main(String[] args) {
    try {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a / b;
        System.out.println(c);
    }
    catch(Throwable e) {
        System.out.println("Catch Block");
        System.out.println(e.getMessage());
        System.out.println(e);
        e.printStackTrace();
    }
    }
}
