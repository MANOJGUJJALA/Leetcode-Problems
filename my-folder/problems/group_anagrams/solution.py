from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        x=defaultdict(list)

        for i in range(len(strs)):
            k=strs[i]
            a=[0]*26
            for j in range(len(k)):
                a[ord(k[j])-ord('a')]+=1
            x[tuple(a)].append(k)
        r=[]

        for k,v in x.items():
            r.append(v)
        
        return r

