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

class Solution1 {
    // TC O(n)+O(n)
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode();
        start.next=head;
        int count=0;
        while(start.next!=null){
            start=start.next;
            count++;
        }
        int j=count-n;
        start=head;
        if(j==0)
        {
            ListNode node=head;
            head=head.next;
        }
        else{
            for(int i=1;i<j;i++){
                start=start.next;
            }
            start.next=start.next.next;
        }
        return head;
    }
}

//using slow and fast pointer 
//TC O(n)
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start=new ListNode();
        start.next=head;
        ListNode slow=start;
        ListNode fast=start;
        
        for(int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return start.next;
    }
}