class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

            HashMap<String,List<String>>map=new HashMap<>();
        for(int i=0;i<strs.length;i++){

            int a[]=new int[26];
            String k=strs[i];
            for(int j=0;j<k.length();j++){
                a[k.charAt(j)-'a']+=1;
            }
            

            StringBuilder sb = new StringBuilder();
            for (int count : a) {
                sb.append('#').append(count);
            }
            String key = sb.toString();

            List<String> p = map.getOrDefault(key, new ArrayList<>());
            p.add(k);
            map.putIfAbsent(key, p);
           
            
            // map.putIfAbsent(key,map.getOrDefault(a,p).add(k));

        }
        System.out.print(map);
        List<List<String>>res=new ArrayList<>();

        for(List<String>s:map.values()){

            res.add(s);

        }
        return res;
        
    }
}