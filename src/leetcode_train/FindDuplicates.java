
/*
* https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
*
* */

package leetcode_train;
import java.util.*;

public class FindDuplicates {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i]);
                value++;
                map.put(nums[i],value);
                result.add(nums[i]);
            }else{
                map.put(nums[i],1);
            }

        }
        return result;
    }


    public static void main(String[] args) {

        int[] nums = {4,3,2,7,8,2,3,1};

        List<Integer> Result = new FindDuplicates().findDuplicates(nums);

        for(int i = 0; i < Result.size(); i++)
            System.out.println(Result.get(i));

    }

}
