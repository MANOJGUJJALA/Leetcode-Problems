class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        s=[0]*len(prices)
        n=len(prices)
        s[n-1]=prices[n-1]
        for i in range(n-2,-1,-1):
            s[i]=max(prices[i],s[i+1])
        
        r=0
        # print("--",s)
        for i in range(n-1):
            if prices[i]!=s[i]:
                r=max(r,abs(s[i]-prices[i]))
        
        return r




