// Problem = https://leetcode.com/problems/merge-sorted-array/?envType=study-plan-v2&envId=top-interview-150
class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m + n -1;
        m--;
        n--;

        while (length >= 0) {
            if (m != -1 && n != -1) {
                if (nums1[m] > nums2[n]) {
                    nums1[length] = nums1[m];
                    m--;
                } else {
                    nums1[length] = nums2[n];
                    n--;
                }
            } else if (m != -1){
                nums1[length] = nums1[m];
                m--;
            } else {
                nums1[length] = nums2[n];
                n--;
            }
            length--;
        }
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,0,0,0};
        int[] nums2 = new int[]{2,5,6};
        int m = 3;
        int n = 3;
        
        merge(nums1, m, nums2, n);
        printArray(nums1);
    }

    public static void printArray(int[] nums){
        for (int i : nums) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}

// dia compare element di pointer 1 dan 2
// klo pointer 2 lebih kecil, dia add ke res, pointer ++, break
// klo pointer lebih kecil, dia add ke res, pointer ++