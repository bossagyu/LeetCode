package practice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
  public int romanToInt(String s) {
    int ans = 0;

    for(int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'M') {
        ans = ans + 1000;
      }
      if (s.charAt(i) == 'D') {
        ans = ans + 500;
      }
      if (s.charAt(i) == 'C') {
        if (s.length() > i + 1 && s.charAt(i + 1) == 'M') {
          ans = ans - 100;
        } else if (s.length() > i + 1 && s.charAt(i + 1) == 'D') {
          ans = ans - 100;
        } else {
          ans = ans + 100;
        }
      }

      if (s.charAt(i) == 'L') {
        ans = ans + 50;
      }
      if (s.charAt(i) == 'X') {
        if (s.length() > i + 1 && s.charAt(i + 1) == 'C') {
          ans = ans - 10;
        } else if (s.length() > i + 1 && s.charAt(i + 1) == 'L') {
          ans = ans - 10;
        } else {
          ans = ans + 10;
        }
      }

      if (s.charAt(i) == 'V') {
        ans = ans + 5;
      }
      if (s.charAt(i) == 'I') {
        if (s.length() > i + 1 && s.charAt(i + 1) == 'V') {
          ans = ans - 1;
        } else if (s.length() > i + 1 && s.charAt(i + 1) == 'X') {
          ans = ans - 1;
        } else {
          ans = ans + 1;
        }
      }
    }
    return ans;
  }
}
