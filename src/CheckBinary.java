public class CheckBinary {
    public static void main(String[] args) {
        CheckBinary checkBinary = new CheckBinary();
        System.out.println("Is 1100001 binary? Answer: " + checkBinary.isBinaryNum(1100001));
        System.out.println("Is 10500111 binary? Answer: " + checkBinary.isBinaryNum(10500111));
    }

    public boolean isBinaryNum(int binary) {
        boolean status = true;
        while (true) {
            if (binary == 0) {
                break;
            } else {
                int tmp = binary % 10;
                if (tmp > 1) {
                    status = false;
                    break;
                }
                binary = binary / 10;
            }
        }
        return status;
    }
}
