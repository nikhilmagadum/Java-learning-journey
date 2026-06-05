package Collections.MultiThreadingg;

import java.util.Scanner;

class Demo11 implements Runnable {

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 ");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("The result of addition is :" + res);
    }
}

class Demo22 implements Runnable {
    @Override
    public void run() {
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
    }
}

class Demo33 implements Runnable {
    @Override
    public void run() {
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

public class Day2 {
    static void main(String[] args) {

        Demo11 d1 = new Demo11();
        Demo22 d2 = new Demo22();
        Demo33 d3 = new Demo33();

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        Thread t3 = new Thread(d3);

        t1.start();
        t2.start();
        t3.start();

    }
}
