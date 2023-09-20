//#
//
//
//
//
//Input size is less
class Solution {
  public static boolean validPalindrome(String s) {
    StringBuilder sb1 = new StringBuilder();
    boolean ans = false;
    sb1.append(s);
    if (palindrome(sb1)) {
      return true;
    }
    for (int i = 0; i < sb1.length(); i++) {
      char temp = sb1.charAt(i);
      sb1.deleteCharAt(i);
      ans = palindrome(sb1);
      sb1.insert(i, temp);
      if (ans) {
        return true;
      } else {
        continue;
      }
    }
    return ans;
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
    //String s = "abac";
    //System.out.println(validPalindrome(s));
  //}
}
