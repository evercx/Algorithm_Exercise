package Easy;

/**
 * Created by EVERCX on 2017/8/9.
 *
 * https://leetcode.com/problems/search-insert-position/description/
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {

        int i;

        for(i = 0;i<nums.length;i++){

            if( nums[i] >= target) return i;

        }

        return i;

    }

}
