package leetcode_train;

import java.util.HashMap;

/**
 * Created by EVERCX on 2018/3/29.
 *
 * https://leetcode-cn.com/problems/jewels-and-stones/description/
 */
public class NumJewelsInStones {

    public int numJewelsInStones(String J, String S) {
        int numbers = 0;
        HashMap map = new HashMap();
        char[] jArray =  J.toCharArray();
        char[] SArray =  S.toCharArray();
        for(int i = 0; i < jArray.length;i++){
            map.put(jArray[i],1);
        }
        for(int i = 0; i < SArray.length;i++){
            if(map.containsKey(SArray[i])){
                numbers++;
            }
        }

        return numbers;

    }

    public static void main(String[] args) {

        String J = "aA";
        String S = "aAAbbbb";

        int numbers = new NumJewelsInStones().numJewelsInStones(J,S);

        System.out.println(numbers);


    }
}
