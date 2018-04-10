package leetcode_train;

import java.util.HashMap;

/**
 * Created by EVERCX on 2018/3/30.
 *
 * https://leetcode-cn.com/problems/distribute-candies/description/
 */
public class DistributeCandies {

    // 把种类的个数和数组长度个数的一半做比较   因为要平均分  所以当种类个数超过一半时 按一半来算

    public int distributeCandies(int[] candies) {

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0;i < candies.length;i++){
            if(!map.containsKey(candies[i])){
               map.put(candies[i],0);
            }else {
                int value = map.get(candies[i]);
                value++;
                map.put(candies[i],value);
            }

        }

        if( map.size() > candies.length / 2) return candies.length / 2;
        else return map.size();

    }
}
