package leetcode_train;

import java.util.List;

/**
 * Created by EVERCX on 2018/4/17.
 *
 * https://leetcode.com/problemset/all/?search=647
 *
 * https://blog.csdn.net/mebiuw/article/details/76557629
 */
public class CountSubstrings {


    public int countSubstrings(String s) {

        int result = 0;
        if(s == null) return 0;

        for(int i = 0;i < s.length();i++){

            result += helpFunc(s,i,i);  //奇数个
            result += helpFunc(s,i,i+1);    //偶数个
        }

        return result;
    }

    public int helpFunc(String s,int start,int end){
        int res = 0;

        while(start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)){

            res++;
            start--;
            end++;
        }

        return res;
    }


    public static void main(String[] args) {

        String s = "aaa";
        int r = new CountSubstrings().countSubstrings(s);
        System.out.println(r);

    }
}
