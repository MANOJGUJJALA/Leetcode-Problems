class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        x={}

        for i in range(len(nums)):
            if target-nums[i] in x:
                return [i,x[target-nums[i]]]
            else:
                x[nums[i]]=i
