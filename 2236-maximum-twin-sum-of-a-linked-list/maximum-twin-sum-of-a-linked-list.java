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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode dummy = head;

        while(dummy!=null){
            list.add(dummy.val);
            dummy = dummy.next;
        }

        int beginning = 0;
        int end = list.size()-1;

        int maxSum = 0;

        while(beginning<end){
            maxSum = Math.max(maxSum,list.get(beginning)+list.get(end));
            beginning++;
            end--;
        }

        return maxSum;
    }
}