package Easy;

/**
 * Created by EVERCX on 2017/8/9.
 *
 * https://leetcode.com/problems/maximum-subarray/description/
 */
public class MaxSubArray {

    public int maxSubArray(int[] nums) {

        int res = Integer.MIN_VALUE;
        int currentSum = 0;

        for(int i = 0;i < nums.length;i++){
            currentSum = Math.max(currentSum + nums[i],nums[i]);
            res = Math.max(res,currentSum);
        }

        return res;

    }
}
