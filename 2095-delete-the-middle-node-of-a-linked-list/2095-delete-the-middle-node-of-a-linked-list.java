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

 //counting number of nodes
 // two passes
class Solution1 {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        int count = 0;
        ListNode p = head;
        while(p != null){
            count++;
            p = p.next;
        }
        p = head;
        int mid = count/2;
        for(int i=0; i<mid-1; i++)
            p=p.next;
        
        p.next = p.next.next;
        return head;
    }
}

//slow fast pointer
// initially taking fast pointer ahead by two step 
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null)
            return null;
        ListNode slow = head, fast=head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}