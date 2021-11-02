package practice;

public class LongestSubstring {
  public int lengthOfLongestSubstring(String s) {
    String[] strArray = s.split("");
    String maxStr = "";
    int maxNum = 0;
    String tmpStr = "";
    int tmpNum = 0;

    for(String str : strArray) {
      if(str.isEmpty()) {
        break;
      }

      if(!tmpStr.contains(str)) {
        tmpNum++;
        tmpStr = tmpStr + str;
      } else {
        if(maxNum < tmpNum) {
          maxNum = tmpNum;
        }
        tmpStr = genSubStr(tmpStr, str);
        tmpNum = tmpStr.length();
      }
    }

    if(maxNum < tmpNum) {
      maxNum = tmpNum;
    }

    return maxNum;
  }

  public String genSubStr(String tmpStr, String t) {
    String[] strArray = tmpStr.split("");
    String returnStr = "";
    boolean flag = false;
    for(String str : strArray) {
      if(str.equals(t)) {
        flag = true;
        continue;
      }
      if(flag){
        returnStr = returnStr + str;
      }
    }
    return returnStr + t;
  }
}
