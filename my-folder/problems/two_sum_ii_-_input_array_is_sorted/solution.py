class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:
        
        l={}
        h=len(numbers)-1
        
        for i in range(len(numbers)):
            if target-numbers[i] in l:
                return [numbers.index(target-numbers[i])+1,i+1]
            else:
                l[numbers[i]]=i
        # return [-1,-1]
        