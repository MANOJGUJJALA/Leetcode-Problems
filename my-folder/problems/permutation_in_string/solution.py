class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        # s1=list(set(list(s1)))
        # s2=list(set(list(s2)))
        # print("--",s1,s2)
        c=0
        a=[0]*26
        a=[0]*26
        p={}
        q={}
        if len(s2)<len(s1):
            return False
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
        
        h=0
        # print("--",p,q)
        
        for i in range(len(s1),len(s2)):
            
            q[s2[h]]-=1
            if q[s2[h]]==0:
                q.pop(s2[h])
            if s2[i] in q:
                q[s2[i]]+=1
            else:
                q[s2[i]]=1
            if p==q:
                return True
            h+=1
   
        # print("--",q)
        return False