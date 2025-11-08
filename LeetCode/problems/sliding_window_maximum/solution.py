class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:

        q=[]
        q.append(nums[0])
        z=0
        
        r=[]

        for i in range(1,k):
            if q[-1]>=nums[i]:
                q.append(nums[i])
            else:

                while len(q)>0 and q[-1] < nums[i]:
                    q.pop(-1)
                q.append(nums[i])
        r.append(q[0])

        for i in range(k,len(nums)):
            if nums[z]==q[0]:
                q.pop(0)
            z+=1
            if len(q)<=0:
                q.append(nums[i])
            elif q[-1] >=nums[i]:
                q.append(nums[i])
            
            else:
                while len(q)>0 and q[-1] <nums[i]:
                    q.pop(-1)
                q.append(nums[i])
            r.append(q[0])
        return r