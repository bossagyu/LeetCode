package practice;

public class ZigzagConversion {
  public String convert(String s, int numRows) {
    String resultStr = "";

    // 1の場合はinputをそのまま返却
    if(numRows == 1) {
      return s;
    }


    for(int m = 0; m < numRows; m++) {
      for(int r = 0;;r++) {
        if(m == 0 || m == numRows-1) {
          if(m+2*r*(numRows-1) >= s.length()) {break;}
          resultStr = resultStr + s.charAt(m+2*r*(numRows-1));
          if(resultStr.length() >= s.length() ) { break; }
        }
        else {
          if(m+2*r*(numRows-1) >= s.length()) {break;}
          resultStr = resultStr + s.charAt(m+2*r*(numRows-1));
          if(2*(numRows-1)-m+2*r*(numRows-1) >= s.length()) { break; }
          resultStr = resultStr + s.charAt(2*(numRows-1)-m+2*r*(numRows-1));
        }
      }
    }
    return resultStr;
  }
}
