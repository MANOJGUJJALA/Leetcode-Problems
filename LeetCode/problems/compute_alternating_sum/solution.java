class Solution {
    public int alternatingSum(int[] nums) {

        int e=0,o=0;
        for(int i=0;i<nums.length;i++){
            if((i&1)==1){
                o+=nums[i];
            }
            else{
                e+=nums[i];
            }
        }
        return e-o;
        
    }
}