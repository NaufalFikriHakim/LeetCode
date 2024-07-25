import java.util.HashMap;

class Solutions {
    public static void main(String[] args) {
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int res = 0;
        int major = 0;

        for (int i : nums) {
            hash.put(i, hash.getOrDefault(i, 0) + 1);
            if (hash.get(i) > major) {
                res = i;
                major = hash.get(i);
            }
        }
        return res;
    }
}