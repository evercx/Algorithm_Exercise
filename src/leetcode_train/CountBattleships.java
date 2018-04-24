package leetcode_train;

/**
 * Created by EVERCX on 2018/4/18.
 *
 * https://leetcode.com/problems/battleships-in-a-board/description/
 */
public class CountBattleships {

    // 当前点为'X'的时候考虑左边和上边至少一个为'.',就把当前点算进去
    public int countBattleships(char[][] board) {

        int result = 0;

        for(int i = 0;i < board.length;i++){
            for(int j = 0;j < board[i].length;j++){

                if(board[i][j] == 'X'){
                    if((i == 0) && (j==0 || board[i][j-1]=='.')) result++;
                    else if((i != 0) && ((j == 0) && board[i-1][j] == '.')) result++;
                    else if((i != 0) && (board[i-1][j] == '.' && board[i][j-1] == '.')) result++;
                }
            }
        }

        return result;

    }


    public static void main(String[] args) {

        char[][] board = {
                {'X','.','.','X'},
                {'.','.','.','X'},
                {'.','.','.','X'},
        };

        char[][] board2 = {
                {'X','X','X'},
        };

        int result = new CountBattleships().countBattleships(board);
        System.out.println(result);

    }
}
