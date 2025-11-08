class Solution:
    def jump(self, nums: List[int]) -> int:

        jumps=0
        maxr=0
        nxtran=0
        if nums[0]==0 or len(nums)==1:
            return 0
        for i in range(len(nums)):

            nxtran=max(nxtran,i+nums[i])


            if i==maxr:
                maxr=nxtran
                jumps+=1
                if maxr>=len(nums)-1:
                    return jumps

        return jumps