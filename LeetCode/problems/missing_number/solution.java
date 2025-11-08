class Solution {
    public int missingNumber(int[] nums) {

        int n=nums.length;
        int s=(n*(n+1))/2;

        int u=0;
        for(int i=0;i<nums.length;i++){
            u+=nums[i];
        }
        return Math.abs(s-u);
        
    }
}