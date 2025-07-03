class Solution {
    public int findMin(int[] nums) {

        int l=1,r=nums.length-1,m=nums[0],k=nums[0];

        if(nums.length>=2){
            if(nums[nums.length-1]<nums[nums.length-2])
            return nums[nums.length-1];
        }

        while(l<=r){
             m=(l+r)/2;
            
            if(  (m-1)>=0 && (m+1)<=nums.length-1 &&  nums[m]<nums[m-1] && nums[m]<nums[m+1]) {
                return nums[m];
            }
            else if(nums[0]>nums[m]){
                r=m-1;
            }
            else if(nums[0]<nums[m]){
                l=m+1;
            }
        }
        return k;


        
    }
}