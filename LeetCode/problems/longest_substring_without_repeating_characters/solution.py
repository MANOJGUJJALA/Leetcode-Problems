class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        
        n = len(s)
        maxLength = 0
        charMap = {}
        left = 0
        
        for i in range(n):
            if s[i] not in charMap or charMap[s[i]] < left:
                charMap[s[i]] = i
                maxLength = max(maxLength, i - left + 1)
            else:
                left = charMap[s[i]] + 1
                charMap[s[i]] = i
        
        return maxLength





        