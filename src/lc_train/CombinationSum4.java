package lc_train;

import java.util.*;

/**
 * Created by EVERCX on 2018/3/26.
 *
 * https://leetcode-cn.com/problems/combination-sum-iv/description/
 */
public class CombinationSum4 {
    public int combinationSum4(int[] nums, int target) {

        int[] dp = new int[target + 1];
        dp[0] = 1;
        Arrays.sort(nums);
        // dp[n] = dp[n] + dp[n-i]

        for(int n = 1; n <= target; n++){
            for(int i = 0;i < nums.length;i++){
                if(n >= nums[i]){
                    dp[n] = dp[n] + dp[n - nums[i]];
                }else break;
            }

        }

        return dp[target];

    }

    public static void main(String[] args) {

        int[] nums = {1,2,3};

        int target = 4;

        int result = new CombinationSum4().combinationSum4(nums,target);

        System.out.println(result);



    }
}
