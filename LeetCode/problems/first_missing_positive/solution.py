class Solution:
    def firstMissingPositive(self, nums: List[int]) -> int:

        i=0
        A=list(nums)
        while i<len(A):

            if A[i]<1 or A[i]>len(A) or A[i]==i+1 or A[i]==A[A[i]-1]:
                i+=1
            else:
                p=A[i]
                q=A[p-1]
                A[i]=q
                A[p-1]=p
                # A[i],A[A[i]-1]=A[A[i]-1],A[i]
        
        for i in range(len(A)):
            if A[i]!=i+1:
                return i+1
        
        return len(A)+1
