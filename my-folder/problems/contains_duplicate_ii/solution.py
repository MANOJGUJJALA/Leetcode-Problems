class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:

        x={}

        for i in range(len(nums)):
            c=nums[i]
            if c not in x:
                x[c]=i
            else:
                if abs(x[c]-i)<=k:
                    return True
                x[c]=i
        return False