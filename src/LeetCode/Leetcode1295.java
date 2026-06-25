package LeetCode;

public class Leetcode1295 {
    static void main(String[] args) {

        int nums[] =  {12,345,2,6,7896};

        int count = 0 ;
        int res = 0;
        for (int i = 0 ; i < nums.length; i++) {
            nums[i] =  nums[i] / 10;
            count++;

            if(count % 2 == 0) {
                 res++;
            }

        }
        System.out.println();
        System.out.println(res);

    }
}
