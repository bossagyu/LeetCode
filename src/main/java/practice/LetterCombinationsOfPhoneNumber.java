package practice;

import java.util.*;

public class LetterCombinationsOfPhoneNumber {
  public List<String> letterCombinations(String digits) {
    List<String> ans = new ArrayList<>();
    Map<String, String[]> map = new HashMap<>();
    if(digits.length() == 0) {
      return Collections.emptyList();
    }

    map.put("2", new String[]{"a", "b", "c"});
    map.put("3", new String[]{"d", "e", "f"});
    map.put("4", new String[]{"g", "h", "i"});
    map.put("5", new String[]{"j", "k", "l"});
    map.put("6", new String[]{"m", "n", "o"});
    map.put("7", new String[]{"p", "q", "r", "s"});
    map.put("8", new String[]{"t", "u", "v"});
    map.put("9", new String[]{"w", "x", "y", "z"});

    Queue<String> q = new LinkedList<>();
    q.add("");

    while (!q.isEmpty()) {
      String s = q.remove();

      if (s.length() == digits.length()) {
        ans.add(s);
      } else {
        String[] tmpStr = map.get(String.valueOf(digits.charAt(s.length())));
        for (int i = 0; i < tmpStr.length; i++) {
          q.add(s + tmpStr[i]);
        }
      }
    }
    return ans;
  }
}