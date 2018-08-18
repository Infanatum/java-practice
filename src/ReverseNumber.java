public class ReverseNumber {
    public static void main(String[] args) {
        int num = 123456789, reversed = 0;
        for (; num != 0; num /= 10) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}