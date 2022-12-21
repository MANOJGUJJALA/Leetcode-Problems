class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:

        se=set()

        z=0
        m=0
        c=0
        for i in range(len(s)):

            if s[i] not in se:
                se.add(s[i])
                # c+=1
                m=max(m,len(se))
            else:
                while s[i] in se:
                    se.remove(s[z])
                    z+=1
                se.add(s[i])
                m=max(m,len(se))
        return m
