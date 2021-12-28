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
    /* Doesn't work for long inputs */
    /*
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        long num1 = getIntFromList(l1);
        long num2 = getIntFromList(l2);
       
        long sum = num1 + num2;
        
        return getListFromInt(sum);
    }
    
    private long getIntFromList(ListNode list) {
        long num = 0;
        long count = 1;
        ListNode curr = list;
        
        while(curr != null) {
            num = num + curr.val * count;
            count = count * 10;
            curr = curr.next;
        }
        return num;
    }
    
    private ListNode getListFromInt(long result) {
        long rem = result % 10;
        ListNode resultList = new ListNode((int) rem);
        ListNode curr = resultList;
        
        while(result / 10 != 0) {
            result = result / 10;
            ListNode newNode = new ListNode((int) result % 10);
            curr.next = newNode;
            curr = newNode;
        }
        
        return resultList;
    }
    */
    
     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
         ListNode resultList = null;
         ListNode current = null;
         ListNode list1 = l1;
         ListNode list2 = l2;
         int carry = 0;
         int rem = 0;
         int result = 0;
         
         while(list1 != null && list2 != null) {
             result = list1.val + list2.val + carry;
             carry = result / 10;
             rem = result % 10;
             ListNode newNode = new ListNode(rem);
             if(resultList == null) {
                 resultList = newNode;
                 current = resultList;
             } else {
                 current.next = newNode;
                 current = current.next;
             }     
             list1 = list1.next;
             list2 = list2.next;
         }
         
         while(list1 != null) {
             result = list1.val + carry;
             carry = result / 10;
             rem = result % 10;
             ListNode newNode = new ListNode(rem);
             current.next = newNode;
             current = current.next;
             list1 = list1.next;
         }
         
         while(list2 != null) {
             result = list2.val + carry;
             carry = result / 10;
             rem = result % 10;
             ListNode newNode = new ListNode(rem);
             current.next = newNode;
             current = current.next;
             list2 = list2.next;
         }
         
         if(carry != 0) {
             ListNode newNode = new ListNode(carry);
             current.next = newNode;
             current = current.next;
         }
         return resultList;
     }
}