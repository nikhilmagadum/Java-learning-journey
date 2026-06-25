package Collections_Framework.TreeSet;

import java.util.TreeSet;

public class Treee1 {

    static void main(String[] args) {
        TreeSet ts = new TreeSet();

        ts.add(100);
        ts.add(1000);
        ts.add(180);
        ts.add(140);
        ts.add(200);
        ts.add(120);

        System.out.println(ts);
//        System.out.println(ts.ceiling(150));
//        System.out.println(ts.higher(120));
        System.out.println(ts.floor(191));
        System.out.println(ts);


    }
}
