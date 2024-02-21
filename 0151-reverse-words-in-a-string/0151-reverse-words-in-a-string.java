class Solution {
    public String reverseWords(String s) {

        s=s.trim();

        String [] ar= s.split("\\s+");

        String s2="";

        for(int i=ar.length-1;i>0;i--){
            // if(ar[i]!=" "){

                s2+=ar[i]+" ";
            // }
        }


        return s2+ar[0];
        
    }
}