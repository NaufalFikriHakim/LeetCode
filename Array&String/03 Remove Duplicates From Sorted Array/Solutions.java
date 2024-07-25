public class Solutions {
    
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length > 1) {
            int count = 1;

            for (int i = 1; i < nums.length; i++) {

                if (nums[i] > nums[count - 1]) {
                    nums[count++] = nums[i];
                }
            }

            return count;
        } else {
            return nums.length;
        }
        


    }


}

// kalo misal yang diiterate lebih besar daripada max, update di index count + 1