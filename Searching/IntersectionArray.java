//#349
//https://leetcode.com/problems/intersection-of-two-arrays/
////
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> intersection = new ArrayList<>();
        
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                if (num1 == num2 && !intersection.contains(num1)) {
                    intersection.add(num1);
                    break; // Break the inner loop after finding a match
                }
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++) {
            result[i] = intersection.get(i);
        }

        return result;
    }
}
