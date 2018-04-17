package leetcode_train;
import java.util.*;
/**
 * Created by EVERCX on 2018/4/11.
 *
 * https://leetcode.com/problems/partition-labels/description/
 *
 * https://blog.csdn.net/u012737193/article/details/79099153
 */
public class PartitionLabels {

    // 遍历从左往右的字母中,寻找他们在S中最右端的索引位置i,如果从最左到i中的字母有一个字母最右边的索引在i的右边,就把i更新为这个索引
    // 直到从左到i的字母都遍历过了一遍,就取0-i是一个最小分组

    public List<Integer> partitionLabels(String S) {

        int[] letterInRight = new int[26];
        List<Integer> resultList = new ArrayList<Integer>();

        // 记录S中每个字母最后一次出现的索引位子。
        for(int i = 0; i < S.length(); i++){
            letterInRight[S.charAt(i) - 'a'] = i;
        }

        int start = 0,end = S.length();
        while(start < end){

            int leftSubStrIndex = getSubString(S,start,end,letterInRight);
            int subStrSize = leftSubStrIndex - start + 1;
            resultList.add(subStrSize);
            start += subStrSize;
        }

        return resultList;

    }

    public int getSubString(String S,int start,int end,int[] letterInRight){

        int left = start;
        int right = letterInRight[S.charAt(start) - 'a'];

        for(int i = left;i < right; i++){
            if( letterInRight[S.charAt(i) - 'a'] > right){
                right = letterInRight[S.charAt(i) - 'a'];
            }
        }

        return right;

    }


    public static void main(String[] args) {

        String S = "ababcbacadefegdehijhklij";

        List<Integer> resultList = new PartitionLabels().partitionLabels(S);

        System.out.print(resultList);


    }
}
