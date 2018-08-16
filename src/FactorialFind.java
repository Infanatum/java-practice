import java.util.Scanner;

public class FactorialFind {
    public static void main(String[] args) {
        int factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        boolean hasAnInt = input.hasNextInt();
        if (hasAnInt) {
            int counter = input.nextInt();
            System.out.println("FactorialFind: " + counter + " ! = ");
            while (counter > 0) {
                factorial *= counter--;
            }
            System.out.print(factorial);
        } else {
            System.out.println("The value you entered is not valid");
        }
    }
}