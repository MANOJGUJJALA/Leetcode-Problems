class Solution {

    public void dfs(List<String> r,StringBuilder path,int st,StringBuilder dig,HashMap<String,String>map){

        if(path.length()==dig.length()){
            String s=path.toString();;
            r.add(s);
            return;
        }
         
        String cur=map.get(String.valueOf(dig.charAt(st)));
        if (cur == null) return;
        for(int i=0;i<cur.length();i++){
            path.append(cur.charAt(i));
            dfs(r,path,st+1,dig,map);
            path.deleteCharAt(path.length() - 1);
        }

    }
    public List<String> letterCombinations(String digits) {
        
        List<String>r=new ArrayList<>();
        if (digits == null || digits.length() == 0) return r;
        StringBuilder path=new StringBuilder();
        StringBuilder dig=new StringBuilder(digits);
        HashMap<String,String>map=new HashMap<>();
        map.put("2","abc");
        map.put("3","def");
        map.put("4","ghi");
        map.put("5","jkl");
        map.put("6","mno");
        map.put("7","pqrs");
        map.put("8","tuv");
        map.put("9","wxyz");
        dfs(r,path,0,dig,map);
        return r;
        
    }
}