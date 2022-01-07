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
    
    ListNode head;
    int size;

    public Solution(ListNode head) {
        this.head = head;
        findSize();
    }
    
    private void findSize() {
        ListNode curr = head;
        int count = 0;
        
        while(curr != null) {
            curr = curr.next;
            count++;
        }
        
        this.size = count;
    }
    
    public int getRandom() {
        Random rand = new Random();
        int randomNo = rand.nextInt(size);
        int count = 0;
        ListNode curr = head;
        
        while(count < randomNo) {
            curr = curr.next;
            count++;
        }
        
        return curr.val;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */