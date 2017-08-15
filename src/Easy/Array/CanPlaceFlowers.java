package Easy;

/**
 * Created by EVERCX on 2017/8/11.
 *
 *
 * https://leetcode.com/problems/can-place-flowers/description/
 *
 *
 * Example 1:
 * Input: flowerbed = [1,0,0,0,1], n = 1
 * Output: True
 * Example 2:
 * Input: flowerbed = [1,0,0,0,1], n = 2
 * Output: False
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        if (n == 0) return true;

        for(int i = 0;i<flowerbed.length;i++){

            if( flowerbed[i] == 0 && (i == 0 || flowerbed[i-1] == 0 ) && (i == (flowerbed.length - 1) || (flowerbed[i+1] == 0))){

                flowerbed[i] = 1;
                n--;
            }
        }

        return n <= 0;
    }

}
