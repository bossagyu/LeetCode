package practice;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {
  public boolean isValid(String s) {
    Deque<String> deque = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++) {
      switch (s.charAt(i)) {
        case '(':
          deque.push("(");
          break;
        case '{':
          deque.push("{");
          break;
        case '[':
          deque.push("[");
          break;
        case ')':
          if(deque.isEmpty()) { return false;}
          if (!deque.pop().equals("(")) {
            return false;
          }
          break;
        case '}':
          if(deque.isEmpty()) { return false;}
          if (!deque.pop().equals("{")) {
            return false;
          }
          break;
        case ']':
          if(deque.isEmpty()) { return false;}
          if (!deque.pop().equals("[")) {
            return false;
          }
          break;
      }
    }
    if(!deque.isEmpty()){
      return false;
    }
    return true;
  }
}
