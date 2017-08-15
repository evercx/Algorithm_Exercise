package Easy;

import java.util.HashMap;

/**
 * Created by EVERCX on 2017/8/8.
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
 *
 */
public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {

        int[] res = new int[2];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i= 0;i<numbers.length;i++){
            int minusResult = target - numbers[i];
            if(map.containsKey(minusResult)){
                res[0] = map.get(minusResult) + 1;
                res[1] = i + 1;
                return res;
            }
            map.put(numbers[i],i);
        }
        return res;

    }

    public static void main(String[] args) {

        //1.Two Sum
        TwoSum2 ts = new TwoSum2();
        int[] a = {2, 7, 11, 15};
        int[] res = ts.twoSum(a,9);

        //System.out.println(res);
        printArray(res);

    }

    public static void printArray(int[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
