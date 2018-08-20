public class FindFactorialRecursion {
    public static void main(String[] args) {
        int factorial = factorial(5);
        System.out.println(factorial);
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
