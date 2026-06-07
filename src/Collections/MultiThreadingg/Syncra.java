package Collections.MultiThreadingg;

// Very important question
//what is semaphore in java --> instructions are only semaphore
//A Semaphore in Java is a synchronization tool that controls access to a shared resource by managing a set of virtual permits
// it is a locking system in java in any point of time only one thread can access these instructions
//what are monitors --> set of instructions executing  by the Thread is called as Monitors
class BathRoom {
    synchronized void bathroom() {  // synchronized is ==  to lock

        try {
            String name = Thread.currentThread().getName();  // The return type should be as last i.e getName(); not Thread
            System.out.println(name + " has  entered in bathroom ");
            Thread.sleep(3000);
            System.out.println(" is using the bathrrom ");
            Thread.sleep(3000);
            System.out.println(name + " has exited from the bathroom ");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

class Boy extends Thread {
    BathRoom ba;

    public Boy(BathRoom ba) {
        this.ba = ba;
    }

    @Override
    public void run() {
        ba.bathroom();
    }

}

class Girl extends Thread {
    BathRoom ba;

    public Girl(BathRoom ba) {
        this.ba = ba;
    }

    @Override
    public void run() {
        ba.bathroom();
    }
}

class Others extends Thread {
    BathRoom ba;

    public Others(BathRoom ba) {
        this.ba = ba;
    }

    @Override
    public void run() {
        ba.bathroom();
    }
}


public class Syncra {
    static void main(String[] args) {

        BathRoom ba = new BathRoom();

        Boy b = new Boy(ba);
        Girl g = new Girl(ba);
        Others o = new Others(ba);

        b.setName("boy");
        g.setName("girl");
        o.setName("others");

        b.start();
        g.start();
        o.start();

    }
}
