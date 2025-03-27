import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Step 1: Merge the two arrays
        int[] merged = mergeArrays(nums1, nums2);
        
        // Step 2: Sort the merged array
        Arrays.sort(merged);
        
        // Step 3: Find the median
        int m = merged.length / 2;
        
        if (merged.length % 2 != 0) {
            // If the length is odd, return the middle element
            return merged[m];
        } else {
            // If the length is even, return the average of the two middle elements
            return (merged[m - 1] + merged[m]) / 2.0;  // Cast to double for decimal result
        }
    }

    // Method to merge two arrays
    public int[] mergeArrays(int[] arr1, int[] arr2) {
        int[] mergedArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergedArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedArray, arr1.length, arr2.length);
        return mergedArray;
    }
}
