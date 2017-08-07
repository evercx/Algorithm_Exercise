package Easy;

/*
* https://leetcode.com/problems/max-consecutive-ones/description/
*
* */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] nums, int r, int c) {

        int originalR = nums.length;    //原矩阵的行数
        int originalC = nums[0].length; // 原矩阵的列数

        // 如果给定的参数不能拼成新矩阵 就返回原矩阵
        if(originalR * originalC != r *c){
            return nums;
        }

        int[][] resultNums = new int[r][c];
        int[] tempArray = new int[originalR*originalC];
        int k = 0;

        // 定义一个一维数组存储原矩阵的所有元素
        for(int i = 0; i<originalR;i++){
             for( int j = 0; j<originalC;j++){
                 tempArray[k++] = nums[i][j];
             }
        }
        k = 0;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                resultNums[i][j] = tempArray[k++];
            }
        }

        return resultNums;
    }



    //参考答案
/*    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int count = 0;
        Queue < Integer > queue = new LinkedList < > ();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                queue.add(nums[i][j]);
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = queue.remove();
            }
        }
        return res;
    }*/

    // 解法二  不用另外的空间 直接在双层循环里赋值给新矩阵
/*    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int[][] res = new int[r][c];
        if (nums.length == 0 || r * c != nums.length * nums[0].length)
            return nums;
        int rows = 0, cols = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                res[rows][cols] = nums[i][j];
                cols++;
                if (cols == c) {
                    rows++;
                    cols = 0;
                }
            }
        }
        return res;
    }*/
}
