package Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Day1Access {
    static void main(String[] args) {
        ArrayList al = new ArrayList();

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        System.out.println(al);

        ListIterator litr = al.listIterator();

        while (litr.hasNext()) {   // Previous hasNext() for backword
            System.out.println(litr.next());     //  previous
        }

//        Iterator itr = al.iterator();
//
//        while( itr.hasNext()) {
//            System.out.println(itr.next());
//        }

//        Iterator itr = al.iterator();
//        itr.hasNext();
//        System.out.println(itr.next());
//        itr.hasNext();
//        System.out.println(itr.next());
//        itr.hasNext();
//        System.out.println(itr.next());


//        for (Object a : al) {
//            System.out.println(a);
//        }

//        for(int i = 0 ; i < al.size() ; i++) {
//            System.out.println(al.get(i));
//        }
    }
}
