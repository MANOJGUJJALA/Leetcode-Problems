class Solution:
    def trap(self, height: List[int]) -> int:
        n=len(height)
        
        l=[0]*n
        r=[0]*n
        
        l[0]=height[0] 
        
        for i in range(1,n):
            l[i]=max(l[i-1],height[i])
        
        r[n-1]=height[n-1]
        
        for i in range(n-2,-1,-1):
            r[i]=max(height[i],r[i+1])
        
        s=0
        
        for i in range(n):
            s+=(min(r[i],l[i]))-height[i]
        
        return s
    
        