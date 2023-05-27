package DeleteDuplicateNodes;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
}

class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode dhead=new ListNode(0);
        dhead.next=head;
        ListNode dh=dhead.next;
        while(dh.next != null)
        {
            if(dh.val==dh.next.val)
            {
                dh.next=dh.next.next;
            }
            else if(dh.next != null)
                dh=dh.next;

        }
        return dhead.next;
    }
}