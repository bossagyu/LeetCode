package practice;

public class LongestCommonPrefix {
  public String longestCommonPrefix(String[] strs) {
    String ans = "";
    int count = 0;
    char tmpChar;
    Boolean flag = true;

    while(flag) {
      try {
        tmpChar = strs[0].charAt(count);
      } catch (Exception ex) {
        return ans;
      }
      for(int i = 1; i < strs.length; i++) {
        if(count >= strs[i].length()) {
          flag = false;
          break;
        }
        if(tmpChar != strs[i].charAt(count)) {
          flag = false;
          break;
        }
      }
      if(flag) {
        ans = ans + tmpChar;
        count++;
      }
    }
    return ans;
  }
}
