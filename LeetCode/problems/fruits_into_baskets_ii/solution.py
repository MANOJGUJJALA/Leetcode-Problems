class Solution:
    def numOfUnplacedFruits(self, fruits: List[int], baskets: List[int]) -> int:
        c=0
        for i in range(len(fruits)):
            flag=1

            for j in range(len(baskets)):

                if baskets[j]>=fruits[i]:
                    baskets[j]=-1
                    flag=0
                    break
            if flag==1:
                c+=1
        
        return c
            

