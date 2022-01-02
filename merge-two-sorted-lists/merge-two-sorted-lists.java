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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        ListNode curr1 = list1;
        ListNode curr2 = list2;
        ListNode resultList = null;
        ListNode currRes = null;
        
        while(curr1 != null && curr2 != null) {
            if(curr1.val < curr2.val) {
                if(resultList == null) {
                    resultList = new ListNode(curr1.val);
                    currRes = resultList;
                } else {
                    currRes.next = new ListNode(curr1.val);
                    currRes = currRes.next;
                }
                curr1 = curr1.next;
            } else {
                if(resultList == null) {
                    resultList = new ListNode(curr2.val);
                    currRes = resultList;
                } else {
                    currRes.next = new ListNode(curr2.val);
                    currRes = currRes.next;
                }
                curr2 = curr2.next;
            }
        }
        
        while(curr1 != null) {
            if(resultList == null) {
                resultList = new ListNode(curr1.val);
                currRes = resultList;
            } else {
                currRes.next = new ListNode(curr1.val);
                currRes = currRes.next;
            }
            curr1 = curr1.next;
        }
        
         while(curr2 != null) {
            if(resultList == null) {
                resultList = new ListNode(curr2.val);
                currRes = resultList;
            } else {
                currRes.next = new ListNode(curr2.val);
                currRes = currRes.next;
            }
            curr2 = curr2.next;
        }
        
        return resultList;
    }
}