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
//TC: O(N)+O(N/2)
class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode temp=new ListNode();
        temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        count=count/2+1;
        temp=head;
        for(int i=1;i<count;i++)
            temp=temp.next;
        return temp;
    }
}


//TC: O(n/2)
class Solution1 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        //when fast would be at end then slow would be at middle
        while(fast != null && fast.next != null){
            slow = slow.next;   //increasing slow b y one position
            fast = fast.next.next;  //increasing fast by two positions
        }
        return slow;
    }
}