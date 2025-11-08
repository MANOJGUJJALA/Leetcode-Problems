class Solution:
    def isValid(self, s: str) -> bool:
        
        p=[]*len(s)
        k=""
        for i in s:
            if i=="(":
                p.append("(")
                
            elif i=="{":
                p.append("{")
            elif i=="[":
                p.append("[")
            elif i==")":
                if len(p)>0:
                    k=p.pop()
                    if k!="(" :
                        return False
                else:
                    
                        return False
            elif i=="]":
                if len(p)>0:
                    k=p.pop()
                    if k!="[" :
                        return False
                else:
                    return False
                        
            elif i=="}":
                if len(p)>0:
                    k=p.pop()
                    if k!="{" :
                        return False
                else:
                    
                        return False
        if len(p)>0:
            return False
        
        return True
        