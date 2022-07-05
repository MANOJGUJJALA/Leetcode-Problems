class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        k=defaultdict(list)
        
        for i in strs:
            c=[0]*26
            for j in i:
                c[ord(j)-ord("a")]+=1
            k[tuple(c)].append(i)
        return k.values()
        