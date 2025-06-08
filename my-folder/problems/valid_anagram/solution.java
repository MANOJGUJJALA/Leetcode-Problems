class Solution {
    public boolean isAnagram(String s, String t) {

        Map<Character,Integer>m=new HashMap<>();
        Map<Character,Integer>m1=new HashMap<>();
        for(char a:s.toCharArray()){
            m.put(a,m.getOrDefault(a,0)+1);
        }

        for(char a:t.toCharArray()){
            m1.put(a,m1.getOrDefault(a,0)+1);
        }
        
        return m1.equals(m);
    }
}