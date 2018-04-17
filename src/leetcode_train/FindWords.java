package leetcode_train;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by EVERCX on 2018/4/13.
 *
 * https://leetcode.com/problems/keyboard-row/description/
 */
public class FindWords {

    public String[] findWords(String[] words) {

        String line1 = "qwertyuiopQWERTYUIOP";
        String line2 = "asdfghjklASDFGHJKL";
        String line3 = "zxcvbnmZXCVBNM";
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,line1);map.put(2,line2);map.put(3,line3);

        ArrayList<String> list = new ArrayList<>();

        int line = -1;
        for(int i = 0; i < words.length;i++){

            if(line1.indexOf(words[i].charAt(0)) != -1) line = 1;
            if(line2.indexOf(words[i].charAt(0)) != -1) line = 2;
            if(line3.indexOf(words[i].charAt(0)) != -1) line = 3;

            int letterPostion = line;
            for(int j = 1;j < words[i].length();j++){

                if(map.get(line).indexOf(words[i].charAt(j)) == -1){
                    letterPostion = -1;
                    break;
                }
            }

            if(letterPostion == line) list.add(words[i]);
        }

        String[] result = new String[list.size()];
        for(int i = 0;i < list.size();i++) result[i] = list.get(i);

        return result;
    }



    public static void main(String[] args) {

        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        String[] r = new FindWords().findWords(words);
        System.out.println(r[0]+r[1]);

    }


}
