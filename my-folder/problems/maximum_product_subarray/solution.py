
class Solution:
    def maxProduct(self, nums: List[int]) -> int:

        ma=1
        mi=1
        s=max(nums)
        for i in nums:
            temp=ma*i
            ma=max(temp,i*mi,i)

            mi=min(temp,i*mi,i)

            s=max(s,ma)
            
        return s
        