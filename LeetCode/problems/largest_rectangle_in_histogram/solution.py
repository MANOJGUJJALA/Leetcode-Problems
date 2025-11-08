class Solution:
    def largestRectangleArea(self, a: List[int]) -> int:

        st=[]
        l,r=[],[]

        for i in range(len(a)):

            while len(st)>0 and a[st[-1]] >=a[i]:
                st.pop()

            if len(st)<=0:
                l.append(-1)
            else:
                l.append(st[-1])
            st.append(i)
        st=[]

        for i in range(len(a)-1,-1,-1):
            while len(st)>0 and a[st[-1]]>=a[i]:
                st.pop()
            if len(st)<=0:
                r.append(len(a))
            else:
                r.append(st[-1])
            st.append(i)
        r=r[::-1]
        import sys
        m=-sys.maxsize
        for i in range(len(a)):
            m=max(m,(r[i]-l[i]-1)*(a[i]))
        return m