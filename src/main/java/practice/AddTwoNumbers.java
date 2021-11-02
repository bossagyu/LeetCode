package practice;

import misc.ListNode;

public class AddTwoNumbers {
  public ListNode addNumbers(ListNode l1, ListNode l2) {
    int s = 0; // 繰り上がり
    int v = 0; // 現在値
    ListNode dummyHead = new ListNode(0);
    ListNode ansNode = dummyHead;
    while (l1 != null || l2 != null) {
      int x = (l1 != null) ? l1.val : 0;
      int y = (l2 != null) ? l2.val : 0;

      v = (x + y + s) % 10;
      s = (x + y + s) / 10;

      ansNode.next = new ListNode(v);
      ansNode = ansNode.next;

      if(l1 != null){
        l1 = l1.next;
      }
      if(l2 != null){
        l2 = l2.next;
      }
    }
    if(s != 0){
      ansNode.next = new ListNode(s);
    }
    return dummyHead.next;
  }
}