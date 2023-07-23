class Solution:
    def canJump(self, nums: List[int]) -> bool:

        jumps=0
        maxr=0
        nxtran=0
        if nums[0]==0 and len(nums)==1:
            return True
        
       
        for i in range(len(nums)):

            nxtran=max(nxtran,i+nums[i])


            if i==maxr:
                maxr=nxtran
                jumps+=1
                if maxr>=len(nums)-1:
                    return True

        return False

        j=0
        mj=0
        nj=0

        for i in range(len(nums)):

            nj=max(nj,abs(i-nums[i]))

            if i==mj:
                mj=nj
                j+=1

                if j>=len(nums)-1:
                    return j
        return -1