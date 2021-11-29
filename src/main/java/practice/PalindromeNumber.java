package practice;

public class PalindromeNumber {
  public boolean isPalindrome(int x) {
    if(x < 0) {
      return false;
    }

    int valLen = String.valueOf(x).length();
    String val = String.valueOf(x);

    for(int i = 0 ; i <= valLen / 2; i++) {
      if(i % 2 == 0 && i >= valLen / 2) {
        return true;
      }
      if(i % 2 == 1 && i > valLen / 2 - 1){
        return true;
      }
      int head = val.charAt(i);
      int tail = val.charAt(valLen-i-1);

      if(head != tail) {
        return false;
      }
    }

    return true;
  }
}
