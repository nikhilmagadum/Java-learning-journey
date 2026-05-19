package DSA.KK.Arrays.Ayush;

public class NormalMaxLogic {

    static void main(String[] args) {
        int[] arr = { 3, 4 , 5 , 8 , 66 , 7};

        int max =  arr[0];
        for (int i = 1; i < arr.length;i++) {
            if (arr[i] > max) {
                max  =  arr[i];
            }
        }
        System.out.println(max);
    }
}
