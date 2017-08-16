package Easy.HashTable;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by EVERCX on 2017/8/15.
 *
 * https://leetcode.com/problems/keyboard-row/description/
 */
public class FindWords {

    public String[] findWords(String[] words) {

        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"qwertyuiopQWERTYUIOP");
        map.put(2,"asdfghjklASDFGHJKL");
        map.put(3,"zxcvbnmZXCVBNM");

        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0;i<words.length;i++){

            int flag = 0;

            if(map.get(1).indexOf(words[i].charAt(0)) != -1) flag = 1;
            if(map.get(2).indexOf(words[i].charAt(0)) != -1) flag = 2;
            if(map.get(3).indexOf(words[i].charAt(0)) != -1) flag = 3;

            int loc = flag;

            for(int j = 1;j< words[i].length();j++){

                if(map.get(flag).indexOf(words[i].charAt(j)) == -1) {
                    loc = 0;
                    break;
                }
            }

            if( flag == loc) list.add(words[i]);
        }

        String[] result = new String[list.size()];

        for(int i = 0; i<list.size();i++) result[i] = list.get(i);

        return result;

    }

    public static void main(String[] args){
        FindWords fw = new FindWords();
        fw.findWords(new String[]{"a","b"});
    }
}
