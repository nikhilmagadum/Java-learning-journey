package PracticeFile;

public class RecursionExample {
    public static void main(String[] args) {
        countDown(3);
    }

    public static void countDown(int n) {
        // 1. BASE CASE
        if (n == 0) {
            System.out.println("Blast off!");
        }
        // 2. RECURSIVE STEP
        else {
            System.out.println(n);
            countDown(n - 1); // The method calls itself!
        }
    }
}