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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = new ListNode();
        ListNode newlist = head;
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }

        while (!(list1 == null && list2 == null)){
            if (list1 == null){
                newlist.next = list2;
                newlist = newlist.next;
                list2 = list2.next;
            }
            else if (list2 == null){
                newlist.next = list1;
                newlist = newlist.next;
                list1 = list1.next;
            }
            else if (list1.val >= list2.val){
                newlist.next = list2;
                newlist = newlist.next;
                list2 = list2.next;
            }
            else if (list2.val >= list1.val){
                newlist.next = list1;
                newlist = newlist.next;
                list1 = list1.next;
            }
        }
        return head.next;

    }
}