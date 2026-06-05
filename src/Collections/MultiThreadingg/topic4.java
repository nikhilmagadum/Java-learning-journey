package Collections.MultiThreadingg;
// join() in thread in java
// isAlive()
class Demonew extends Thread {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName() + " started to execute ");
        System.out.println(t.getName() + "  is executing ");
        System.out.println(t.getName() + "  is executing ");
        System.out.println(t.getName() + "  is executing ");
        System.out.println(t.getName() + "  is executed ");
    }
}

public class topic4 {
    static void main(String[] args) {
        Thread t =  Thread.currentThread();
        System.out.println(t.getName() + " started to execute");
        System.out.println(t.getName() + " is executing");
        System.out.println(t.getName() + " is executing");
        Demonew d1 =  new Demonew();
        d1.start();
        try {
            d1.join();  // to complete this execution first
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(d1.isAlive());  // to check whether thread execution is completed or not
        System.out.println(t.getName() + " is executing");
        System.out.println(t.getName() + " is executed");
    }
}
