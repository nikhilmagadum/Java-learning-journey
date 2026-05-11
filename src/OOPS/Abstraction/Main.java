package OOPS.Abstraction;
// Hiding the omplementation of the code and showing only neccessary portioons
//
abstract class Plane {

    public  void takeOff(){
        System.out.println("Takking off");
    }

    protected  void fly(){
        System.out.println("Flying");
    }

     abstract void land();
}

class CargoPlane extends Plane {
    @Override
    public void takeOff() {
        System.out.println("Cargo plane is Taking off...");
    }
    @Override
    public void fly() {
        System.out.println("cargoPlane is flying..");
    }
    @Override
    void land() {
        System.out.println("cargoPlane is Landing...");
    }
}

class PassengerPlane extends Plane {
    @Override
    public void takeOff() {
        System.out.println("Passenger plane is Taking off...");
    }
    @Override
    public void fly() {
        System.out.println("Passenger Plane is flying..");
    }
    @Override
    void land() {
        System.out.println("Passenger Plane is Landing...");
    }
}

class FighterPlane extends Plane {
    @Override
    void land() {
        System.out.println("Fighter Plane is Landing...");
    }
}


public class Main {
    public static void main(String[] args) {

        Plane p = new FighterPlane();
        p.fly();
        p.takeOff();
        p.land();
    }
}
