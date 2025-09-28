import java.util.Arrays;
import java.util.Collections;
class Solution {
    public int[] decimalRepresentation(int n) {
        int r=1;
        String s=String.valueOf(n);
        int l=s.length();

        int a[]=new int[l];
        int i=0;
        while(n>0){
            int k=n%10;
            n=n/10;
            if(k!=0){
                a[i]=k*r;
                i+=1;
            }
           
            
            r=r*10;
        }
        int[]res=Arrays.copyOfRange(a,0,i);
        int p=0,q=res.length-1;
        while(p<q){
            int y=res[p];
            res[p]=res[q];
            res[q]=y;
            p+=1;
            q-=1;
        }
        
        return res;
        
    }
}