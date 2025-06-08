class Solution {
    public int maxProfit(int[] prices) {
        
        int m=prices[0];
        int ind=0;
         int res=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<m){
                m=prices[i];
                ind=i;
            }
            res=Math.max(res,Math.abs(prices[i]-m));
        }
        
        return res;
    }
}