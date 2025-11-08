class Solution:
    def climbStairs(self, n: int) -> int:

        
        a=[0]*n

        
        a[0]=1
        if n==1:
            return 1
        elif n==2:
            return 2
        elif n==3:
            return 3

        a[1]=2
        a[2]=3

        for i in range(3,n):
            a[i]=a[i-1]+a[i-2]
        
        return a[n-1]

        