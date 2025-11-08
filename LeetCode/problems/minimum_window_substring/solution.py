class Solution:
    def minWindow(self, s: str, t: str) -> str:

        window,tcount={},{}
        if t =="":
            return ""
        for i in t:
            if i in tcount:
                tcount[i]+=1
            else:
                tcount[i]=1
        have,need=0,len(tcount)
        l=0
        import sys
        reslen=sys.maxsize
        res=[-1,-1]
        for r in range(len(s)):

            c=s[r]
            if c in window:
                window[c]+=1
            else:
                window[c]=1
            if c in tcount and window[c] == tcount[c]:
                have+=1
            
            while have==need:
                if r-l+1 < reslen:
                    reslen=(r-l+1)
                    res=[l,r]
                window[s[l]]-=1

                if s[l] in tcount and window[s[l]] < tcount[s[l]]:
                    have-=1
                l+=1
        if reslen==sys.maxsize:
            return ""
        return s[res[0]:res[1]+1]



