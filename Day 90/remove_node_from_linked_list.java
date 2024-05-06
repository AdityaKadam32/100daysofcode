class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;
        while(cur!= null){
            ListNode nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        //create ans list
        ListNode newHead = new ListNode(prev.val);
        int maxVal = newHead.val;
        cur = prev.next;
        while(cur!= null){
            if(cur.val>= maxVal){
                //insert at head
                ListNode node = new ListNode(cur.val);
                node.next = newHead;
                newHead = node;
                maxVal =  node.val;
            }
            cur=cur.next;
        }
        return  newHead;
    }
}
