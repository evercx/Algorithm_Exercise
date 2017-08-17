package Easy.HashTable;

import java.util.HashMap;

/**
 * Created by EVERCX on 2017/8/17.
 *
 * https://leetcode.com/problems/valid-anagram/description/
 */
public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        if (s.length() != t.length()) return false;

        for(int i = 0;i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int number = map.get(s.charAt(i));
                number++;
                map.put(s.charAt(i),number);
            }else{
                map.put(s.charAt(i),1);
            }
        }

        for(int i = 0;i < t.length();i++){
            if(map.containsKey(t.charAt(i))){
                int number = map.get(t.charAt(i));
                if(number < 1) return false;
                number--;
                map.put(t.charAt(i),number);
            }else{
                return false;
            }
        }

        return true;

    }
}
