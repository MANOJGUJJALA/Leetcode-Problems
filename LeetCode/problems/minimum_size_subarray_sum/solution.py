class Solution:

    def su(self,a,l,t):

        s=0

        for i in range(l):
            s+=a[i]
        
        if s>=t:
            return True
        z=0
        for i in range(l,len(a)):
            s-=a[z]
            z+=1
            s+=a[i]
            if s>=t:
                return True
        return False

    def minSubArrayLen(self, target: int, nums: List[int]) -> int:

        l,r=1,len(nums)
        ans=0

        while l<=r:

            mid=(l+r)//2

            if self.su(nums,mid,target):
                ans=mid
                r=mid-1
            else:
                l=mid+1
        return ans