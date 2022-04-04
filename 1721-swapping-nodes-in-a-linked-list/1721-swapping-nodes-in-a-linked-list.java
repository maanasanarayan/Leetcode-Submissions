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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode curr = head;
        int noOfNodes = 0;
        
        while(curr != null) {
            noOfNodes++;
            curr = curr.next;
        }
        
        int m = noOfNodes - k + 1;
        
        curr = head;
        ListNode kthNode = curr;        
        int cnt = 0;
        
        while(curr != null && cnt != k) {
            cnt++;
            kthNode = curr;
            curr = curr.next;
        }
        
        curr = head;
        ListNode mthNode = curr;
        cnt = 0;
        
        while(curr != null && cnt != m) {
            cnt++;
            mthNode = curr;
            curr = curr.next;
        }
        
        int temp = kthNode.val;
        kthNode.val = mthNode.val;
        mthNode.val = temp;  
        
        return head;
    }
}