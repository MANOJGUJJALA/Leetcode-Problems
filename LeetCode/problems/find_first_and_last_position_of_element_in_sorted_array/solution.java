class Solution {
    public int[] searchRange(int[] nums, int target) {

        int l=0,r=nums.length-1;
        int y[]=new int[2];
        
       int first=-1,sec=-1;

       

        while(l<=r){
            int m=(l+r)/2;
            if(nums[m]==target){
                first=m;
                r=m-1;
            }

            else if(nums[m]>target){
                r=m-1;
            }
            else {
                l=m+1;
            }
        }
        y[0]=r;
        l=0;
        r=nums.length-1;

        while(l<=r){
            int m=(l+r)/2;

            if(nums[m]==target){
                sec=m;
                l=m+1;
            }
            else if(nums[m]>target) {
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
      
       
        y[0]=first;
        y[1]=sec;

        
        return y;
    }
}