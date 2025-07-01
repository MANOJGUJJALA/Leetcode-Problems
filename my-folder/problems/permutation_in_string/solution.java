class Solution {
    public boolean checkInclusion(String s1, String s2) {


            if(s2.length()<s1.length())return false;



        HashMap<Character,Integer>a=new HashMap<>();
        HashMap<Character,Integer>b=new HashMap<>();

        for(int i=0;i<s1.length();i++){
            a.put(s1.charAt(i),a.getOrDefault(s1.charAt(i),0)+1);
            b.put(s2.charAt(i),b.getOrDefault(s2.charAt(i),0)+1);
        }
        

        if(a.equals(b)) return true;

        int st=0;
         for(int i=s1.length();i<s2.length();i++){
               
                b.put(s2.charAt(st),b.getOrDefault(s2.charAt(st),0)-1);
                
                if(b.get(s2.charAt(st))==0){
                     b.remove(s2.charAt(st));
                }
                st++;
                
                b.put(s2.charAt(i),b.getOrDefault(s2.charAt(i),0)+1);
                if(a.equals(b)) return true;
         }

        
        return false;

    }
}