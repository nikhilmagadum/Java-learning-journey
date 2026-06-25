package Collections_Framework.ArrayDeque;

import java.util.ArrayDeque;


public class Deque {
    static void main(String[] args) {

        ArrayDeque ad = new ArrayDeque();

        ad.add(20);
        ad.addFirst("N");
        ad.add(30);


        System.out.println(ad.getFirst());
    }
}
