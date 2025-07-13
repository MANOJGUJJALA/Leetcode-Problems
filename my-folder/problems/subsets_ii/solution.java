class Solution {

    public void dfs(List<List<Integer>>r,List<Integer>path,int st,int[]nums,HashSet<List<Integer>>se){
        if(se.contains(path))return;
        se.add(path);
        r.add(new ArrayList<>(path));
        for(int i=st;i<nums.length;i++){
            path.add(nums[i]);
            dfs(r,path,i+1,nums,se);
            path.remove(path.size()-1);
        }

    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>r=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>>se=new HashSet<>();
        dfs(r,path,0,nums,se);
        return r;
    }
}