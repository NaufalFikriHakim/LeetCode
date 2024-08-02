import java.util.HashMap;

public class Solutions {
    public boolean canConstruct(String ransomNote, String magazine){

        HashMap<Character, Integer> map = new HashMap();

        for (char ch : magazine.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }


        for (char ch : ransomNote.toCharArray()) {
            if (map.containsKey(ch)) {
                if (map.get(ch) > 0) {
                    map.put(ch, map.get(ch) - 1);
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }
    
}
