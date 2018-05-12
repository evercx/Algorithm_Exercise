package leetcode_train;

import java.util.ArrayList;
import java.util.List;

/*
*
*  https://leetcode.com/problems/single-element-in-a-sorted-array/description/
*
* */

public class SingleNonDuplicate {

    public int singleNonDuplicate(int[] nums) {

        int result = nums[0];
        int n = 1;

        for(int i = 1; i < nums.length;i++){

            if(nums[i] == result){
                n++;
            }

            if(nums[i] != result && n == 2){
                n = 1;
                result = nums[i];
            }
        }

        return result;
    }


    public static void main(String[] args) {

        int[] nums1 = {1,1,2,3,3,4,4,8,8};
        int[] nums2 = {3,3,7,7,10,11,11};

        int result1 = new SingleNonDuplicate().singleNonDuplicate(nums1);
        int result2 = new SingleNonDuplicate().singleNonDuplicate(nums2);

        System.out.println(result1);
        System.out.println(result2);

    }
}
