class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        ma=0
        for i in range(len(s)):
            s1=""
            a=[]
            for j in range(i,len(s)):
                s1=s1+s[j]
                if  s1.count(s[j])>1:
                    s1=""
                    break
                else:
                    if len(s1)>=ma:
                         ma=len(s1)
                             
        return ma