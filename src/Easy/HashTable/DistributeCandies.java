package Easy.HashTable;

import java.util.HashMap;

/**
 * Created by EVERCX on 2017/8/15.
 *
 * https://leetcode.com/problems/distribute-candies/description/
 */
public class DistributeCandies {

    // 如果种类的数目多于总数字的半数，那么只能选半数的，否则不能平均分成两堆，否则就可以选择种类的个数做最多的分类个数

    public int distributeCandies(int[] candies) {

        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i = 0; i < candies.length;i++){

            if(map.containsKey(candies[i])) {
                int value = map.get(candies[i]);
                value++;
                map.put(candies[i],value);
            }else {
                map.put(candies[i],0);
            }
        }

        if (map.size() > (candies.length/2)) return candies.length/2;
        else return map.size();
    }

}
