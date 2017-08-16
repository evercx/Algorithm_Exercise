package Easy.HashTable;

/**
 * Created by EVERCX on 2017/8/15.
 *
 * https://leetcode.com/problems/island-perimeter/description/
 */
public class IslandPerimeter {

    public int islandPerimeter(int[][] grid) {

        int count = 0;
        int dulicate = 0;

        for(int i = 0;i < grid.length;i++){
            for (int j = 0;j < grid[i].length;j++){

                if(grid[i][j] == 1){

                    count +=4;

                    if(i != 0){
                        if(grid[i-1][j] == 1) dulicate++;
                    }
                    if(i != grid.length - 1){
                        if(grid[i+1][j] == 1) dulicate++;
                    }
                    if(j != 0){
                        if(grid[i][j-1] == 1) dulicate++;
                    }
                    if(j != grid[i].length - 1){
                        if(grid[i][j+1] == 1) dulicate++;
                    }
                }


            }
        }

        return count - dulicate;

    }

}
