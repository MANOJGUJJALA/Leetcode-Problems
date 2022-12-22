class Solution:
    def characterReplacement(self, s: str, k: int) -> int:

        x={}
        z=0
        m=0
        res=0
        for i in range(len(s)):

            if s[i] in x:
                x[s[i]]+=1
            else:
                x[s[i]]=1
            m=max(m,x[s[i]])
            windowlen=i-z+1
            if windowlen-m >k:
                
                x[s[z]]-=1
                z+=1
            res=max(res,i-z+1)
        return res


