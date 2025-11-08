class MinStack:

    def push(self, x):
        self.st.append(x)

        if len(self.mst)<=0 or x<=self.mst[-1]:
            self.mst.append(x)
        

    # @return nothing
    def pop(self):

        if len(self.st)==0:
            return

        k=self.st.pop(-1)

        if k==self.mst[-1]:
            self.mst.pop(-1)
        

    # @return an integer
    def top(self):

        if len(self.st) ==0:
            return -1
        return self.st[-1]

    # @return an integer
    def getMin(self):
        if len(self.st) ==0:
            return -1
        
        return self.mst[-1]
        
    
    def __init__(self):

        self.st=[]
        self.mst=[]
    
# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()