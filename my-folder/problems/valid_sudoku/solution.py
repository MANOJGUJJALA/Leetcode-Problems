class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        
        r=collections.defaultdict(set)
        c=collections.defaultdict(set)
        s=collections.defaultdict(set)
        for i in range(9):
            for j in range(9):
                if board[i][j]==".":
                    continue
                else:
                    if board[i][j] in r[i] or board[i][j] in c[j] or board[i][j] in s[(i//3,j//3)]:
                        return False
                    
                    r[i].add(board[i][j])
                    c[j].add(board[i][j])
                    s[(i//3,j//3)].add(board[i][j])
        return True
        