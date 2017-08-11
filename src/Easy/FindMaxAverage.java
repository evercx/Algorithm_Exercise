package Easy;

/**
 * Created by EVERCX on 2017/8/10.
 *
 * https://leetcode.com/problems/maximum-average-subarray-i/description/
 */
public class FindMaxAverage {

    // 双重循环 超时了
//    public double findMaxAverage(int[] nums, int k) {
//
//        double res = Integer.MIN_VALUE;
//
//        for(int i = 0;i <= nums.length-k;i++){
//            double temp = 0;
//            for(int j =0;j<k;j++){
//                temp += nums[i+j];
//            }
//            res = Math.max(res,temp/k);
//        }
//
//        return res;
//    }

    public double findMaxAverage(int[] nums, int k) {

        int[] sum = new int[nums.length];

        sum[0] = nums[0];
        for(int i = 1;i <sum.length;i++){
            sum[i] = sum[i-1] + nums[i];
        }

        double res = sum[k-1] * 1.0 / k;

        for(int i =k;i< sum.length;i++){
            res = Math.max(res,(sum[i] - sum[i-k]) * 1.0/k);
        }

        return res;

    }

    public static void main(String[] args) {

        FindMaxAverage fma = new FindMaxAverage();
        double res = fma.findMaxAverage(new int[]{-1},1);
        System.out.println(res);

    }
}
