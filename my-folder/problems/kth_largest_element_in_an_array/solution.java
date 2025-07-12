class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>p=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++){
            p.add(-nums[i]);
        }
        int r=0;
        for(int i=0;i<k;i++){
            r=p.poll();
            if(i==k-1){
                return -r;
            }
            
        }
        return -r;

        
    }
}