class Solution {
    public boolean isValid(String s) {
        Stack s1=new Stack<>();

        for(Character c:s.toCharArray()){
            if(c=='{' || c=='[' || c=='('){
                s1.push(c);
            }
            else{
                
                if(s1.isEmpty())  return false;

                if(c=='}' && (char)s1.peek()!='{'){
                    return false;
                }

                if(c==')' && (char) s1.peek()!='('){
                    return false;
                }

                if(c==']' && (char) s1.peek()!='['){
                    return false;
                }
                s1.pop();
            }
        }
      
        return s1.isEmpty();
    }
}