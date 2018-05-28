# https://leetcode.com/problems/minesweeper/description/


class Solution:

    visit = []
    def updateBoard(self, board, click):

        """
        :type board: List[List[str]]
        :type click: List[int]
        :rtype: List[List[str]]
        """


        # 构建一个与原二维数组一样大小的二维数组用于存放遍历状态
        for i in range(len(board)):
            self.visit.append([])
            for j in range(len(board[i])):
                self.visit[i] += [False]

        x = click[0]
        y = click[1]

        self.dfs(board,x,y)

        return board


    def dfs(self,board,x,y):


        offset_x = [-1,-1,-1,0,1,1, 1, 0]
        offset_y = [-1, 0, 1,1,1,0,-1,-1]

        if board[x][y] == "M":
            board[x][y] = "X"
            return board

        if board[x][y] != "E":
            return

        mine_number = 0

        # 计算该方格的四周的地雷数量
        for i in range(8):
            row = x + offset_x[i]
            col = y + offset_y[i]

            # 越界情况不管
            if row < 0 or row >= len(board) or col < 0 or col >= len(board[0]):
                continue

            if board[row][col] == "M":
                mine_number += 1


        if mine_number > 0:
            board[x][y] = str(mine_number)
        else:
            # 周边都没有地雷的情况，继续遍历周边的方格
            board[x][y] = "B"
            self.visit[x][y] = True

            for i in range(8):
                row = x + offset_x[i]
                col = y + offset_y[i]

                # 越界情况和已被访问过的方格不管
                if row < 0 or row >= len(board) or col < 0 or col >= len(board[0]) or self.visit[row][col]:
                    continue

                self.dfs(board,row,col)




board = [["E","E","E","E","E","E","E","E"],
         ["E","E","E","E","E","E","E","M"],
         ["E","E","M","E","E","E","E","E"],
         ["M","E","E","E","E","E","E","E"],
         ["E","E","E","E","E","E","E","E"],
         ["E","E","E","E","E","E","E","E"],
         ["E","E","E","E","E","E","E","E"],
         ["E","E","M","M","E","E","E","E"]]


output = [["B","B","B","B","E","E","E","E"],
          ["E","1","1","1","E","E","E","M"],
          ["E","E","M","E","E","E","E","E"],
          ["M","E","E","E","E","E","E","E"],
          ["E","E","E","E","E","E","E","E"],
          ["E","E","E","E","E","E","E","E"],
          ["E","E","E","E","E","E","E","E"],
          ["E","E","M","M","E","E","E","E"]]

expect = [["B","B","B","B","B","B","1","E"],
          ["B","1","1","1","B","B","1","M"],
          ["1","2","M","1","B","B","1","1"],
          ["M","2","1","1","B","B","B","B"],
          ["1","1","B","B","B","B","B","B"],
          ["B","B","B","B","B","B","B","B"],
          ["B","1","2","2","1","B","B","B"],
          ["B","1","M","M","1","B","B","B"]]


r = Solution().updateBoard(board2,[5,5])

for i in range(len(r)):
    print(r[i])