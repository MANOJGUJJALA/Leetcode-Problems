class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a=[]
        f=0
        for i in range(len(nums)):
            for j in range(i+1,len(nums)):
                if nums[i]+nums[j]==target:
                    f=1
                    a.append(i)
                    a.append(j)
                    break
            if f==1:
                break
                
        return(a)
         