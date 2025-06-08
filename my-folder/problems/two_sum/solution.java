class Solution {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer,Integer>m=new HashMap<>();
        int g[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i])){
                
                g[0]=m.get(target-nums[i]);
                g[1]=i;
                return g;
            }
            else{
                m.put(nums[i],i);
            }
        }

            
            
        return g;
        
    }
}