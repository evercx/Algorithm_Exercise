package leetcode_train;

/**
 * Created by EVERCX on 2018/3/22.
 */
public class CanWinNim {

    public boolean canWinNim(int n) {

        int turn = 0;

        if (n <= 3) return true;

        while(n > 3){
            n = n - 4;
            turn ++;
        }

        if( n == 0) return false;
        else return true;

    }

/*    public boolean canWinNim(int n) {

        boolean result;

        result = n % 4 == 0 ? false:true;

        return result;

    }*/



    public static void main(String[] args) {

        boolean f  = new CanWinNim().canWinNim(8);



    }
}
