//#1832
//https://leetcode.com/problems/check-if-the-sentence-is-pangram/
public boolean checkIfPangram(String sentence) {
    // Create an integer array of size 26 to represent the frequency of each alphabet.
    int[] arr = new int[26];
    
    // Loop through each character in the input sentence.
    for (var i : sentence.toCharArray()) {
        // Increment the corresponding index in the 'arr' array.
        // By subtracting 'a', we map characters 'a' to 'z' to indices 0 to 25.
        arr[i - 'a']++;
    }
    
    // Check if any index in the 'arr' array is zero.
    for (var i : arr) {
        if (i == 0)
            return false; // If any character is missing, return false.
    }
    
    return true; // If all characters are present, return true (it's a pangram).
}
