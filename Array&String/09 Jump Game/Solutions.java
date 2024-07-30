public class Solutions {
    public static void main(String[] args) {
        
    }

    public boolean canJump(int[] nums){

        int end = nums.length - 1;
        
        for (int i = nums.length - 2; i >= 0; i--) {
            if (end <= i + nums[i]) {
                end = i;
            }
        }

        return end == 0;
    }
}
