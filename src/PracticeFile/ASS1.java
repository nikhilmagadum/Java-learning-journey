package PracticeFile;


public class ASS1  {
    public static void main(String[] args) {

        try {
            for (char c = 'A'; c <= 'E'; ++c) {
                System.out.print(c + " ");
                Thread.sleep(1000);
            }
        } catch (Exception e) {
            System.out.println("enter propelry");
        }
    }
}
