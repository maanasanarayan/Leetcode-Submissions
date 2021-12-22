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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currNode = head;
        ListNode nextNode;
        
        while(currNode != null) {
            nextNode = currNode.next;
            
            while(nextNode != null && currNode.val == nextNode.val) {
                nextNode = nextNode.next;
            }
            
            currNode.next = nextNode;
            currNode = nextNode;
        }
        return head;
    }
}