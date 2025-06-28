class Solution {

    public int count(int n){
        int c=0;

        while(n>0){
            int k=n&1;
            if(k==1)c+=1;
            n=n>>1;
        }
        return c;
    }
    public int[] countBits(int n) {

        int a[]=new int[n+1];

        while(n>=0){
            int c=count(n);
            a[n]=c;
            n--;
        }
        return a;

        
    }
}