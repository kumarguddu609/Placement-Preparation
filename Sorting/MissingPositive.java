//#41
//https://leetcode.com/problems/first-missing-positive/
//
//
class Solution {
  public int firstMissingPositive(int[] nums) {
    int i = 0;
    boolean sorted = isSortedArray(nums);
    if (sorted) {
      for (int index = 0; index < nums.length; index++) {
        if (nums[index] != index + 1) {
          return index + 1;
        }
      }
    }
    while (i < nums.length) {
      if (nums[i] <= 0) {
        i++;
        continue;
      }
      int correct = nums[i] - 1;
      if (nums[i] != nums[correct]) {
        swap(nums, i, correct);
      } else {
        i++;
      }
    }

    for (int index = 0; index < nums.length; index++) {
      if (nums[index] != index + 1) {
        return index + 1;
      }
    }
    return -1;
  }

  boolean isSortedArray(int[] array) {
    if (array.length == 1 || array.length == 0)
      return true;
    for (int i = 1; i < array.length; i++) {
      if (array[i] < array[i - 1])
        return false;
    }
    return true;
  }

void swap(int[] arr, int f, int s) {
    int temp = arr[f];
    arr[f] = arr[s];
    arr[s] = temp;
  }
}
