package OOPS.Interface;


interface Parent1 {
    public abstract void add(int a, int b);
}

interface Parent2 {
    void sub(int a, int b);
}

// extends should be used for intefaces in java
interface Calculator extends Parent1, Parent2 {

    int x = 100;
    // public abstract void add(int a, int b);  //Every method in interface is a abstact by default also public

//    void sub(int a, int b);  // in interface methods cannot have a body

}

interface Calculator2 {
    void mul(int a, int b);

    void div(int a, int b);

}


class UnitConvertor {
    public void meterTocm(int mts) {
        System.out.println("Meteres = : " + (mts * 100));
    }
}

class MyCalculator implements Calculator {
    @Override
    public void add(int a, int b) {
        System.out.println("sum of : " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("difference is : " + (a - b));
    }
}

class MyCalculator2 implements Calculator {

    @Override
    public void add(int a, int b) {
        System.out.println("sum2 : " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("diff2 : " + (a - b));
    }

}

class MyCalculator3 extends UnitConvertor implements Calculator, Calculator2 {  // u can use comma for second ineterface

    @Override
    public void add(int a, int b) {
        System.out.println("sum3 : " + (a + b));
    }

    @Override
    public void sub(int a, int b) {
        System.out.println("diff3 : " + (a - b));
    }

    @Override
    public void mul(int a, int b) {
        System.out.println("Mul is : " + (a * b));
    }

    @Override
    public void div(int a, int b) {
        System.out.println("division is: " + (a / b));
    }
}


public class Day35Interface {
    public static void main(String[] args) {

        MyCalculator3 calc = new MyCalculator3();  // Multiple inheritance is achieved here if you have the same type
        calc.add(10, 30);
        calc.sub(50, 20);
        calc.meterTocm(10);
//        calc.mul(30,10);
//        calc.div(100,5);
//        calc.mul(10,20);  // It will work only when it is tight coupling
        System.out.println(Calculator.x);
    }
}
