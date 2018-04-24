package leetcode_train;

/**
 * Created by EVERCX on 2018/4/19.
 *
 * https://leetcode.com/problems/custom-sort-string/description/
 *
 */
public class CustomSortString {

    public String customSortString(String S, String T) {
        char[] char_array = T.toCharArray();

        for(int i = 0;i < char_array.length;i++){

            int min = i;

            for(int j = i+1;j < char_array.length;j++){
                if( S.indexOf(char_array[j]) < S.indexOf(char_array[min])) min = j;
            }

            char temp = char_array[i];
            char_array[i] = char_array[min];
            char_array[min] = temp;
        }

        return String.valueOf(char_array);
    }



    public static void main(String[] args) {

        String S = "cba";
        String T = "abcd";

        String Result = new CustomSortString().customSortString(S,T);

        System.out.println(Result);

    }
}
