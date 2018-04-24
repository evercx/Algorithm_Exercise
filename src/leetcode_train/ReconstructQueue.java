package leetcode_train;

/*
* https://leetcode.com/problems/queue-reconstruction-by-height/description/
*
*
* */

import java.util.ArrayList;
import java.util.List;

public class ReconstructQueue {

    public int[][] reconstructQueue(int[][] people) {

        int[][] result = new int[people.length][2];
        List<Integer> arraylist = new ArrayList<>();

        // 按元素第一索引降序排序，当第一索引相等时，第二索引小的排前面
        for(int i = 0;i < people.length;i++){
            for(int j = people.length-1; j>= i+1;j--){
                if(people[j][0] > people[j-1][0]){
                    int temp = people[j][0];
                    people[j][0] = people[j-1][0];
                    people[j-1][0] = temp;
                    temp = people[j][1];
                    people[j][1] = people[j-1][1];
                    people[j-1][1] = temp;
                }
                if(people[j][0] == people[j-1][0] && people[j][1] < people[j-1][1]){
                    int temp = people[j][0];
                    people[j][0] = people[j-1][0];
                    people[j-1][0] = temp;
                    temp = people[j][1];
                    people[j][1] = people[j-1][1];
                    people[j-1][1] = temp;
                }
            }
        }

        for(int i = 0;i < people.length;i++){
            arraylist.add(people[i][1],i);
        }

        for(int i = 0;i < people.length;i++){
            int index = arraylist.get(i);
            result[i][0] = people[index][0];
            result[i][1] = people[index][1];
        }

        return result;

    }


    public static void main(String[] args) {

        int[][] input = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] output = new ReconstructQueue().reconstructQueue(input);

        for(int i = 0;i < output.length;i++){
            System.out.print(output[i][0]+"\t");
            System.out.print(output[i][1]+"\t");
            System.out.println();
        }

    }
}
