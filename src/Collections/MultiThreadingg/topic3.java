package Collections.MultiThreadingg;


class Demo12 extends Thread {
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        // System.out.println(t);
        System.out.println(t.getName()); // i will get only name
        System.out.println(t.getPriority());  // i will get only priority
        System.out.println(t.getThreadGroup());   // it will give thread group
    }
}

public class topic3 {
    static void main(String[] args) {
//       Thread t =  Thread.currentThread();
//        System.out.println(t);
        Demo12 d1 = new Demo12();
        d1.setName("Nikhil"); // Therad name has been changed
        d1.setPriority(3);    //  setting the priority
        d1.start();

    }
}
