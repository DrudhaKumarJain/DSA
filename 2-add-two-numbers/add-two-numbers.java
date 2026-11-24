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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3=new ListNode();
        ListNode t1=l1;
        ListNode t2=l2;
        ListNode t3=l3;
        int carry=0;
        int sum=0;
        while(t1!=null||t2!=null){
            if(t1!=null&&t2!=null)
            sum=t1.val+t2.val+carry;
            else if(t2==null)
            sum=t1.val+carry;
            else 
            sum=t2.val+carry;
            ListNode temp=new ListNode();
            temp.val=sum%10;
            t3.next=temp;
            t3=temp;
            carry=sum/10;
            if(t1!=null)
            t1=t1.next;
            if(t2!=null)
            t2=t2.next;
            sum=0;
        }
       
        if(carry>0){
            ListNode temp=new ListNode();
            temp.val=carry;
            t3.next=temp;
        }
        return l3.next;
    }
}
