public class Solutions {
    public static void main(String[] args) {
        
    }   
    
    public boolean isSubsequence(String s, String t){
        if (s.length() != 0) {
            int pointer = 0;

            for (int i = 0; i < t.length(); i++) {
                if (pointer < s.length() && t.charAt(i) == s.charAt(pointer)) {
                    pointer++;
                }
            }
            return pointer == s.length();
        } else {
            return true;
        }
        
    }
}
