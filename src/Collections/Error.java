package Collections;

public class Error {
    static void main(String[] args) {

        for(int i = 65; i <= 69 ; i++) {
            System.out.println((char)i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                System.out.println("Handled");
            }
        }
    }
}
