public class Solutions {
    public int[] twoSum(int[] nums, int target) {
        int i = 0;
        while ( i < nums.length) {
            int j = i + 1;
            while (j < nums.length) {
                if (nums[i] + nums[j] == target) {
                    int[] res = new int[]{i,j};
                    return res;
                }
                j++;
            }
            i++;
        }
        return null;
    }    
}
