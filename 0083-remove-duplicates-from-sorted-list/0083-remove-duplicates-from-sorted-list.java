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

//new list is created
class SolutionBrute{
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode NewHead=new ListNode(head.val);
        
        ListNode temp=head;
        ListNode newtemp=NewHead;
        while(temp!=null){
            if(temp.val==newtemp.val)
                temp=temp.next;
            else{
                newtemp.next=new ListNode(temp.val);
                temp=temp.next;
                newtemp=newtemp.next;
            }
        }
        return NewHead;
    }
}

//traversing till similar elements are encountered
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null)
            return head;
        
        ListNode current=head;
        while(current!=null){
            ListNode temp=current;
            while(temp!=null && temp.val==current.val){
                temp=temp.next;
            }
            current.next=temp;
            current=current.next;
        }
        return head;
    }
}