package Easy;

import java.util.Arrays;

/**
 * Created by EVERCX on 2017/8/9.
 *
 * https://leetcode.com/problems/missing-number/description/
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {

        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i) return i;
        }

        return nums.length;
    }

}
