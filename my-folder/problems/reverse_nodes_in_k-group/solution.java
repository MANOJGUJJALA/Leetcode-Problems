/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode rev(ListNode h){
        if(h==null || h.next==null){
            return h;
        }
        ListNode p=rev(h.next);
        h.next.next=h;
        h.next=null;
        return p;
    }
    public ListNode reverseKGroup(ListNode head, int co) {

        ListNode l=head,y=head,u=head,k=null,hd=head,j=null;
         int c=1,flag=0;

         if(head==null || head.next==null || co==1)return head;
         

        while(l.next!=null){
            u=l;
           
            c=1;

        while(c!=co){
            if(l.next==null){
                if(j==null){
                    k.next=y;
                    return hd;
                }
                else{
                    k.next=y; return hd;
                }
                
                
            }
            l=l.next;
            
            c++;
        }
        
        y=l.next;
        j=k;
        if(flag==0){
            flag=1;
            hd=l;
        }
        if(y==null){
            ListNode v=rev(u);
            if(k==null)return v;
            k.next=v;
            return hd;
        }
        k=u;
        l.next=null;
        l=y;
        ListNode g=rev(u);
        if(j!=null)j.next=g;
        
        }

        if(j==null){
            
            if(k==null)return head;
            k.next=y;
            return hd;
        }
        else if(l.next==null){
            k.next=y;
            return hd;
        }
        j.next=y;
        return hd;
        
    }
}