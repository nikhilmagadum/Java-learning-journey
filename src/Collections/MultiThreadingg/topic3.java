package Collections.MultiThreadingg;


class Demo12 extends Thread {
    @Override
    public void run() {
        Thread t =  Thread.currentThread();
      System.out.println(t);
    }
}
public class topic3 {
    static void main(String[] args) {
//       Thread t =  Thread.currentThread();
//        System.out.println(t);
        Demo12  d1 = new  Demo12();
        d1.setName("Nikhil"); // Therad name has been changed
        d1.start();
    }
}
