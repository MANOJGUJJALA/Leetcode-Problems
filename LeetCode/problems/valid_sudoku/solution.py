from collections import defaultdict
class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:

        r,c=defaultdict(set),defaultdict(set)
        sub=defaultdict(set)

        for i in range(len(board)):
            for j in range(len(board[0])):

                if board[i][j]=='.':
                    continue
                else:
                    if board[i][j] in r[i] or board[i][j] in c[j] or board[i][j] in sub[(i//3,j//3)] :
                        return False
                    r[i].add(board[i][j])
                    c[j].add(board[i][j])

                    sub[(i//3,j//3)].add(board[i][j])
        return True

