import java.util.HashMap;

public class Solutions {
    public static void main(String[] args) {
        boolean result = isHappy(19);
    }
    
    public static boolean isHappy(int n){
        HashMap<Integer, Integer> map = new HashMap<>();
        while (!map.containsKey(n)) {
            String number = String.valueOf(n);
        
            char[] numbers = number.toCharArray();
            int total = 0;
            for (char c : numbers) {
                total += Math.pow(c - '0', 2);
            } 

            if (total == 1) {
                return true;
            }

            map.put(n, total);
            n = total;
        }
        return false;
    }    
}
