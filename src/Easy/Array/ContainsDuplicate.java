package Easy;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by EVERCX on 2017/8/9.
 *
 * https://leetcode.com/problems/contains-duplicate/description/
 */
public class ContainsDuplicate {

//    public boolean containsDuplicate(int[] nums) {
//
//        Arrays.sort(nums);
//        for(int i = 0;i < nums.length-1;i++){
//            if(nums[i] == nums[i+1]) return true;
//        }
//        return false;
//
//    }

    // 解法二 用哈希表
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();

        for(int i = 0;i <nums.length;i++){
            if(hashMap.containsKey(nums[i])) return true;
            hashMap.put(nums[i],1);
        }
        return false;

    }
}
