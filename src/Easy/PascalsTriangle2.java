package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EVERCX on 2017/8/11.
 *
 *
 * https://leetcode.com/problems/pascals-triangle-ii/description/
 */
public class PascalsTriangle2 {


    // 求给定索引行的那一行  相当于把上一道题的res数组改成pre数组就可以了
    public List<Integer> getRow(int rowIndex) {

        List<Integer> resultArray = new ArrayList<Integer>();
        int rows = rowIndex + 1;

        List<Integer> preArray = new ArrayList<Integer>();
        preArray.add(1);

        for(int i=2;i<=rows;i++){

            List<Integer> currentArray = new ArrayList<Integer>();
            currentArray.add(1);

            for(int j=0;j<preArray.size()-1;j++){
                currentArray.add(preArray.get(j)+preArray.get(j+1));
            }
            currentArray.add(1);
            preArray = currentArray;
        }

        return preArray;

    }




}
