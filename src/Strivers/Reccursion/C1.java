package Strivers.Reccursion;

public class C1 {

    public static  int count = 0;
   public static void function1() {

       if(count == 3) {
           System.out.println("The coubt balue : " + count);
           return;
       }
        System.out.println(count);
        count++;
        function1();
    }
    static void main(String[] args) {

       function1();
    }
}
