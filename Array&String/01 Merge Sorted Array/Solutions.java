// Problem = https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150

// Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
// Output: [1,2,2,3,5,6]
// Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
// The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

import java.util.*;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m+n];
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < m) {
            while (pointer2 < n) {
                
            }
        }
    }

    public static void main(String[] args) {
        
    }
}

// dia compare element di pointer 1 dan 2
// klo pointer 2 lebih tinggi, dia add ke res, 