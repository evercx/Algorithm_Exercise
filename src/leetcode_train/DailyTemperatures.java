package leetcode_train;

import java.util.HashMap;

/**
 * Created by EVERCX on 2018/4/23.
 *
 *
 */
public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        int[] resultList = new int[temperatures.length];

        for(int i = 0; i < resultList.length; i++){

            int count = 0;
            boolean flag = false;

            for(int j = i+1; j < resultList.length;j++){
                count++;
                if(temperatures[j] > temperatures[i]){
                    flag = true;
                    resultList[i] = count;
                    break;
                }
            }
            if(!flag) count = 0;
            resultList[i] = count;

        }
        return resultList;
    }

    public static void main(String[] args) {

        int[] temperatures = {73,74,75,71,69,72,76,73};

        int[] Result = new DailyTemperatures().dailyTemperatures(temperatures);

        for(int i = 0; i < Result.length; i++)
        System.out.println(Result[i]);

    }
}
