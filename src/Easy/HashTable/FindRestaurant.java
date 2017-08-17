package Easy.HashTable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by EVERCX on 2017/8/17.
 *
 *
 * https://leetcode.com/problems/minimum-index-sum-of-two-lists/description/
 */
public class FindRestaurant {

    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String,Integer> map = new HashMap<String,Integer>();
        ArrayList<String> list = new ArrayList<String>();

        int leastSumIndex = Integer.MAX_VALUE;

        for(int i = 0;i < list1.length;i++){
            map.put(list1[i],i);
        }

        for(int i = 0;i < list2.length;i++){
            if(map.containsKey(list2[i])){
                if(map.get(list2[i]) + i < leastSumIndex){
                    leastSumIndex = map.get(list2[i]) + i;
                    list.clear();
                    list.add(list2[i]);
                }else if(map.get(list2[i]) + i == leastSumIndex){
                    list.add(list2[i]);
                }
            }
        }

        String[] result = new String[list.size()];

        for(int i = 0;i < list.size();i++){
            result[i] = list.get(i);
        }

        return result;

    }
}
