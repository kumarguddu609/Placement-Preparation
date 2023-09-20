//#125
//https://leetcode.com/problems/valid-palindrome/description/
//
//
//
//
class Solution {
  public static boolean isPalindrome(String s) {
    StringBuilder sb = new StringBuilder();
    boolean space = false;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == (' ')) {
        space = true;
      } else {
        space = false;
        break;
      }
    }
    if (space) {
      return true;
    }
    String s1 = s.toLowerCase();
    for (int i = 0; i < s1.length(); i++) {
      if (s1.charAt(i) <= 122 && s1.charAt(i) >= 97 || s1.charAt(i) <= 57 && s1.charAt(i) >= 48) {
        sb.append(s1.charAt(i));
      } else {
        continue;
      }
    }

    return palindrome(sb);
  }

  static boolean palindrome(StringBuilder s) {
    int start = 0;
    int end = s.length() - 1;
    if (end <= 0) {
      return true;
    }
    while ((end >= start)) {
      if (s.charAt(start) == s.charAt(end)) {
        start++;
        end--;
      } else {
        return false;
      }
    }
    return true;
  }

  //public static void main(String[] args) {
    //String s = "0P";
    //System.out.println(isPalindrome(s));
  //}
}
