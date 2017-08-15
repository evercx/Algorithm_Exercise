package Easy;

import java.util.HashMap;

/**
 * Created by EVERCX on 2017/8/11.
 *
 *
 * https://leetcode.com/problems/contains-duplicate-ii/description/
 */
public class ContainsNearbyDuplicate {

    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(hashmap.containsKey(nums[i])){
                int distance = i - hashmap.get(nums[i]);

                min = Math.min(min,distance);
            }

            hashmap.put(nums[i],i);
        }

        return min <= k;

    }
}
