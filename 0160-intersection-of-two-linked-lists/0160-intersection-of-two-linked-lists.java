/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

 //brute solution
 //O(M*N)
class Solution1 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        while(headA!=null){
            ListNode temp=headB;
            while(temp!=null){
                if(temp==headA)
                    return temp;
                temp=temp.next;
            }
            headA=headA.next;
        }
        return null;
    }
}

//O(M+N)
// space O(N)
class Solution2 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> st=new HashSet<>();
        while(headA != null) {
            st.add(headA);
            headA = headA.next;
        }
        while(headB != null) {
            if(st.contains(headB)) return headB;
            headB = headB.next;
        }
        return null;

    }
}

//O(M+N)
//no space 
//finding difference in length
class Solution3 {
    public int getDifference(ListNode headA, ListNode headB){
        int l1=0, l2=0;
        while(headA !=null || headB != null){
            if(headA != null){
                l1++;
                headA = headA.next;
            }
            if(headB != null){
                l2++;
                headB = headB.next;
            }
        }
        return l1-l2;
        //here if it returns negative then list2 is greater otherwise list1
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int diff=getDifference(headA, headB);

        //to move the pointer of larger ahead of difference number of nodes
        if(diff<0)
            while(diff++ != 0)  headB = headB.next;
        else
            while(diff-- != 0)  headA = headA.next;
        //now traversing remaining list to find intersection
        while(headA != null) {
            if(headA == headB) return headA;
            headB = headB.next;
            headA = headA.next;
        }
        return headA;
    }
}

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode d1 = headA;
        ListNode d2 = headB;
        
        while(d1 != d2) {
            d1 = d1 == null? headB:d1.next;
            d2 = d2 == null? headA:d2.next;
        }
        
        return d1;
    }
}