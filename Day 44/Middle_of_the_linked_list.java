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
    public ListNode middleNode(ListNode head) {
        ListNode  slowPtr = head;
        ListNode fastPtr = head;

        // Traverse the fastPtr until it reaches last node or null
        while(fastPtr != null && fastPtr.next != null){

            // slowptr move the only one node
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;   
    }
}
