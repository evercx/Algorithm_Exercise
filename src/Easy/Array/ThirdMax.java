package Easy;

/**
 * Created by EVERCX on 2017/8/14.
 */
public class ThirdMax {

    public int thirdMax(int[] nums) {

        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }else if(nums[i] < first && nums[i] > second){
                third = second;
                second = nums[i];
            }else if( nums[i] < second && nums[i] > third){
                third = nums[i];
            }
        }

        if( second == Long.MIN_VALUE || third == Long.MIN_VALUE) return (int)first;

        return (int)third;

    }

    public static void main(String[] args) {

        ThirdMax tm = new ThirdMax();
        tm.thirdMax(new int[]{1,2});

    }
}
