package Exception_AND_Multithreading.MultiThreadingg;

import java.util.Scanner;

class Demo1 extends Thread {
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

class Demo2 extends Thread {
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

class Demo3 extends Thread {
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

public class Day1 {
    static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo2 d2 = new Demo2();
        Demo3 d3 = new Demo3();

        d1.start();
        d2.start();
        d3.start();   // call indirectly through start() not directly through run()
    }
}
