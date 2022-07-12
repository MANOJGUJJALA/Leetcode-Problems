class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        
        c=0
        nums=set(nums)
        for i in nums:
            if i-1 not in nums:
                l=1
                k=i
                while k+1 in nums:
                    l+=1
                    k+=1
                c=max(l,c)
        return c
      
        