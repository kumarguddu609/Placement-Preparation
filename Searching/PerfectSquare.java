//#367
//https://leetcode.com/problems/valid-perfect-square/
//
class Solution {
    public boolean isPerfectSquare(int num) {
        int start=1, end=num;
        while(start<=end){
            int mid= start+(end-start)/2;
            if((long)mid*mid>num){
                end=mid-1;
            }
            else if((long)mid*mid==num){
                return true;
            }else{
                start=mid+1;
            }
        }
        return false;
    }
}
