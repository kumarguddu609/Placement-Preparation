#1802
//https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/
//
 
class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int left=index;
        int right=n-index-1;
        int high=maxSum;
        int low=1;
        long  result=0;
        while(low<=high){
            int mid= low+(high-low)/2;
            long  leftSum=0,rightSum=0;
            long  sum=0;
            long  el=mid-1;  //el=element_remaining
            leftSum=leftSum(left,el);
            rightSum=rightSum(right,el);
            sum=leftSum+rightSum+mid;
            if(sum<=maxSum){
                low=mid+1;
                result=mid;
            }else{
                high=mid-1;
            }

        }
        return (int)result;
    }
    long  leftSum(long  left, long  el){
        long  leftSum=0;
        if(left<=el){
            leftSum= el*(el+1)/2 - (el-left)*(el-left+1)/2;
        }else{
             leftSum= el*(el+1)/2 + (left-el);
        }
        return leftSum;
    }
    long  rightSum(long  right, long  el){
        long  rightSum=0;
        if(right<=el){
            rightSum= el*(el+1)/2 - (el-right)*(el-right+1)/2;
        }else{
             rightSum= el*(el+1)/2 + (right-el);
        }
        return rightSum;
    }
}
