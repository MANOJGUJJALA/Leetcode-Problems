import math
class Solution:

    def check(self,k,h,piles):
        c=0
        for i in range(len(piles)):
            c+=math.ceil(piles[i]/k)
        return c


    def minEatingSpeed(self, piles: List[int], h: int) -> int:

        l=1
        r=max(piles)
        
        while l<=r:
            m=(l+r)//2
            hrs=self.check(m,h,piles)
            if(hrs<=h):
                
                r=m-1
            else :
                l=m+1
            
        
        return l
        