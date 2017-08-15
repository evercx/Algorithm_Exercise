package Easy;
import java.lang.reflect.Array;
import java.util.Arrays;

/*
*
* https://leetcode.com/problems/array-partition-i/description/
* */
public class ArrayPairSum {

    public int arrayPairSum(int[] nums) {

        if (nums.length <= 0 ) return 0;

        int sum = 0;

        Arrays.sort(nums);

        for(int i = 0;i<nums.length;i+=2){
            sum += nums[i];
        }

        return sum;

    }

    public static void main(String[] args) {

        int[] nums = {1,4,3,2};
        ArrayPairSum ap = new ArrayPairSum();

        int res = ap.arrayPairSum(nums);
        System.out.print(res);


    }
}
