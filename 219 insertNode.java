/**
 * Definition for ListNode
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    /**
     * @param head: The head of linked list.
     * @param val: An integer.
     * @return: The head of new linked list.
     */
    public ListNode insertNode(ListNode head, int val) {
        // write your code here
        ListNode add = new ListNode(val);
        if(head == null)
            return add;
        
        ListNode root = head;
        ListNode prev = head;

        if(head.val >= val)
        {
            add.next = head;
            return add;
        }


        while(head != null && head.val < val)
        {
            prev = head;
            head = head.next;
        }
        

        ListNode temp = prev.next;
        prev.next = add;
        add.next = temp;

        return root;
    }
}
