class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        p=[1]*len(nums)
        n=len(nums)
        s=[1]*n

        for i in range(1,n):
            p[i]=nums[i-1]*p[i-1]
        for i in range(n-2,-1,-1):
            s[i]=s[i+1]*nums[i+1]
        r=[]

        for i in range(n):
            r.append(p[i]*s[i])
        return r