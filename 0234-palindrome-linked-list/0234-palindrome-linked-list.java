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

 //taking extra space to store value of nodes and checking if it is palindrome
class Solution1 {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ArrayList<Integer> arr = new ArrayList<>();

        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }
        for(int i=0;i<arr.size()/2;i++) 
            if(arr.get(i) != arr.get(arr.size()-i-1)) return false;
        return true;
    }
}
/*
    traversing till middle of LL
    reversing the LL after midpoint
    now checking if both half are equal
*/
class Solution {
    public ListNode reverse(ListNode temp){
        ListNode pre=null;
        ListNode nex=null;
        while(temp !=null) {
            nex = temp.next;
            temp.next = pre;
            pre=temp;
            temp=nex;
        }
        return pre;

    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        //finding middle of LL
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;
        ListNode dummy = head;
        
        while(slow != null){
            if(dummy.val != slow.val)
                return false;
            slow = slow.next;
            dummy = dummy.next;
        }
        return true;
    }
}