class Solution:
    def isPalindrome(self, s: str) -> bool:

        k=""

        for i in s:
            if i.isalpha() :
                k+=i.upper()
            elif i.isdigit():
                k+=str(i)
        return k==k[::-1]