//LC 876

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
        int length = 1;
		
		ListNode temp = head;
        while(temp.next != null){
            length += 1;
            temp = temp.next;
        }
        int middle = length/2;

        ListNode current = head;
        while(middle > 0) {
        	middle--;
        	current = current.next;
        }
        return current;
    }
}
