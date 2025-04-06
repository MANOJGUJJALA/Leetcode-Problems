# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def deleteDuplicates(self, head: Optional[ListNode]) -> Optional[ListNode]:

        if head is None or head.next is None:
            return head
        te=head
        t=head.next
        while t!=None:

            if te.val==t.val:
                te.next=t.next
                
                if t.next!=None:
                    t=t.next
                else:
                    t=None

            else:
                te=t
                t=t.next
        return head

        