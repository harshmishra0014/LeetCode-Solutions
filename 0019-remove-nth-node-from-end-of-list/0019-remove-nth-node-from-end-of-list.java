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