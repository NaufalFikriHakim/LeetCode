import java.util.HashMap;

public class Solutions {
    public static void main(String[] args) {
        
    }
    
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] strings = s.split(" ");
        char[] chars = pattern.toCharArray();

        if (strings.length != chars.length) {
            return false;
        }

        for (int i = 0; i < chars.length; i++) {
            if (! map.containsKey(chars[i])) {
                if (! map.containsValue(strings[i])) {
                    map.put(chars[i], strings[i]);
                } else {
                    return false;
                }
            } else {
                if (!map.get(chars[i]).equals(strings[i])) {
                    return false;
                }
            }
        }
        return true;
    }
}
