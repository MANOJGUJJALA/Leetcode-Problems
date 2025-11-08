class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(ans, new ArrayList<>(), nums, target, 0, 0);
        return ans;
    }

    void backtrack(List<List<Integer>> ans, List<Integer> list, int[] nums, int target, int cur_sum, int start){
        //Base Case 
        if(cur_sum == target){ 
            ans.add(new ArrayList<>(list));
            return;
        }

        //Recursive Case
        for(int i = start; i < nums.length; i++){
            if(cur_sum + nums[i] > target) continue; // search sum <= target 
            list.add(nums[i]);
            cur_sum += nums[i];
            backtrack(ans, list, nums, target, cur_sum, i); // save current i, values can be used multiple times
            // clear a space for new numbers 
            cur_sum -= list.get(list.size()-1);
            list.remove(list.size()-1);
        }
    }
}