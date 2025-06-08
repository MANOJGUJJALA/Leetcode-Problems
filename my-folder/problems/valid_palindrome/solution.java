class Solution {
    public boolean isPalindrome(String s) {

            String s1=""; 
        for(Character a:s.toCharArray()){
            int asc=(int)a;
                if( (asc>=97 && asc<=122) || (asc>=65 && asc<=90) || (asc>=48 && asc<=57)){
                    s1+=Character.toLowerCase(a);
                }
        }
        System.out.println(s1);
        for(int i=0;i<s1.length()/2;i++){
            Character g=s1.charAt(i);
            Character y=s1.charAt(s1.length()-1-i);
            if(g!=y){
                return false;
            }
        }
        return true;
        
    }
}