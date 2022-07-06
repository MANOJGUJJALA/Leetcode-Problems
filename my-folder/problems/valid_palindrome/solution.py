class Solution:
    def isPalindrome(self, s: str) -> bool:
        
        s1=""
        
        for i in s:
            
            if i.isdigit():
                s1+=i
            elif i.isalpha():
                s1+=(i.lower())
        # print(s1)
        return s1==s1[::-1]
        
        