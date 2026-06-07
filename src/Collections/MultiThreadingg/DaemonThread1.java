package Collections.MultiThreadingg;

// Here in this captain is the main player --> who decides who is coach  and all etc
// If Primary Thread completes the execution then Daemon threads will also complete the execution
// daemon Threads are just the helper threads not the main one
class Captain extends Thread {
    @Override
    public void run() {
        System.out.println(" Captain Enters the ground ");
        try{

            BattingCoach bac = new BattingCoach(); // captain is creating a batting coach --
            bac.setName("Batting");

            BowlingCoach boc = new BowlingCoach(); // captain is creating a bowling coach
            boc.setName("Bowling");

            bac.setDaemon(true);  // batting coach is  a helper now
            boc.setDaemon(true);  // they are going to help primary thread

            bac.start();
            boc.start();

            Thread.sleep(3000);
            System.out.println("Captain will warm up ");
            Thread.sleep(3000);
            System.out.println("catching fielding ");
            Thread.sleep(3000);
            System.out.println("catching catching ");
            Thread.sleep(3000);
            System.out.println("catching Batting ");
            Thread.sleep(3000);
            System.out.println("catching Bowling ");
            Thread.sleep(3000);

        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println("Captain will go to hotel ");

    }
}

class BattingCoach extends Thread {
    @Override
    public void run() {
        for( ; ; ) {
            System.out.println("Batting coach is in the ground ");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class BowlingCoach extends Thread{
    @Override
    public void  run() {
        for( ; ; ) {
            System.out.println("Bowling coach is in the ground ");
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }
}


public class DaemonThread1 {
    static void main(String[] args) {
        Captain c = new Captain();
        c.setName("Captain");

        c.start();

    }
}


