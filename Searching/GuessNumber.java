//#374
//https://leetcode.com/problems/guess-number-higher-or-lower/
//
/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */
//Time limit Exceeded
public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1;     
        while(start<=n){
        int isPick = guess(n);
            if(isPick==-1){
                n=n-1;
            }
            else if(isPick==0){
                return n;
            }
            else{
                start+=1;
            }
        }
        return 0;
    }
}

//Better Solution using binary search


public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1; 
        int end=n; 
        while(start<=end){
             int mid=start+(end-start)/2;   
            int isPick = guess(mid);
                 if(isPick==-1){
                    end=mid-1;
                 }
                else if(isPick==0){
                    return mid;
                }
                else{
                 start=mid+1;
                }

        }
        return -1;
    }
}
