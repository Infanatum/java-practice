public class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(checkPalindrome("level"));       // true
        System.out.println(checkPalindrome("hierarchy"));   // false
    }

    public static boolean checkPalindrome(String string) {
        int length = string.length();
        for (int i = 0; i < length / 2; i++) {
            if (string.charAt(i) != string.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
