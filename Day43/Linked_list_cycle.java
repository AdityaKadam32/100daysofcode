public class Solution {
    public boolean hasCycle(ListNode head) {
        // start both slow and fast pointer
        ListNode slowPtr = head;
        ListNode fastPtr = head;

        while(slowPtr != null 
        &&fastPtr != null
        &&fastPtr.next != null){
            //Advance both the pointer
        slowPtr = slowPtr.next;
        fastPtr = fastPtr.next.next;

        // check if we found the cycle in linkedlist
        if(slowPtr == fastPtr){
            return true;
        }
    }
        return false;   
    }
}
