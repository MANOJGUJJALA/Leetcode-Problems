class Solution:
    def minOperations(self, nums: List[int]) -> int:

        # nums.sort()
        c=0

        for i in range(1,len(nums)):

            if nums[i-1]>=nums[i] :

                dif=abs(nums[i-1]-nums[i])+1
                c=c+dif
                nums[i]=nums[i]+dif
        return c



        