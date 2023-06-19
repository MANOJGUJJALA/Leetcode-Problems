class Solution {

    public boolean equal(int c1[],int c2[]){

        for(int i=0;i<26;i++){
            if(c1[i]!=c2[i]){
                return false;
            }
        }
        return true;
    }
    public List<Integer> findAnagrams(String s, String p) {

        int l=p.length();

        List<Integer> a=new ArrayList<>();

        int c1[]=new int[26];
          int c2[]=new int[26];

          if(l>s.length()){
              return a;
          }

        for(int i=0;i<l;i++){
            c1[p.charAt(i)-'a']++;
            c2[s.charAt(i)-'a']++;

        }
        if(equal(c1,c2)){
            a.add(0);
        }
        int z=0;
        for(int i=l;i<s.length();i++){
            c2[s.charAt(i)-'a']++;

            if(c2[s.charAt(z)-'a']>0){

            c2[s.charAt(z)-'a']--;
            }
            z+=1;
            if(equal(c1,c2)){
            a.add(i-l+1);
            }
        }

        return a;
    }
}