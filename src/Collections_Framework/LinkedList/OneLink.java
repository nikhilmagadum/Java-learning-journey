package Collections_Framework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class OneLink {
    static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);

//        for (int i = 0; i < ll.size();i++) {
//            System.out.println(ll.get(i));
//        }

//        for (Object a  :  ll) {
//            System.out.println(a);
//        }

//        Iterator itr =  ll.iterator();
//        while(itr.hasNext()) {
//            System.out.println(itr.next());
//        }

      ListIterator litr =  ll.listIterator(ll.size());

      while(litr.hasPrevious())
      {
          System.out.println(litr.previous());
      }


       // System.out.println(ll.peek());
       //  System.out.println(ll.poll());
     //   System.out.println(ll);
       // System.out.println(ll.peekLast());
    }
}
