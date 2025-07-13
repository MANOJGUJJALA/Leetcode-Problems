class Solution {

    public void dfs(List<List<Integer>>r,List<Integer>path,int[]nums){
        if(path.size()==nums.length){
            r.add(new ArrayList<>(path));
        }
        

        
        for(int i=0;i<nums.length;i++){
            if(path.contains(nums[i]))continue;
            path.add(nums[i]);
            dfs(r,path,nums);
            path.remove(path.size()-1);
        }
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>r=new ArrayList<>();
        List<Integer>path=new ArrayList<>();

        dfs(r,path,nums);
        return r;
        
    }
}