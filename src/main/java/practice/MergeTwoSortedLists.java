package practice;

import misc.ListNode;

public class MergeTwoSortedLists {
  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummyHead = new ListNode(0);
    ListNode ansNode = dummyHead;

    while (list1 != null || list2 != null) {
      if(list1 != null && list2 != null) {
        if (list1.val < list2.val) {
          ansNode.next = new ListNode(list1.val);
          ansNode = ansNode.next;
          list1 = list1.next;
        } else {
          ansNode.next = new ListNode(list2.val);
          ansNode = ansNode.next;
          list2 = list2.next;
        }
      }
      else if(list1 != null) {
        ansNode.next = new ListNode(list1.val);
        ansNode = ansNode.next;
        list1 = list1.next;
      }
      else if(list2 != null) {
        ansNode.next = new ListNode(list2.val);
        ansNode = ansNode.next;
        list2 = list2.next;
      }
    }

    return dummyHead.next;

  }
}
