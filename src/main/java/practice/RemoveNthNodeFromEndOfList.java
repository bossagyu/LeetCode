package practice;

import misc.ListNode;

public class RemoveNthNodeFromEndOfList {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    int crr = 0;
    int max_node = 0;
    ListNode dummyHead = new ListNode(0);
    ListNode ansNode = dummyHead;
    ListNode tmpNode = head;

    while(tmpNode != null) {
      tmpNode = tmpNode.next;
      max_node++;
    }

    while(head != null) {
      if(crr == max_node - n) {
        crr++;
        head = head.next;
        continue;
      }
      ansNode.next = new ListNode(head.val);
      ansNode = ansNode.next;
      head = head.next;
      crr++;
    }
    return dummyHead.next;

  }
}
