package leetcode_train;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by EVERCX on 2018/3/29.
 *
 * https://leetcode-cn.com/problems/elimination-game/description/
 */
public class LastRemaining {

    public int lastRemaining(int n) {

        int distance = 1;
        int low = 1;
        int high = n;
        boolean left2right = true;

        while (low < high){
            n = (high - low) / distance;

            if(left2right){
                low += distance;
                if(n%2 == 0) high -= distance;
            }else {
                high -= distance;
                if(n%2 == 0) low += distance;
            }

            distance *= 2;
            left2right = !left2right;

        }
        return low;

    }

    public static void main(String[] args) {


    }
}
