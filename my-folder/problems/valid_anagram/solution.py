class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        k={}
        for i in s:
            if i in k:
                k[i]+=1
            else:
                k[i]=1
        f={}
        for i in t:
            if i in f:
                f[i]+=1
            else:
                f[i]=1
       
        if f==k:
            return True
        else:
            return False
            