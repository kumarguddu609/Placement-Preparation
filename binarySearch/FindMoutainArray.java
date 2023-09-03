//#1095
//https://leetcode.com/problems/find-in-mountain-array/
//
//
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int start =0;
        int end=mountainArr.length()-1;
        int peakIndex = peakElementIndex(mountainArr,start,end);
        int result = binarySearch(mountainArr, start, peakIndex, target);
        if(result==-1){
            start = peakIndex+1;
            result = binarySearch(mountainArr, start, end, target);
        }
        return result;
        
    }
    int peakElementIndex(MountainArray arr, int start, int end){
        while(start<end){
            int mid = start +(end-start)/2;
            if(arr.get(mid)<arr.get(mid+1)){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;
    }
    int binarySearch(MountainArray arr, int start, int end, int target){
        boolean isAsc = arr.get(start)<arr.get(end);
        while(start<=end){
            int mid = start +(end-start)/2;
            if(arr.get(mid)==target){
                return mid;
            }
            if(isAsc){
                if(arr.get(mid)>target){
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }else{
                if(arr.get(mid)>target){
                    start=mid+1;
                }
                else{
                    
                    end=mid-1;
                }
            }
        }   
      return -1;
    }
}
