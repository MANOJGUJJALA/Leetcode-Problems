class Solution {
    public String longestCommonPrefix(String[] a) {
        
        Arrays.sort(a);
        
        StringBuilder s=new StringBuilder("");
        
        String a1=a[0];
        String a2=a[a.length-1];
        
        for(int i=0;i<Math.min(a1.length(),a2.length());i++){
            if(a1.charAt(i)!=a2.charAt(i)){
                return s.toString();
            }
            s.append(a1.charAt(i));
        }
        
        return s.toString();
        
        
        
    }
}