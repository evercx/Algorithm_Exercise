package Easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
*
* https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/description/
* */
public class FindDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> res = new ArrayList<Integer>();

        // 对nums数组中出现的数字在它的索引上设置为负值
        for(int i = 0; i < nums.length;i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] > 0) nums[index] = - nums[index];
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0) res.add(i+1);
        }
        return res;
    }

    public static void main(String[] args) {

        FindDisappearedNumbers fdn = new FindDisappearedNumbers();
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> res = fdn.findDisappearedNumbers(nums);
        System.out.print(res);


    }

}
