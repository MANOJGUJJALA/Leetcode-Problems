class Solution:
    def lengthOfLongestSubstring(self, A: str) -> int:

        
        m = 0
        se = set()

        i = 0
        j = 0
       
        while j<len(A):
            
            if A[j] not in se:
                se.add(A[j])
                j +=1
                m = max(m,len(se))
            else: 
                se.remove(A[i])
                i +=1
       
        return m


        