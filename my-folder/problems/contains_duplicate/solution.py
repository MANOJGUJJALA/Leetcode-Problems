class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        
        a={}
        
        for i in nums:
            if i  in a:
                a[i]+=1
            else:
                a[i]=1
        for k,v in a.items():
            if v>=2:
                return True
        return False
                
      
    