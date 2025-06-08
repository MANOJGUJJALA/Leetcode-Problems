class Solution {
    public boolean containsDuplicate(int[] nums) {


        Map<Integer,Integer>m=new HashMap<>();
       

        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        // System.out.println(m);
        for(Map.Entry<Integer,Integer>k:m.entrySet()){
            if(k.getValue()>=2){
                return true;
            }
        }
        return false;

        
        
    }
}