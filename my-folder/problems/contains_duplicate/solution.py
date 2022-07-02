class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        k={}
        for i in nums:
            if i in k:
                k[i]+=1
            else:
                k[i]=1
        # print(k)
        for key,val in k.items():
            if val!=1:
                return True
        return False