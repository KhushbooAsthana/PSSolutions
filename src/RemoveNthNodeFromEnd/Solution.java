package RemoveNthNodeFromEnd;

/**
 * Definition for singly-linked list.
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dhead=new ListNode(0);
        dhead.next=head;
        ListNode ln=dhead;
        ListNode dh=dhead;
        int len=0;
        while(ln.next != null)
        {
            ln=ln.next;
            len++;
        }
        int nodedel=len-n;
        int i=0;
        while(i<nodedel)
        {
            dh=dh.next;
            i++;
        }
        dh.next=dh.next.next;

        return dhead.next;
    }
}
