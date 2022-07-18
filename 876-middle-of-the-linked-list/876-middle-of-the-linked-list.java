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
        ListNode fp = head;
        ListNode sp = head;
        
        // 1-->2-->3-->4
        
        while(fp != null && fp.next != null) {
            sp = sp.next;            
            fp = fp.next.next;
        }
        
        return sp;
    }
}