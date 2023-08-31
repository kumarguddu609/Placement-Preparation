//#744
  //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
//
  class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int start=0, end=letters.length-1;
        char result = letters[0];     
        while(start<=end){
            int mid=start+(end-start)/2;
            if(letters[mid]<=target){
                start=mid+1;
            }
            else {
                result=letters[mid];
                end=mid-1;
            }
            
        }
        return result;
    }
}
