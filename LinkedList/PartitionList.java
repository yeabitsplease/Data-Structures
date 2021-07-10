/*

Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,

Given 1->4->3->2->5->2 and x = 3,

return 1->2->2->4->3->5.

*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode prev_head = new ListNode(0);
        ListNode prev = prev_head;
        ListNode after_head = new ListNode(0);
        ListNode after = after_head;

        while(head != null){
            if(head.val < x){
                prev.next = head;
                prev = prev.next;
            } else{
                after.next = head;
                after = after.next;
            }
            head = head.next;
        }
        after.next = null;
        prev.next = after_head.next;
        return prev_head.next;
    }

}
