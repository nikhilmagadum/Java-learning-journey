package Problems;

public class Base1 {
    static void main(String[] args) {
        int[] arr =  { 2 ,3 , 1 ,6 , 7 ,8 ,10,10000,939};

        int i = 0;
        int max =  arr[0];

        for( i = 1; i < arr.length; i++) {
        if(max < arr[i]) {
            max = arr[i];
        }
        }
        System.out.println(max);

    }
}
