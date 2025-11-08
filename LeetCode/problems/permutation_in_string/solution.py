class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:

        if len(s2)<len(s1):
            return False


        p={}
        q={}

        for i in s1:
            if i in p:
                p[i]+=1
            else:
                p[i]=1
        
        for i in range(len(s1)):
            if s2[i] in q:
                q[s2[i]]+=1
            else:
                q[s2[i]]=1
        
        if p==q:
            return True
        z=0
        for i in range(len(s1),len(s2)):
            q[s2[z]]-=1
            if q[s2[z]]<=0:
                q.pop(s2[z])
            z+=1
            if s2[i] in q:
                q[s2[i]]+=1
            else:
                q[s2[i]]=1
            if p==q:
                return True
        return False

