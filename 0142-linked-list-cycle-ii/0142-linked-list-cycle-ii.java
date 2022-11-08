/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// Keeping track of visited nodes in a hash table O(n) time and  O(n) space
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null) return null;
        ListNode curr=head;
        Set<ListNode> d=new HashSet<>();
        while(curr!=null)
        {
            if(d.contains(curr)) return curr;
            d.add(curr);
            curr=curr.next;
        }
        return null;
    }
}