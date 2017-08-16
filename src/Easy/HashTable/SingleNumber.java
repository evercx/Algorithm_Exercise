package Easy.HashTable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by EVERCX on 2017/8/16.
 *
 * https://leetcode.com/problems/single-number/description/
 */
public class SingleNumber {

/*    public int singleNumber(int[] nums) {

        int result = 0;

        if(nums.length == 1) return nums[0];

        Arrays.sort(nums);

        for(int i = 1; i <nums.length-1; i+=2){
            if (nums[i] != nums[i-1]) return nums[i-1];
        }

        return result;

    }*/

    //方法二  把数组中所有元素异或起来 相同数异或为0 0异或任何数等于任何数其本身 异或操作可以交换 于是出现2次的数都被抵消为0,只剩下出现一次的数了
    public int singleNumber(int[] nums) {

        int result = 0;

        for(int i = 0; i <nums.length; i++){
            result ^= nums[i];
        }

        return result;
    }
}
