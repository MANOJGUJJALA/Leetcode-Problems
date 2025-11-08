class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>>res=new ArrayList<>();


        for(int i=0;i<nums.length;i++){
            int c=nums[i];
            int l=i+1,r=nums.length-1;

            if(nums[i]>0) break;

            if (i > 0 && nums[i] == nums[i - 1]) continue;

            while(l<r){
                

                if(nums[l]+nums[r]+c==0){
                    List<Integer>re=new ArrayList<>();
                    re.add(nums[l]);
                    re.add(nums[r]);
                    re.add(nums[i]);
                    res.add(re);
                    l++;
                    r--;
                    while(l<r && nums[l]==nums[l-1]){
                        l++;
                    }

                }
                else if(nums[l]+nums[r]+c>0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return res;
        
    }
}