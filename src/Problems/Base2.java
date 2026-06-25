package Problems;

public class Base2 {

    public static int findElement(int[] arr, int target) {

        int i =0;
        for( i = 0 ; i < arr.length; i++) {
            if(arr[i] ==  target) {
                return i;
            }
        }
        return -1;
    }

    static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int   target = 30;

       int res =  findElement(arr,target);
        System.out.println(res + " the answer");

        }
    }

