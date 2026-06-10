package Collections_Framework.ArrayList;

import java.util.ArrayList;

public class Day11 {
    static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        System.out.println(al);

        ArrayList al2 = new ArrayList();
        al2.add(10);
        al2.add(20);
        al2.add(300);
        al2.add(40);
        System.out.println(al2);

        //System.out.println(al.size());  // to check how many elements are there in  the array list

        // System.out.println(al.getClass()); // gives which class it belongs to

        //  System.out.println(al.isEmpty());   // first check  array is empty or  not

//         System.out.println(al.contains(10)); // it will check whether element is there or not

//        al.set(2,1000);
//        System.out.println(al);  // it will replace the  data

        //System.out.println( al.get(2));  // to get the specific data
//        al.remove(1);
//        System.out.println(al);

//        al.removeAll(al2);  // it will compare and remove all the duplicate elements from the ArrayList
//        System.out.println(al); // al.retainAll(al2);  it will retain all duplciates between the arraylist

//        al.addAll(al2);
//        System.out.println(al);
//        al.addAll(1, al2);
//        System.out.println(al);

    }
}
