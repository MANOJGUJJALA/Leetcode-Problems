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

    public ListNode getMid(ListNode h){
        if (h==null || h.next==null){
            return h;
        }
        ListNode s=h,f=h,m=h;

        while(f!=null && f.next!=null){
           m=s;
            s=s.next;
            f=f.next.next;
        }
        return m;
    }
    public void reorderList(ListNode head) {

        if (head==null || head.next==null){
            return ;
        }
        ListNode mid=getMid(head);
       
        
        ListNode secon=mid.next;
        mid.next=null;

        ListNode p=head;

        ListNode second=rev(secon);

        ListNode res=new ListNode();
        ListNode y=res;

        while(p!=null && second!=null){
            res.next=p;
            p=p.next;
            res=res.next;
            
            res.next=second;
            second=second.next;
            res=res.next;
        }

        if(p!=null){
            res.next=p;
        }
        if(second!=null){
            res.next=second;
        }

        // ✅ Copy reordered values back to the original list
ListNode newList = y.next;  // reordered list
ListNode original = head;

while (newList != null && original != null) {
    original.val = newList.val;
    newList = newList.next;
    original = original.next;
}

       
        
    }
}