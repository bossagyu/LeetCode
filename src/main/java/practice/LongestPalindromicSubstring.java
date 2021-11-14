package practice;

public class LongestPalindromicSubstring {
  public String longestPalindrome(String s) {
    Character currentChar;
    int maxNum = -1;
    String maxString = "";
    String tmpString;

    for (int i = 0; i < s.length(); i++) {
      currentChar = s.charAt(i);
      for(int j = i; j < s.length(); j++) {
        if(currentChar.equals(s.charAt(j)) && j+1-i > maxNum) {
          tmpString = s.substring(i,j+1);
          StringBuilder sb = new StringBuilder();
          sb.append(tmpString);
          sb.reverse();
          if(tmpString.equals(sb.toString())){
            maxString = tmpString;
            maxNum = tmpString.length();
          }
        }
      }

    }
    return maxString;
  }
}
