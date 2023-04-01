/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val=node.next.val;             //put the value of next node in that place
        if(node.next.next!=null)    node.next=node.next.next;
        else    node.next=null;
    }
}