package practice;

public class LongestPalindromicSubstringAnswer {
  public String longestPalindrome(String s) {
    int n = s.length();
    boolean table[][] = new boolean[n][n];
    int maxnum = 1;
    String maxstr = s.substring(0,1);

    for(int i = 0; i < n; i++) {
      table[i][i] = true;
    }
    for (int i = 0; i < n-1; i++) {
      if(s.charAt(i) == s.charAt(i+1)) {
        table[i][i+1] = true;
          if(maxnum < 2) {
            maxnum = 2;
            maxstr = s.substring(i,i+2);
        }
      }
    }
    System.out.println(table);

    for(int k = 3; k <= n; k++ ) {
      for(int i = 0; i + k <= n; i++) {
        int j = i + k - 1;
        if(table[i+1][j-1] == true && s.charAt(i) == s.charAt(j)) {
          table[i][j] = true;

          if (k > maxnum) {
            maxstr = s.substring(i, i+k);
            maxnum = k;
          }
        }
      }
    }

    return maxstr;
  }

}
