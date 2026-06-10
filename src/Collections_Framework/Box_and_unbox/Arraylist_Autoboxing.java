package Collections_Framework.Box_and_unbox;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;


class Dog {

}
public class Arraylist_Autoboxing {
    static void main(String[] args) {


        Dog d =  new Dog();
        ArrayList al =  new ArrayList();
        al.add(10);
        al.add(d);
        al.add(new Thread());
        al.add(new Exception());
        System.out.println(al);

    }
}
// ArrayList stores everything as object in it