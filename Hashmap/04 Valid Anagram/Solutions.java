import java.util.HashMap;

public class Solutions {
    public static void main(String[] args) {
        
    }   

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        if (s.length() != t.length()) {
            return false;
        }

        for (char ch : s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        for (char ch : t.toCharArray()) {
            
            if (!map.containsKey(ch)) {
                return false;
            }

            if (map.get(ch) - 1 == -1) {
                return false;
            } else {
                map.put(ch, map.get(ch) - 1);
            }
        }
        
        return true;
    }
}
