package Easy;

/**
 * Created by EVERCX on 2017/8/11.
 *
 *
 *https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 */
public class FindUnsortedSubarray {

    public int findUnsortedSubarray(int[] nums) {

        int res = nums.length;

        if(nums.length == 0) return 0;

        for(int i = 0; i< nums.length;i++){

            boolean isMin = true;

            for(int j = i+1; j<nums.length;j++){
                if( nums[i] > nums[j]) {
                    isMin = false;
                    break;
                }
            }

            if(isMin) res--; else break;

        }

        for( int i = nums.length -1; i>=0;i--){
            boolean isMax = true;

            for(int j = i-1;j>=0;j--){
                if( nums[i] < nums[j]) {
                    isMax = false;
                    break;
                }
            }
            if(isMax) res--; else break;
        }

        return res <=0 ? 0:res;

    }


    public static void main(String[] args) {

        FindUnsortedSubarray fus = new FindUnsortedSubarray();

        int res = fus.findUnsortedSubarray(new int[]{1,3,2,2,2});
        System.out.println(res);

    }
}
