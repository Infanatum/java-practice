import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the letter:");
        char lt = Character.toLowerCase(input.next().charAt(0));
        if (lt == 'a' || lt == 'e' || lt == 'i' || lt == 'o' || lt == 'u') {
            System.out.println("Entered letter " + lt + " is vowel");
        } else if (lt >= 'a' && lt <= 'z') {
            System.out.println("Entered character " + lt + " is consonant");
        } else
            System.out.println("Not a letter from the alphabet");
    }
}
