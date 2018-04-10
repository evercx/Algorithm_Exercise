package leetcode_train;

/**
 * Created by EVERCX on 2018/4/9.
 *
 * https://leetcode.com/problems/max-increase-to-keep-city-skyline/description/
 */
public class MaxIncreaseKeepingSkyline {

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int result = 0;
        // int[][] resultGrid = new int[grid.length][grid.length];
        int[] maxArray = new int[2*grid.length];
        for(int i = 0;i<maxArray.length;i++) maxArray[i] = Integer.MIN_VALUE;

        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid.length;j++){
                maxArray[i] = Math.max(maxArray[i],grid[i][j]);
                maxArray[i+grid.length] = Math.max(maxArray[i+grid.length],grid[j][i]);
            }
        }

        for(int i = 0;i < grid.length;i++){
            for(int j = 0;j < grid.length;j++){
                int smallerNumber = Math.min(maxArray[i],maxArray[grid.length+j]);
                if(grid[i][j] <= smallerNumber) result += (smallerNumber - grid[i][j]);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] grid = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        int result = new MaxIncreaseKeepingSkyline().maxIncreaseKeepingSkyline(grid);
        System.out.print(result);
    }
}
