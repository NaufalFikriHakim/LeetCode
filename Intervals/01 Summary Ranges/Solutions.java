import java.util.ArrayList;
import java.util.List;

public class Solutions{
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,4,5,7};

        List<String> res = summaryRanges(nums);


    }

    public static List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < nums.length-1; i++) {
            if (res.size() <= index) {
                res.add(String.valueOf(nums[i]));
            } if (nums[i + 1] != nums[i] + 1) {
                if (Integer.valueOf(res.get(index)) != nums[i]) {
                    res.add(index, res.get(index) + "->" + nums[i]);
                    res.remove(++index);
                } else {
                    index++;
                }
            } 
        }

        if (nums[nums.length - 1] != nums[nums.length - 2] + 1 ) {
            res.add(String.valueOf(nums[nums.length-1]));
        } else {
            res.add(index, res.get(index) + "->" + nums[nums.length - 1]);
            res.remove(++index);
        }

        return res;
    }

}