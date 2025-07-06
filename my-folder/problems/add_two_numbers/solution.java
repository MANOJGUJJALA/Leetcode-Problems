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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

       
        int c=0;
        
        ListNode dummy=new ListNode(0);
        ListNode res=dummy;
        while(l1!=null || l2!=null || c!=0){
            int v1=l1!=null ?l1.val:0;
            int v2=l2!=null ?l2.val:0;

            
            int v=v1+v2+c;
            c=v/10;
            
           
            res.next=new ListNode(v%10);
            res=res.next;
          
           
            if(l1!=null)l1=l1.next;
            if(l2!=null)l2=l2.next;
        }
        

        return dummy.next;
        
    }
}