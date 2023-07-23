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
 //using hashset
 //TC O(N)
 //SC O(N)
class Solution1 {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> st = new HashSet<>();

        while(head != null){
            if(st.contains(head))
                return true;
            st.add(head);
            head = head.next;
        }
        return false;
    }
}

//slow fast pointer
//TC O(N)
//SC O(1)
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null)
            return false;
        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
}