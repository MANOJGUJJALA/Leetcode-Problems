class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer>h=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int compl=-nums[i]+target;
            if(h.containsKey(compl)){
                return new int[]{h.getOrDefault(compl,0),i};
            }
            h.put(nums[i],i);
        }
        return new int[]{0,0};
        
    }
}