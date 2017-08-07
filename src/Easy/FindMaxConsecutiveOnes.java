package Easy;
/*
*
* https://leetcode.com/problems/max-consecutive-ones/
* */
public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {

        int res = 0,ConsecutiveOnes = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                ConsecutiveOnes++;
                res = Math.max(res,ConsecutiveOnes);
            }else{
                ConsecutiveOnes = 0;
            }
        }

        return res;
    }

    public static void main(String[] args) {

        FindMaxConsecutiveOnes fmco = new FindMaxConsecutiveOnes();
        int[] nums = {1,1,0,1,1,1};
        int res = fmco.findMaxConsecutiveOnes(nums);
        System.out.print(res);


    }
}
