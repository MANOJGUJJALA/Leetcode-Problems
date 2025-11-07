class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer>s=new HashSet<>();

        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        Boolean flag=true;
        int p=1,res=k;
        while(flag){
            if(s.contains(k*p)){
                p++;
                res=k*p;
            }
            else{
                flag=false;
            }
        }
        return res;
        
    }
}