package leetcode_train;

import java.util.HashMap;

/**
 * Created by EVERCX on 2018/4/10.
 *
 * https://leetcode.com/problems/unique-morse-code-words/description/
 */
public class UniqueMorseRepresentations {

    public int uniqueMorseRepresentations(String[] words) {

        String[] MorseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        HashMap<String,Integer> transformationsOfEachWord = new HashMap<String,Integer>();

        for(int i = 0;i < words.length;i++){
            String transformation = "";
            for(int j = 0;j<words[i].length();j++){
                int indexOfMorseCode = alphabet.indexOf(words[i].charAt(j));
                transformation += MorseCode[indexOfMorseCode];
            }
            transformationsOfEachWord.put(transformation,1);
        }

        return transformationsOfEachWord.size();
    }



    public static void main(String[] args) {

        String[] words = {"gin","zen","gig","msg"};

        int result = new UniqueMorseRepresentations().uniqueMorseRepresentations(words);
        System.out.print(result);

    }
}
