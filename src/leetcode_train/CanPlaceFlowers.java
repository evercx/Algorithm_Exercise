package leetcode_train;

/**
 * Created by EVERCX on 2018/4/12.
 *
 * https://leetcode.com/problems/can-place-flowers/description/
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i = 0;i < flowerbed.length;i++){

            if(flowerbed[i] == 0 && ( i == 0 || flowerbed[i-1] == 0) && (i == flowerbed.length - 1 || flowerbed[i+1] == 0) ){
                flowerbed[i] = 1;
                n--;
                if(n == 0) return true;
            }

        }


        if (n > 0) return false;
        else return true;
    }


    public static void main(String[] args) {

        int[] flowerbed = {1,0,0,0,1};

        int n = 2;

        boolean res = new CanPlaceFlowers().canPlaceFlowers(flowerbed,n);

        System.out.print(res);



    }
}
