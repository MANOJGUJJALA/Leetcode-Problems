class Solution:
    def rob(self, nums: List[int]) -> int:

        removeZeroElement=nums[1:]
        removelastElement=nums[:-1]
        n=len(nums)
        if n==1:
            return nums[0]
        elif n==2:
            return max(nums[0],nums[1] )
        dp1=[0]*(n-1)
        dp2=[0]*(n-1)

        dp1[0]=removeZeroElement[0]
        dp1[1]=max(removeZeroElement[0],removeZeroElement[1])

        dp2[0]=removelastElement[0]
        dp2[1]=max(removelastElement[0],removelastElement[1])

        for i in range(2,len(removeZeroElement)):
            dp1[i]=max(dp1[i-1],removeZeroElement[i]+dp1[i-2])
        
        for i in range(2,len(removelastElement)):
            dp2[i]=max(dp2[i-1],removelastElement[i]+dp2[i-2])
        
        return max(dp1[-1],dp2[-1])