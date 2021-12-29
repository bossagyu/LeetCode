package practice;

import misc.ListNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
  MergeTwoSortedLists mergeTwoSortedLists;

  @BeforeEach
  public void init() {
    this.mergeTwoSortedLists = new MergeTwoSortedLists();
  }

  @Test
  public void Test1() {
    ListNode l1_2 = new ListNode(4);
    ListNode l1_1 = new ListNode(2, l1_2);
    ListNode l1_0 = new ListNode(1,l1_1);
    
    ListNode l2_2 = new ListNode(4);
    ListNode l2_1 = new ListNode(3, l2_2);
    ListNode l2_0 = new ListNode(1,l2_1);
        
        
    ListNode ans0 = mergeTwoSortedLists.mergeTwoLists(l1_0, l2_0);
    ListNode ans1 = ans0.next;
    ListNode ans2 = ans1.next;
    ListNode ans3 = ans2.next;
    ListNode ans4 = ans3.next;
    ListNode ans5 = ans4.next;
    
    assertAll("check ListNode",
        () -> assertEquals(1,ans0.val),
        () -> assertEquals(1,ans1.val),
        () -> assertEquals(2,ans2.val),
        () -> assertEquals(3,ans3.val),
        () -> assertEquals(4,ans4.val),
        () -> assertEquals(4,ans5.val)
        );
  }

}