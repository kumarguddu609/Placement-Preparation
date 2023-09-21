//#
//https://leetcode.com/problems/valid-palindrome-ii/
//
//
//
class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        if(n == 1){
            return true;
        }
        if(isPalin(s))return true;
        
        int i = 0;
        int j = s.length()-1;
        
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                break;
            }
            i++;
            j--;
        }
        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(s);
        
        sb.deleteCharAt(i);
        sb2.deleteCharAt(j);
        
        return isPalin(sb.toString()) ||isPalin(sb2.toString());


    }
    
    private boolean isPalin(String s){
        
        int i = 0;
        int j = s.length()-1;
        
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}





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
