package Easy;

import java.util.Arrays;

/**
 * Created by EVERCX on 2017/8/11.
 *
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 */
public class FindPairs {
    public int findPairs(int[] nums, int k) {

        Arrays.sort(nums);

//        for(int m = 0;m<nums.length;m++){
//            System.out.print(nums[m]+" ");
//        }

        int res = 0;

        for(int i = 0;i < nums.length - 1;i++){

            if( i > 0 && nums[i-1] == nums[i]) continue;

            for(int j = i+1;j < nums.length;j++){

                if( nums[j] - nums[i] == k) {
                    if( j > i+1 && nums[j-1] == nums[j]) {}
                    else{
                        res++;
                    }

                    //System.out.println("("+nums[i]+","+nums[j]+")");
                }
                if( nums[j] - nums[i] > k) break;

            }
        }

        return res;

    }


    public static void main(String[] args) {

        FindPairs fp = new FindPairs();
        int[] nums = new int[]{1, 1, 1, 1, 1};

        int res = fp.findPairs(nums,0);

        System.out.println(res);

    }
}
