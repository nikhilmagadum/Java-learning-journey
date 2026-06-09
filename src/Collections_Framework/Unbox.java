package Collections_Framework;

public class Unbox {
    static void main(String[] args) {
        Integer i =  new Integer(10);
        int a = i.intValue();

        int b =  i;
// Unboxing is the reverse process—converting a wrapper object back into a primitive type.
//        System.out.println(i);
//        System.out.println(b);

        float al =  8484.737f;
        Float hs = al;
        System.out.println(hs);
        System.out.println(al);

        Float fl = new Float(7363.6363);
        float f = fl.floatValue();
        System.out.println(f);
        System.out.println(fl);


    }
}
