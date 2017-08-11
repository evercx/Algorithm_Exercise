package Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EVERCX on 2017/8/10.
 *
 * https://leetcode.com/problems/pascals-triangle/description/
 */
public class PascalsTriangle {

    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> resList = new ArrayList<List<Integer>>();
        if (numRows == 0) return resList;

        List<Integer> preList = new ArrayList<Integer>();
        preList.add(1);
        resList.add(preList);

        for(int i = 2;i<=numRows;i++){
            List<Integer> curList = new ArrayList<Integer>();

            curList.add(1);
            for(int j = 0;j<preList.size()-1;j++){
                curList.add(preList.get(j)+preList.get(j+1));
            }
            curList.add(1);
            preList = curList;
            resList.add(preList);
        }
        return resList;

    }
}
