class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # nums.sort()
        l={}
        h=len(nums)-1
        for i in range(len(nums)):
            if target-nums[i] in l:
                return [i,l[target-nums[i] ]]
            else:
                l[nums[i]]=i
        return [-1,-1]
        
        
        