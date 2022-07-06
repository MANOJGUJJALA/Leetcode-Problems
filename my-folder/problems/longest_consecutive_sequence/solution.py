class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        nums=set(nums)
        ma=0
        for i in nums:
             if i-1 not in nums:
                    k=i
                    p=1
                    while k+1 in nums:
                        k+=1
                        p+=1
                    ma=max(ma,p)
        return ma
       
        