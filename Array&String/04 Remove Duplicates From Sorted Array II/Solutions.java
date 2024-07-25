public class Solutions {
    public static void main(String[] args) {

        int[] nums = new int[]{1,1,1,2,2,3};
        int[] nums = new int[]{1,1,2,2,3,3};
        
    }

    public int removeDuplicates(int[] nums) {

        if (nums.length < 3) {

            return nums.length;

        } else {

            int pointer = 2;

            for (int i = 2; i < nums.length; i++) {
                if (nums[i] > nums[pointer-2]) {
                    nums[pointer++] = nums[i];
                } 
            }

            return pointer;
        }
        

    }
}

// dicek sama index kedua sebelum index dia
// kalo sama update increase
// kalo beda biarin