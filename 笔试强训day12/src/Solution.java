import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode head2 = pHead2;
        while (pHead1 != null) {
            pHead2 = head2;
            while (pHead2 != null) {
                if (pHead1.val == pHead2.val) {
                    return pHead1;
                }
                pHead2 = pHead2.next;
            }
            pHead1 = pHead1.next;
        }
        return null;
    }
}
