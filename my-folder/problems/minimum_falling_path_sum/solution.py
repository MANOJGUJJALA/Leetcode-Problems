class Solution:
    def minFallingPathSum(self, matrix: List[List[int]]) -> int:

        m=len(matrix)
        n=len(matrix[0])

        for i in range(m-2,-1,-1):
            for j in range(n):
                l,r,m=matrix[i+1][0],matrix[i+1][n-1],0
                if j>0:
                    l=matrix[i+1][j-1]
                if j<n-1:
                    r=matrix[i+1][j+1]

                matrix[i][j]+=min( l,matrix[i+1][j], r)
        import sys

        ans=sys.maxsize

        for i in range(n):
            ans=min(ans,matrix[0][i])
        
        return ans

        