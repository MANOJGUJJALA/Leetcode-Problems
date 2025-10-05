class Solution {
    public int longestSubsequence(int[] nums) {

        int x=0;
        int f=0;
        for(int i=0;i<nums.length;i++){
            x=x^nums[i];
            if(nums[i]!=0){
                f=1;
            }
        }

        if(x!=0){
            return nums.length;
        }
        if(f==0){
            return 0;
        }

        return nums.length-1;
        
        
    }
}