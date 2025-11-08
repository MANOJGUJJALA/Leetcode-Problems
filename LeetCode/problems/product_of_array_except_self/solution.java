class Solution {
    public int[] productExceptSelf(int[] nums) {

        int p=1,c=0;
        int[] n=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            
            if(nums[i]==0){
                c+=1;
            }
            else{
                p*=nums[i];
            }
        }

        if(c==1){
             for(int i=0;i<nums.length;i++){
                if(nums[i]==0){
                    nums[i]=p;
                }
                else{
                    nums[i]=0;
                }
             }
             return nums;

        }
        else if(c>=2){
            
            return n;
            }
            else{

                for(int i=0;i<nums.length;i++){
                    nums[i]=p/nums[i];
                }
                return nums;
                
            }
          
        
    }
}