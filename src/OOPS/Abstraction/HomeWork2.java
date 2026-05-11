package OOPS.Abstraction;

abstract class Bird {

    public abstract void eat();

    public abstract void fly();
}

abstract class Eagle extends Bird {

    public void fly() {
        System.out.println("Eagle is Flying ... ");
    }

    final public void hunt() {
        System.out.println("Eagle is hunting..");
    }


}

class SerpentEagle extends Eagle {

    @Override
    public void eat() {
        System.out.println("serpantEagle is eating..");
    }


//    @Override
//    public void hunt() {
//        System.out.println("SerpentEagle is hunting for snake ");
//    }  // if u create final method that cannot be overriden


}

final class GoldenEagle extends Eagle {
    // if class is final it cannot have any child classes in java
    final int x = 100;
    final static int p = 500;

    @Override
    public void eat() {
        System.out.println("Golden Eagle is eating..");
    }

}

//class ChildGoldenEagle extends GoldenEagle {
//
//    @Override
//    public void fly() {
//        System.out.println("Golden eagle is scared of flying ");
//    }
//}

public class HomeWork2 {

    public static void main(String[] args) {

        Eagle bird = new GoldenEagle();
        /* Note :
        You can create a reference of Class Eagle and Bird class But not the Class Object bcz specilized methods
        are not known to the Object class.
         */

        /* final concept also is cleared in this
         */


        bird.fly();
        bird.eat();
        bird.hunt();
        //  GoldenEagle.p =  600;  // it will show error bcz it is static
//        System.out.println(GoldenEagle.p);

    }

}
