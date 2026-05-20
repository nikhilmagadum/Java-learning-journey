package OOPS.InnerClass;

@FunctionalInterface                 // Functional Interface which has only one method
interface convertor {
    void display();
}

class ABC implements convertor {
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
        ABC ab =  new ABC();
        ab.display();

        InnerNew in = new InnerNew();
      in.display();
        }


    }

}
