class Solutions {
    public static void main(String[] args) {
        int[] nums = new int[]{3,2,2,3};
        int val = 2;

        System.out.println(removeElement(nums, val));
    }

    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    public static void debugIntArray(int[] array){
        for (int i : array) {
            System.out.print(i + ",");
        }
        System.out.println();
    }
}

// bisa pake two pointer
// pointer pertama bisa nyari dari awal sampe nemu angka x
// pointer kedua bisa nyari dari akhir sampe angka bukan x
// kalo udah sama2 nemu, bisa di switch
// bisa berakhir kalo value dari pointer sama atau bisa kalo pointer kedua jadi lebih kecil dari pointer pertama

// kalo case valuenya cuma 1

