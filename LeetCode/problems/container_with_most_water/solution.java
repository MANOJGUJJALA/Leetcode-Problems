class Solution {
    public int maxArea(int[] height) {

        int l=0,r=height.length-1,res=0;


        while(l<r){
            res=Math.max(res,Math.abs(l-r)*Math.min(height[l],height[r]));

            if(height[l]>height[r]){
                r--;
            }
            else if(height[l]<=height[r]){
                l++;
            }
            
        }
        return res;
        
    }
}