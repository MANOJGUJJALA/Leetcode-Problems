import sys
class Solution:
    def maxProfit(self, prices: List[int]) -> int:


        profit=0
        st=[]
        c=-sys.maxsize
        ma=-1
        for i in range(len(prices)):
            if len(st)==0:
                st.append(prices[i])
            
            elif prices[i]<st[-1]:
                st.pop()
                st.append(prices[i])
            
            elif st[-1] <prices[i]:
                c=max(c,abs(prices[i]-st[-1]))
                # print("--",c)

                if i+1<len(prices) and (prices[i+1] <prices[i]) :
                    profit=profit+c
                    c=-sys.maxsize

                    st.pop()
                if i+1==len(prices):
                    profit=profit+abs(prices[i]-st[-1])
            
        return profit



        # mi=sys.maxsize
        # profit=0
        #     if(prices[i] <mi):
        #         mi=prices[i]
        #     if(prices[i]>mi):
        #         mi=sys.maxsize
        


        