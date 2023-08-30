//#69
  //https://leetcode.com/problems/sqrtx/
  //
  class Solution {
    public int mySqrt(int x) {
        int sqrt=0;
        for(int i=1;i<=x;i+=2){
            if(x-i>=0){
                sqrt++;
            }
            x=x-i;
        }
        return sqrt;
    }
}
