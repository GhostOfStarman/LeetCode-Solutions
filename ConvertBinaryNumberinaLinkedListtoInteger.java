/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) 
       { 
            val = x; }
 * }
 */
class Solution {
    public int getDecimalValue(ListNode head) {
        
        Stack<Integer> s1 = new Stack<Integer>();
        int binVal = 0;
        int binMult = 1;
        
        ListNode current = head;
        
        while(current!=null){
            s1.push(current.val);
            current = current.next;
        }
        
        while(!(s1.isEmpty())){
            binVal += (s1.peek() * binMult);
            binMult *=2;
            s1.pop();
        }
        
        return binVal;
    }
    
}
