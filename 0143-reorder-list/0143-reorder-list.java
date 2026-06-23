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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode leftHead = head;
        ListNode rigthHead = slow.next;
        slow.next = null;

        ListNode prev = null;
        ListNode curr = rigthHead;
        ListNode next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        rigthHead = prev;

        ListNode nextLeft;
        ListNode nextRight;

        while(leftHead != null && rigthHead != null){
            nextLeft = leftHead.next;
            leftHead.next = rigthHead;
            nextRight = rigthHead.next;
            rigthHead.next = nextLeft;

            rigthHead = nextRight;
            leftHead = nextLeft;
        }
    }
}