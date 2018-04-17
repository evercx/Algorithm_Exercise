package leetcode_train;
import java.util.*;
/**
 * Created by EVERCX on 2018/4/12.
 *
 * https://leetcode-cn.com/problems/subsets/description/
 *
 * https://www.cnblogs.com/felixfang/p/3775712.html
 */
public class SubSets {

    // 按照递推规律来,观察S=[], S =[1], S = [1, 2] 时解的变化。
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>();
        List<List<Integer>> tempSets = new ArrayList<>();

        result.add(subset);

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < result.size();j++){
                List<Integer> curSet = copy(result.get(j));
                curSet.add(nums[i]);
                tempSets.add(curSet);
            }
            result.addAll(tempSets);
            tempSets.clear();
        }

        return result;

    }
    public List<Integer> copy(List<Integer> list){
        List<Integer> resList = new ArrayList<Integer>();
        if( list.size() == 0) return resList;

        for(int i = 0;i<list.size();i++) {
            resList.add(list.get(i));
        }

        return resList;
    }

    public static void main(String[] args) {

        int num = 5;

        int[] result = new int[num+1];
        result[0] = 0;
        int base = 1;
        while(base <= num){
            int next = base * 2;
            for(int i=base; i<next && i<= num; i++)
                result[i] = result[i-base]+1;
            base = next;
        }
        for(int i = 0;i <result.length;i++) System.out.println(result[i]);
    }


}

