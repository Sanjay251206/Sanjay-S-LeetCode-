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
    public ListNode reverseList(ListNode head) {
         if (head == null) {
            return null;
        }
      ListNode prev=null;
      ListNode present=head;
      ListNode next1=present.next;
      while(present!=null){
        present.next=prev;
        prev=present;
        present=next1;
        
        if(next1!=null){
            next1=next1.next;
        }
      }
        return prev;
    }
}