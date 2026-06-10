package Collections_Framework.Box_and_unbox;

public class Box {
    static void main(String[] args) {

        int a = 10;

        Integer i = new Integer(a);
        Integer auto = a;
        System.out.println(i);
        System.out.println(a);
        System.out.println(auto);

        //Boxing is the process of converting a primitive type into its corresponding wrapper object.
    }
}
