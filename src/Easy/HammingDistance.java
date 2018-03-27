package Easy;

/**
 * Created by EVERCX on 2017/12/4.
 */
public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int count = 0;

        int xor = x ^ y;

        while(xor != 0){
            count++;
            xor = xor & (xor - 1);
        }

        return count;

    }
}
