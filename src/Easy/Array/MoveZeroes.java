package Easy;
/*
*
* https://leetcode.com/problems/move-zeroes/description/
* */
public class MoveZeroes {
    //压缩法  非零数前移 剩余位子填0
    public void moveZeroes(int[] nums) {
         int pos = 0;

         for(int i = 0; i < nums.length; i++){
             if(nums[i] != 0){
                 nums[pos++] = nums[i];
             }
         }

         for(;pos<nums.length;pos++) nums[pos] = 0;
    }
}
