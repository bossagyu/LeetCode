package practice;

import misc.ListNode;

public class SwapNodesInPairs {
  public ListNode swapPairs(ListNode head) {
    int crr = 0;
    ListNode dummyHead = new ListNode(0);
    ListNode ansNode = dummyHead;
    ListNode prevNode = head;

    while(head != null) {
      if(crr % 2 == 0) {
        prevNode = head;
        head = head.next;
        if(head == null) {
          ansNode.next = new ListNode(prevNode.val);
          break;
        }
        ansNode.next = new ListNode(head.val);
      }
      else{
        ansNode.next = new ListNode(prevNode.val);
        head = head.next;
      }
      ansNode = ansNode.next;
      crr++;
    }

    return dummyHead.next;
  }
}
