import java.util.Scanner;

public class FindFactorial {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number:");
        boolean hasAnInt = input.hasNextInt();

        if (hasAnInt) {
            int counter = input.nextInt();
            System.out.print(counter + "! = ");
            while (counter > 0) {
                factorial *= counter--;
            }
            System.out.print(factorial);
        } else {
            System.out.println("The value you entered is not valid");
        }

        input.close();
    }
}