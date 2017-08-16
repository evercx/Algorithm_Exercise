package Easy.HashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by EVERCX on 2017/8/16.
 *
 * https://leetcode.com/problems/find-the-difference/description/
 */
public class FindTheDifference {

    public char findTheDifference(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();

        for(int i = 0; i < s.length();i++){

            if(map.containsKey(s.charAt(i))){

                int value = map.get(s.charAt(i));
                value++;
                map.put(s.charAt(i),value);

            }else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i = 0; i < t.length();i++){

            if(map.containsKey(t.charAt(i))){

                int value = map.get(t.charAt(i));
                value--;
                map.put(t.charAt(i),value);

                if(value < 0) return t.charAt(i);

            }else{
                return t.charAt(i);
            }
        }

        return ' ';

    }
}
