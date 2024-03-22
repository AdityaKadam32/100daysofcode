class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;

        // rev the first list
        ListNode  slow = head;
        ListNode  fast = head;
        ListNode  prev = null;

        while(fast!= null && fast.next != null){
            // rev
            fast = fast.next.next;
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
            // In odd case increase the slow pointer by 1
        if(fast!= null){
            slow = slow.next;
        }
        while(slow != null){
            if(prev.val != slow.val){
                return false;   
        }
        prev = prev.next;
        slow = slow.next;
        }
        return true;
    
    }
}
