class Solution {
    public int mySqrt(int x) {

        if(x<2){
            return x;
        }

        int l=2,r=x/2;

        while(l<=r){

            int mid=(l+r)/2;
            if (1L*mid*mid>x){
                r=mid-1;
            }
            else if(1L*mid*mid<x){
                l=mid+1;
            }
            else{
                return mid;
            }

        }
        return r;

       
        
    }
}