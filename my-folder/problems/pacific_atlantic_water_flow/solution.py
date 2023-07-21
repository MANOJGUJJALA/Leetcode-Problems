class Solution:
    from collections import deque
    def check(self,i,j,m,n,a,val):

        if i>=0 and j>=0 and i<m and j<n and a[i][j]>=val:
            
            
            return True
        return False
            


    def pacificAtlantic(self, ht: List[List[int]]) -> List[List[int]]:


        q=deque()
        m,n=len(ht),len(ht[0])
        x=[1,-1,0,0]
        y=[0,0,-1,1]

        p=[[0 for j in range(n)] for i in range(m)]
        at=[[0 for j in range(n)] for i in range(m)]
        vis=[[0 for j in range(n)] for i in range(m)]
        visi=[[0 for j in range(n)] for i in range(m)]

        for i in range(m):
            for j in range(n):
                if i==0:
                    p[0][j]=1
                    q.append([i,j])
                if j==0:
                    p[i][j]=1
                    q.append([i,j])
                
        
        while q:

            k=q.popleft()

            u,v=k[0],k[1]

            if vis[u][v]==0:
                vis[u][v]=1

                for z in range(4):
                    i,j=u+x[z],v+y[z]

                    if self.check(i,j,m,n,ht,ht[u][v]):
                        p[i][j]=1
                    
                        q.append([i,j])
        
        q=deque()
        for i in range(m):
            for j in range(n):

                if i==m-1:
                    at[m-1][j]=1
                    q.append([i,j])
                
                elif j==n-1:
                    at[i][j]=1
                    q.append([i,j])

        while q:

            k=q.popleft()

            u,v=k[0],k[1]

            if visi[u][v]==0:
                visi[u][v]=1

                for z in range(4):
                    i,j=u+x[z],v+y[z]

                    if self.check(i,j,m,n,ht,ht[u][v]):
                        at[i][j]=1
                    
                        q.append([i,j])
        
        res=[]
        for i in range(m):
            for j in range(n):
                if p[i][j]==1 and at[i][j]==1:
                    res.append([i,j])
        
        return res