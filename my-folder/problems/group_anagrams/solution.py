class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        r=[]
        a=defaultdict(list)
        
        for i in range(len(strs)):
            
            r=[0]*26
            for j in strs[i]:
                r[ord(j)-ord('a')]+=1
            a[tuple(r)].append(strs[i])
        
       
        return a.values()