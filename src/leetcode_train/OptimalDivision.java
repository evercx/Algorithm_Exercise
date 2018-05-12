package leetcode_train;

import java.util.List;

public class OptimalDivision {

    public String optimalDivision(int[] nums) {

        if(nums.length == 1) return String.valueOf(nums[0]);
        if(nums.length == 2) return String.valueOf(nums[0]) + "/" + String.valueOf(nums[1]);

        String first = String.valueOf(nums[0]) + "/";
        String second = String.valueOf(nums[1]);

        String last = "";
        for(int i = 2; i < nums.length;i++){
            second += "/";
            second += String.valueOf(nums[i]);
        }

        return first + "(" + second + ")";

    }


    public static void main(String[] args) {

        int[] nums = {1000,100,10,2};

        String result = new OptimalDivision().optimalDivision(nums);

        System.out.println(result);

    }
}
