package Collections.Exceptionn;
import java.util.Scanner;

public class ExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Connection Esatblished.");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Numerator : ");
            int a = sc.nextInt();
            System.out.println("Enter the Denominator : ");
            int b = sc.nextInt();
            int c = a / b;
            System.out.println("The Result is : ");
            System.out.println(c);
        }
        catch(Exception e) {
            System.out.println("Please Enter the valid input.Do not give Zero as a denominator ");
            System.out.println("Here check the error ");
            System.out.println();
            System.out.println(e);
        }
        System.out.println("Connection Terminated.");

    }
}
