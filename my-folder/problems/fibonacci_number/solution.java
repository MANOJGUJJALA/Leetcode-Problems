class Solution {
    public int fib(int n) {
        
        int a=0,b=1;
        if (n==2){
            return 1;
        }
        else if(n==0){
            return 0;
        }
        int c=a+b;
       for(int i=3;i<=n;i++){
           a=b;
           b=c;
           c=a+b;
       }
        return c;
    }
}