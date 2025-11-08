class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        r={}
        re=[]
        for i in nums:
            if i in r:
                r[i]+=1
            else:
                r[i]=1
                
        f=[[] for i in range(len(nums)+1)]
        # print(f)
        
            
            
        for ke,v in r.items():
            f[v].append(ke)
        for i in range(len(f)-1,-1,-1):
            for j in f[i]:
                re.append(j)
                if len(re)==k:
                    return re
                    break
            
        return re
        