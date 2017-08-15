package Easy;

/**
 * Created by EVERCX on 2017/8/11.
 *
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
 *
 * For example,
    Given input array nums = [1,1,1,2]
 */
public class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) return 0;

        int index = 1;

        for(int i = 1;i < nums.length;i++){
            if(nums[i] != nums[i-1]){
                nums[index++] = nums[i];
            }

        }

        return index;

    }
}
