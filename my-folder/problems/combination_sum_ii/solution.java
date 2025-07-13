class Solution {

    public void dfs(List<List<Integer>>r,List<Integer>path,int s,int st,int t,int[]nums){
        if(s==t){
            r.add(new ArrayList<>(path));
            return;
        }
        for(int i=st;i<nums.length;i++){
            if (i > st &&  nums[i] == nums[i - 1]) continue;
            if (s + nums[i] > t) break;
            path.add(nums[i]);
            s+=nums[i];
            dfs(r,path,s,i+1,t,nums);
            s-=path.get(path.size()-1);
            path.remove(path.size()-1);
        }
        

    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>r=new ArrayList<>();
        List<Integer>path=new ArrayList<>();
        int s=0,st=0;
        Arrays.sort(candidates);
        dfs(r,path,s,st,target,candidates);
        return r;
        
    }
}