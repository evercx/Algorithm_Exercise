package leetcode_train;
/*
*
* https://leetcode.com/problems/beautiful-arrangement/description/
* */

public class CountArrangement {

    public int countArrangement(int N) {

        if (N == 0) return 0;

        int[] nums = new int[ N+1];
        nums[0] = -1;

        return findWays(nums,1);
    }

    public int findWays(int[] nums,int index){
        if (index == nums.length) return 1;
        int total = 0;

        for(int i = 1; i < nums.length;i++){
            if( nums[i] != 1 && ( i % index == 0 || index % i == 0)){
                nums[i] = 1;
                total += findWays(nums,index+1);
                nums[i] = 0;
            }
        }
        return total;

    }


    public static void main(String[] args) {

        int count = new CountArrangement().countArrangement(5);

        System.out.println(count);

    }
}
