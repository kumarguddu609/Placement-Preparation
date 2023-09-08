#754
  //https://leetcode.com/problems/reach-a-number/
  //
  class Solution {
    public int reachNumber(int target) {
        // Handle negative targets by converting them to positive
        target = target>=0 ? target : -1*target;
        
        int i = 1;
        int pos = 0;
        
        while (true) {
            pos += i;
            
            // If the current position is greater than or equal to the target,
            // and the difference between the current position and the target is even,
            // we can reach the target in 'i' steps.
            if (pos >= target && (pos - target) % 2 == 0) {
                return i;
            }
            
            i++;
        }
    }
}
//
//
class Solution {
    public int reachNumber(int target) {
        // Handle negative targets by converting them to positive
        target = Math.abs(target);
        
        // Calculate the minimum 'n' such that n * (n + 1) / 2 >= target
        int n = (int) Math.ceil((-1.0 + Math.sqrt(1 + 8.0 * target)) / 2.0);
        int sum = n * (n + 1) / 2;
        
        
        if (sum == target) {
            return n;
        }
        
        if ((sum - target) % 2 == 0) {
            return n;
        } else {
            return n + (n % 2 == 0 ? 1 : 2);
        }
    }
}
