package OOPS.InnerClass;

@FunctionalInterface                 // Functional Interface which has only one method
interface Convertor {
    void display();
}

interface Add {
    int add(int a,int b);
}


interface Cube {
    int findCube(int x);
}
class ABC implements Convertor {
    @Override
    public void display() {
        System.out.println("Hello functional interface ");
    }
}

class Main {

    static class InnerNew {

        void display() {
            System.out.println("This is an inner class:");
        }

        static void main(String[] args) {
//            Convertor c = () -> {
//                System.out.println("This is an anonymous class or lamda expression ");
//            };
//            c.display();

           Add sum  = (int a ,int b ) -> {  return a+b;  };
            int res = sum.add(5,10);
            System.out.println(res);

            Cube cc = (int x) -> {  return  x*x*x; };

              int cube_res = cc.findCube(3);
            System.out.println(cube_res);

        }

    }

}
