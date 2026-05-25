package Collections;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2Day39 {
    static void main(String[] args) {
        System.out.println("Connection Esablished. ");

        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the Numerator : ");

            int a = sc.nextInt();
            System.out.println("Enter the Denominator : ");

            int b = sc.nextInt();
            int c = a / b;


            System.out.println("The Result is : ");
            System.out.println(c);

            // -----------------------------------------------------------------

            System.out.println("Enter the size of an array: ");
            int n = sc.nextInt();

            int[] arr = new int[n];

            System.out.println("Enter the data to be inserted : ");
            int data = sc.nextInt();

            System.out.println("Enter the index where elements to be inserted : ");
            int index = sc.nextInt();

            arr[index] = data;

            System.out.println(arr[index]);
        } catch (ArithmeticException e) {
            System.out.println("Invalid Output enter + ve number more than 0  ");
        } catch (NegativeArraySizeException neg) {
            System.out.println("enter the positive number ");
        } catch (InputMismatchException proper) {
            System.out.println("Enter the  proper input in number : ");
        } catch (ArrayIndexOutOfBoundsException out) {
            System.out.println("be in ur limits ");
        } catch (Exception e) {
            System.out.println("sum problem");
        }

        System.out.println("Connection Terminated.");
    }
}
