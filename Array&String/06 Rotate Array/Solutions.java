public class Solutions {
    public static void main(String[] args) {
        System.out.println();
        int nums[] = new int[]{1,2};
        rotate(nums, 2);
    }

    public static void rotate(int[] nums, int k) {
        // k = jumlah rotate

        k = k % nums.length;
        int[] temp = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            temp[(i + k)%nums.length] = nums[i];
        }

        for (int i = 0; i < temp.length; i++) {
            nums[i] = temp[i];
        }



        
    }

    public static void debugIntArray(int[] array){
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}