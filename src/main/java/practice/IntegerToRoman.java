package practice;

public class IntegerToRoman {
  public String intToRoman(int num) {
    String ans = "";
    String[] one = {"", "I", "II", "III", "IV",
        "V", "VI", "VII", "VIII", "IX"};
    String[] ten = {"", "X", "XX", "XXX", "XL",
        "L", "LX", "LXX", "LXXX", "XC" };
    String[] hun = { "",  "C",  "CC",  "CCC",  "CD",
        "D", "DC", "DCC", "DCCC", "CM" };
    String[] sou = {"", "M", "MM", "MMM"};

    ans = ans + sou[num / 1000];
    num = num % 1000;
    ans = ans + hun[num / 100];
    num = num % 100;
    ans = ans + ten[num / 10];
    num = num % 10;
    ans = ans + one[num];

    return ans;
  }
}
