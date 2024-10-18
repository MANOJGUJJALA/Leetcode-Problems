class Solution {
    public int subsetXORSum(int[] nums) {
        
        int res=0;
        
        for(int i:nums){
            res=res|i;
        }
        int n=nums.length;
        return res<<(n-1);
        
    }
}