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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode tmp=head;
         if(tmp==null || tmp.next==null){
            return head;
        }
        int l=0;
        ListNode q=head;
        while(q!=null){
            q=q.next;
            l++;
        }
        k=k%l;
        if(tmp==null || tmp.next==null || k==0){
            return head;
        }
        for(int i=0;i<k && tmp!=null;i++){
            tmp=tmp.next;
        }
        ListNode s=head;
        ListNode r=null;
        while(tmp.next!=null){
            r=s;
            s=s.next;
            tmp=tmp.next;
        }
        r=s.next;
        s.next=null;
        tmp.next=head;
        head=r;
        return head;

        
    }
}