public class ReverseString {
    String reverse = "";

    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        System.out.println("Result: " + rs.reverseString("Java Reverse String"));    // gnirtS esreveR avaJ
    }

    public String reverseString(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            reverse += str.charAt(str.length() - 1)
                    + reverseString(str.substring(0, str.length() - 1));
            return reverse;
        }
    }
}
