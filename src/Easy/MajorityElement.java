package Easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by EVERCX on 2017/8/8.
 *
 * https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        int res = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i <nums.length;i++){
            if(map.containsKey(nums[i])){
                int s = map.get(nums[i]);
                map.put(nums[i],++s);
                if(s > n) {
                    res = nums[i];
                    break;
                }
            }else{
                if (nums.length == 1) res = nums[0];
                map.put(nums[i],1);
            }
        }

        return  res;
    }

    // 解法二  把数组排序后 如果存在超过一半数的数字 那么它一定在这个数组的中间位子
//    public int majorityElement(int[] nums) {
//
//        Arrays.sort(nums);
//        return nums[nums.length/2];
//    }

}
