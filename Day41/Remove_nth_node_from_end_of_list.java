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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
       ListNode firstptr = dummy;
       ListNode secondptr = dummy;

       // Now move the secondptr to given n node
       for(int i = 0; i<n;i++){
        secondptr = secondptr.next;
       }

        // now move until the secondptr gets till the end null
        while(secondptr.next != null){
            firstptr = firstptr.next;
            secondptr = secondptr.next;
        } 
        // move the first node the the next of the next node 
            firstptr.next = firstptr.next.next;

          return dummy.next;
    }
   
}
