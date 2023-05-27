package AddTwoNumbers_List;

// Definition for singly-linked list.
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result= new ListNode();
        int carry =0;
        ListNode finalResult= result;
        while(l1 != null || l2 != null)
        {
            int tempValL1 = (l1 != null) ? l1.val : 0;
            int tempValL2 = (l2 != null) ? l2.val : 0;
            int tempVal = tempValL1 +tempValL2 + carry;
            carry = tempVal /10;
            result.next = new ListNode (tempVal % 10);
            result = result.next;
            if(l1 != null)
                l1= l1.next;
            if(l2 != null)
                l2 = l2.next;
        }
        if (carry >0)
            result.next = new ListNode (carry);
        return finalResult.next;
    }
}