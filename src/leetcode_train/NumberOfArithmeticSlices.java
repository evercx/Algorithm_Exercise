package leetcode_train;


/*
*
*  https://leetcode.com/problems/arithmetic-slices/description/
*
* */
public class NumberOfArithmeticSlices {

    public int numberOfArithmeticSlices(int[] A) {

        int result = 0;
        int increase = 1;

        for(int i = 2;i < A.length;i++){

            if( (A[i] - A[i-1]) == (A[i-1] - A[i-2]) ){
                result += increase;
                increase++;
            }else {
                increase = 1;
            }

        }
        return result;

    }


    public static void main(String[] args) {

        int[] A = {1,2,3,4};
        int[] B = {1,2,3,8,9,10};
        int result = new NumberOfArithmeticSlices().numberOfArithmeticSlices(B);

        System.out.println(result);

    }
}
