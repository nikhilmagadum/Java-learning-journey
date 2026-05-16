package DSA.KK.Arrays;
public class YReverse {

    static void main(String[] args) {

        String str = "Hello World";
        String rev = "";
        char ch ;

        System.out.println("Original String: " + str);

        for (int i =0 ; i < str.length();i++){
            ch = str.charAt(i);
            rev =  ch + rev;
        }
        System.out.println("Reversed String: " + rev);

    }
}
