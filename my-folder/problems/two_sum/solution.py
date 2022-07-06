class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # nums.sort()
        l={}
        h=len(nums)-1
        
        for i in range(len(nums)):
            if target-nums[i] in l:
                return [nums.index(target-nums[i]),i]
                
            else:
                l[nums[i]]=i
            
        