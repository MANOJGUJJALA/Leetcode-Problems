class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        
        
        r=0
        s=0
        for i in range(1,len(prices)):
            if prices[i]<prices[s]:
                s=i
            
            r=max(r,-prices[s]+prices[i])
        return r