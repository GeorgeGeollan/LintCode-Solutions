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
     * @param head: The first node of linked list
     * @param n: the start index
     * @param m: the end node
     * @return: A ListNode
     */
    public ListNode deleteNode(ListNode head, int n, int m) {
        // Write your code here
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        dummy.next = head;

        for(int i = 0; i < n; i++)
            ptr = ptr.next;

        for(int i = 0; i < m; i++)
        {
            head = head.next;
        }

        ListNode tmp = head.next;
        ptr.next = tmp;

        return dummy.next;
    }
}
