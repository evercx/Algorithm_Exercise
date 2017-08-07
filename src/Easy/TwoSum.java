package Easy;
import java.util.HashMap;
/*
*
1. Two Sum
Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
*
*https://leetcode.com/problems/two-sum/description/
*
* */

public class TwoSum {

    // 解法一 双重循环暴力求解
//    public int[] twoSum(int[] nums, int target) {
//        int[] a = new int[2];
//        for(int i = 0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//
//                if (nums[i] + nums[j] == target){
//                    a[0] = i;
//                    a[1] = j;
//                }
//            }
//        }
//        return a;
//    }

    // 解法二  使用哈希表
    public int[] twoSum(int[] nums, int target) {

        int[] a = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i =0;i<nums.length;i++){

            int minusResult = target - nums[i];
            if(map.containsKey(minusResult)){
                a[0] = map.get(minusResult);
                a[1] = i;
            }
            map.put(nums[i],i);
        }

        return a;
    }

    public static void main(String[] args) {

        //1.Two Sum
        TwoSum ts = new TwoSum();
        int[] a = {3,3,5};
        int[] res = ts.twoSum(a,6);

        //System.out.println(res);
        printArray(res);

    }

    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
