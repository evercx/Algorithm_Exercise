package leetcode_train;
import java.util.*;

/**
 * Created by EVERCX on 2018/4/11.
 *
 * https://leetcode.com/problems/self-dividing-numbers/description/
 */
public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {

        // 取某数字的个位数 如128取8: 128 % 10
        // 取某数字除了个位数的其他数 如128取12: 128 / 10
        List<Integer> resultList = new ArrayList<Integer>();

        for(int i = left;i <= right; i++){

            int a = i,k = 1;
            boolean flag = true;
            while(a != 0){

                int r = a % 10;

                if(r == 0 || i % r != 0){
                    flag = false;
                    break;
                }
                a = a / 10;
            }

            if(flag) resultList.add(i);
        }

        return resultList;

    }

    public static void main(String[] args) {

        int left = 1;
        int right = 22;

        List<Integer> l = new SelfDividingNumbers().selfDividingNumbers(left,right);
        System.out.print(l);


    }
}
