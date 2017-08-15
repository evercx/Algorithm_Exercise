package Easy;

import java.util.Arrays;

/**
 * Created by EVERCX on 2017/8/14.
 *
 *
 * https://leetcode.com/problems/rotate-array/description/
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {

        k = k % nums.length;    //保证k在1-(n-1)内

        for(int i = 0,j = nums.length - 1;i<j;i++,j--){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }

        for(int i = 0,j = k - 1;i<j;i++,j--){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }

        for(int i = k,j = nums.length - 1;i<j;i++,j--){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }

    }

}
