//#852
//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left=0,right=arr.length-1;
        int result=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]<arr[mid+1]){
                left=mid+1;
                result=mid+1;
            }
            else{
                right=mid-1;
                result=mid;
            }
           
        }
       return result;
    }
}
