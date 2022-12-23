class Solution:
    def dailyTemperatures(self, a: List[int]) -> List[int]:


        st=[]
        r=[]
        a=a[::-1]
        for i in range(len(a)):

            while len(st)>0 and a[st[-1]] <= a[i]:
                st.pop(-1)


            if len(st)<=0:
                r.append(0)
            else:
                r.append(i-st[-1])
            st.append(i)
        r=r[::-1]
        return r

