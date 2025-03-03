class Solution:

    # lenght of sub string
    def loss(self,s,left,right):

        while left >=0 and right <len(s) and s[left]==s[right]:
            left-=1
            right+=1
        return [left,right]

    def longestPalindrome(self, s: str) -> str:
        st,end=0,0
        res=0
        ress=""
        for i in range(len(s)):
            k=self.loss(s,i,i)
            if k[1]-k[0]-1>res:
                res=k[1]-k[0]-1
                ress=s[k[0]+1:k[1]]
        
        for i in range(len(s)):
            k=self.loss(s,i,i+1)
            if k[1]-k[0]-1>res:
                res=k[1]-k[0]-1
                ress=s[k[0]+1:k[1]]
        return ress





        