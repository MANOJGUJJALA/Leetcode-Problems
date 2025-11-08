class Solution:
    def twoSum(self, numbers: List[int], target: int) -> List[int]:

        x={}

        for i in range(len(numbers)):
            if target- numbers[i] in x:
                return [x[target-numbers[i]]+1,i+1]
            else:
                x[numbers[i]]=i