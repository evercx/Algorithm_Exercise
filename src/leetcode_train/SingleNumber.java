package leetcode_train;

/*
* https://leetcode.com/problems/single-number-iii/description/
*
* */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SingleNumber {

    public int[] singleNumber(int[] nums) {

        ArrayList<Integer> r = new ArrayList<>();
        Arrays.sort(nums);

        int n = 1;
        int temp = nums[0];

        for(int i = 1; i < nums.length; i++){

            if( nums[i] == temp){
                n++;
            }
            if( nums[i] != temp && n == 2){
                temp = nums[i];
                n = 1;
            }
            if(nums[i] != temp && n != 2){
                r.add(temp);
                temp = nums[i];
                n = 1;
            }
        }

        if(n == 1) r.add(temp);

        int[] result = new int[r.size()];
        for(int i = 0; i < result.length; i++) result[i] = r.get(i);

        return result;
    }


    public static void main(String[] args) {


        int[] nums = {1,2,1,3,2,5};

        int[] result = new SingleNumber().singleNumber(nums);

        for(int i = 0;i <result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}
