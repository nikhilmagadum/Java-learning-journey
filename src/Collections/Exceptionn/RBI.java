package Collections.Exceptionn;

import java.util.Scanner;

class Atm {
    int pin = 1234;
    int p;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Pin");
        p = sc.nextInt();
    }

    public void verify() throws Exception {
        if (pin == p) {
            System.out.println("Collect Money");
        } else {
            System.out.println("Invalid Input");
            InvalidInputException ie = new InvalidInputException();
            throw ie;
        }
    }
}

class InvalidInputException extends Exception {

}

class Bank {

    public void Init() {
        Atm a = new Atm();
        try {
            a.acceptInput();
            a.verify();
        } catch (Exception e) {
            try {
                a.acceptInput();
                a.verify();
            } catch (Exception d) {
                try {
                    a.acceptInput();
                    a.verify();
                } catch (Exception f) {
                    System.out.println("Card Blocked.Please Contact bank");
                }
            }
        }
    }
}

public class RBI {
    static void main(String[] args) {
        Bank b = new Bank();
        b.Init();
    }
}
