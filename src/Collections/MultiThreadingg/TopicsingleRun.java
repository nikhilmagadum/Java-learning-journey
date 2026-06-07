package Collections.MultiThreadingg;
// How will u achieve multithreading using single run()

import java.util.Scanner;

class SingleRun extends Thread {

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        String name = t.getName();

        if (name.equals("Thread-0")) {
            add();
        } else if (name.equals("Thread-1")) {
            printChar();
        } else {
            printNumbers();
        }
    }

    public void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1 ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number2 ");
        int num2 = sc.nextInt();
        int res = num1 + num2;
        System.out.println("The result of addition is :" + res);
    }

    public void printChar() {
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

    public void printNumbers() {
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


public class TopicsingleRun {
    static void main(String[] args) {

        SingleRun s1 = new SingleRun();
        SingleRun s2 = new SingleRun();
        SingleRun s3 = new SingleRun();

        s1.start();
        s2.start();
        s3.start();

    }
}
