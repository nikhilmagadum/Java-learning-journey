package Collections_Framework.ArrayDeque;

import java.util.ArrayDeque;

public class Stackk {
    static void main(String[] args) {

        ArrayDeque ad = new ArrayDeque();

        ad.push(10);  // push means inserting the data inside the ad
        ad.push(20);
        ad.push(30);
        ad.push(40);  //  pop means get the data

        System.out.println(ad.pop());
        System.out.println(ad.pop());
        System.out.println(ad.pop());
        System.out.println(ad.pop());
        System.out.println(ad);

    }
}
