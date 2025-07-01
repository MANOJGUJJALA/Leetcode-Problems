class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> x=new HashMap<>();
        int ma=0,start=0,res=0;

        for(int i=0;i<s.length();i++){

            x.put(s.charAt(i),x.getOrDefault(s.charAt(i),0)+1);

            ma=Math.max(ma,x.get(s.charAt(i)));

            
            while((i-start+1)-ma>k){
                x.put(s.charAt(start),x.get(s.charAt(start))-1);
                start+=1;
            }
            res=Math.max(res,i-start+1);
        }
        return res;
        
    }
}