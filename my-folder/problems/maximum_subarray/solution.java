class Solution {
    public int maxSubArray(int[] nums) {

        int s=0;
        int ma=- Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
            if(s>ma){
                ma=s;
            }
            if(s<=0){
                s=0;
            }
        }

        return ma;
        
    }
}