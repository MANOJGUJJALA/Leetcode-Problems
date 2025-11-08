class Solution {
    public int lengthOfLongestSubstring(String st) {

        HashSet<Character>s=new HashSet<>();
        int start=0,res=0;

        for(int i=0;i<st.length();i++){
            if(s.contains(st.charAt(i))){

                while(s.contains(st.charAt(i))){
                    s.remove(st.charAt(start));
                    start++;
                }
                
                s.add(st.charAt(i));
                res=Math.max(res,s.size());
                
            }
            else{
                s.add(st.charAt(i));
                res=Math.max(res,s.size());
            }

        }
        return res;
        
    }
}