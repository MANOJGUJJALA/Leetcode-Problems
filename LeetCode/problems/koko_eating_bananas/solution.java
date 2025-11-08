class Solution {

    public long totime(int k,int[] piles){
        long t=0;

        for(int i=0;i<piles.length;i++){
            t+=(piles[i]+k-1)/k;
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        
        int l=1,r=Arrays.stream(piles).max().getAsInt();
        int res=r;

        while(l<=r){

            int m=(l+r)/2;

            long tt=totime(m,piles);
            if(tt<=h){
                res=m;
                r=m-1;
            }
            else{
                l=m+1;
            }
        }
        return res;

    }
}


