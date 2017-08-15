package Easy;

import java.util.Arrays;

/**
 * Created by EVERCX on 2017/8/9.
 *
 * https://leetcode.com/problems/maximum-product-of-three-numbers/description/
 */
public class MaximumProduct {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length;
        int s = nums[n-1] * nums[n-2] * nums[n-3];
        //s = Math.max(s,nums[n-1]*nums[n-2]*nums[0]);
        s = Math.max(s,nums[n-1]*nums[1]*nums[0]);
        //s = Math.max(s,nums[1]*nums[2]*nums[0]);

        return s;
    }

    public static void main(String[] args) {

        MaximumProduct mp = new MaximumProduct();

        int a = mp.maximumProduct(new int[]{1,2,3,4});
        int b = mp.maximumProduct(new int[]{-7,-6,-5,4,-3,-2,-1,0,1,2,3,4});

        System.out.println(a);
        System.out.println(b);





    }
}
