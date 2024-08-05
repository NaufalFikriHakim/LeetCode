import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solutions {
    public static void main(String[] args) {

        String[] input = new String[]{"eat","tea","tan","ate","nat","bat"};

        groupAnagrams(input);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] temp = str.toCharArray();
            Arrays.sort(temp);

            String tempWord = new String(temp);

            if (! map.containsKey(tempWord)) {
                map.put(tempWord, new ArrayList<>());
            }  
            
            map.get(tempWord).add(str);
        }
        return new ArrayList<>(map.values());
    }    
}
