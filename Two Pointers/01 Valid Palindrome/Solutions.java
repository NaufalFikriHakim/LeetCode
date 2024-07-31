public class Solutions {
    public static void main(String[] args) {
        
    }

    public static boolean isPalindrome(String s){

        String input = s.toLowerCase();
        int pointer1 = 0;
        int pointer2 = s.length() - 1;

        while (pointer1 <= pointer2) {
            if (!Character.isLetterOrDigit(input.charAt(pointer1))) {
                pointer1++;
            } else if (!Character.isLetterOrDigit(input.charAt(pointer2))) {
                pointer2--;
            } else {
                if (input.charAt(pointer2) != input.charAt(pointer1)) {
                    return false;
                }
                pointer1++;
                pointer2--;
            }
        }
        
        return true;
    }
}
