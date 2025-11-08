class Solution {
    public int hammingWeight(int n) {
        int c=0;
        while(n>0){

            int k=n&1;
            if(k==1){c+=1;}
            n=n>>1;

        }
        return c;
    }
}