package Collections.MultiThreadingg;

class Demo extends Thread {

    public void run() {

        try {
            System.out.println("Running");

            Thread.sleep(3000);

            System.out.println("Finished");

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

public class ThreadLifeCycle{

    public static void main(String[] args) {

        Demo d = new Demo();      // NEW

        d.start();                // RUNNABLE → RUNNING
    }
}