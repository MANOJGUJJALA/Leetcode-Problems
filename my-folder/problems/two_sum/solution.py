class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        a={}
        
        for i in range(len(nums)):
            if target-nums[i] in a:
                return [nums.index(target-nums[i]),i]
            else:
                a[nums[i]]=i
        return [-1,-1]