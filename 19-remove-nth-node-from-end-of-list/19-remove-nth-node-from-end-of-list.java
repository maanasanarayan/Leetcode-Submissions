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
        ListNode curr = head;
        int size = 0;
        
        // Calculating the size of the list
        while(curr != null) {
            size++;
            curr = curr.next;
        }
        
        // Handling base conditions
        if(size == 1 && n == 1) {
            return null;
        } else if((size - n) == 0) {
            return head.next;
        }
        
        // Traversing the list to remove the node
        curr = head;
        int count = 1;
        
        while(count < (size - n)) {
            count++;
            curr = curr.next;
        }
        
        if(count == (size - n)) {
            curr.next = curr.next.next;
        }
        
        return head;
    }
}