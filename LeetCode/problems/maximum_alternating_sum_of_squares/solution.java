class Solution {
    public long maxAlternatingSum(int[] nums) {

       for(int i=0;i<nums.length;i++){
           if(nums[i]<0){
               nums[i]=-nums[i];
           }
       }
        Arrays.sort(nums);
        int l=0,r=nums.length-1;
        long s=0;
        while(l<=r){

            if(l==r){
                s+=nums[l]*nums[l];
            }
            else{
                
            
            s+=( -(nums[l]*nums[l]) + (nums[r]*nums[r]) ); 
            }

            l++;
            r--;
        }
        return s;
        
        
    }
}