class Solution {

    public void dfs(List<Integer>path,int st,List<List<Integer>>r,int[] nums){
        r.add(new ArrayList<>(path));
        for(int i=st;i<nums.length;i++){
            path.add(nums[i]);
            dfs(path,i+1,r,nums);
            path.remove(path.size()-1);
        }

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>r=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        int st=0;
        dfs(path,0,r,nums);
        return r;
    }
}