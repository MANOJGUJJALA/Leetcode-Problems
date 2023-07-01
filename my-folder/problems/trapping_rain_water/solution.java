class Solution {
    public int trap(int[] height) {

        int s=0;
        int leng=height.length;
        int l[] =new int[leng];
        int r[]=new int[leng];
        l[0]=height[0];
        for(int i=1;i<leng;i++){
            l[i]=Math.max(height[i],l[i-1]);
        }
        r[leng-1]=height[leng-1];

        for(int i=leng-2;i>=0;i--){
            r[i]=Math.max(height[i],r[i+1]);
        }

        for(int i=0;i<leng;i++){
            s=s+Math.min(l[i],r[i])-height[i];
        }

        return s;

        
    }
}