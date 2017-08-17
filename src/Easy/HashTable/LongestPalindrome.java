package Easy.HashTable;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by EVERCX on 2017/8/17.
 *
 * https://leetcode.com/problems/longest-palindrome/description/
 */
public class LongestPalindrome {

    /*
    * 由于字符顺序可以打乱，所以问题就转化为了求偶数个字符的个数
    * 统计出来所有偶数个字符的出现总和，然后如果有奇数个字符的话，我们取取出其最大偶数，然后最后结果加1即可
    * */
    public int longestPalindrome(String s) {
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int sum = 0;
        boolean hasOdd = false;

        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int v = map.get(s.charAt(i));
                v++;
                map.put(s.charAt(i),v);
            }else map.put(s.charAt(i),1);
        }

        for (Map.Entry<Character,Integer> item : map.entrySet()){
            if (item.getValue() % 2 ==0){
                sum += item.getValue();
            }else{
                sum += item.getValue() - 1 ;
                hasOdd = true;
            }

        }

        if(hasOdd) return sum + 1;
        else return sum;

    }
}
