class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> s=new HashSet<>();
        // if(nums.length==0)return 0;
        int r=0;

        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        for(int i:s){
          
            
            if(!s.contains(i-1)){
                int c=1;

                while(s.contains(i+c)){
                    c+=1;
                    
                }

                r=Math.max(r,c);

            }
        }
        return r;

        
    }
}