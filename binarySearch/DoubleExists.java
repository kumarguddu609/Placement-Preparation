#1346
  //https://leetcode.com/problems/check-if-n-and-its-double-exist/description/
  //
  class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i = 0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              //if(arr[i]==2*arr[j]  && i != j) ---- for better solution beats 98%
                if(arr[i]==2*arr[j] || arr[j]==2*arr[i]){ 
                    return true;
                } 
            }
        }
     return false;   
    }
}
