package practice;

import misc.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
  @Test
  public void addTest(){
    ListNode l1_2 = new ListNode(3);
    ListNode l1_1 = new ListNode(4, l1_2);
    ListNode l1_0 = new ListNode(2,l1_1);

    ListNode l2_2 = new ListNode(4);
    ListNode l2_1 = new ListNode(6, l2_2);
    ListNode l2_0 = new ListNode(5,l2_1);

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
    ListNode ans_0 = addTwoNumbers.addNumbers(l1_0, l2_0);
    ListNode ans_1 = ans_0.next;
    ListNode ans_2 = ans_1.next;

    assertAll("check LintNode",
        () -> assertEquals(7, ans_0.val),
        () -> assertEquals(0, ans_1.val),
        () -> assertEquals(8, ans_2.val)
    );
  }

}