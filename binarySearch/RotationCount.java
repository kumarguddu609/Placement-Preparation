//
//https://practice.geeksforgeeks.org/problems/rotation4723/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article
//
class Solution {
    int findKRotation(int arr[], int n) {
        int pivot = findPivot(arr);
        return pivot+1;
        
    }
    int findPivot(int arr[]){
        int start=0;
        int end= arr.length-1;
        while(start<end){
            int mid = start + (end-start)/2;
            if(mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[mid]<=arr[start]){
                end = mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
}
