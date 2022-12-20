class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        import sys
        m=0
        nums=set(nums)

        for i in nums:
            
            
            if i-1 not in nums:
                c=1
                z=i
                while z+1 in nums:
                    c+=1
                    z+=1
                m=max(m,c)
        return m