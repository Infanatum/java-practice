import java.util.Scanner;

public class CheckVowelOrConsonant {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any letter:");
        char lt = Character.toLowerCase(input.next().charAt(0));

        if (lt == 'a' || lt == 'e' || lt == 'i' || lt == 'o' || lt == 'u') {
            System.out.println(lt + " is a vowel");
        } else if (lt >= 'a' && lt <= 'z') {
            System.out.println(lt + " is a consonant");
        } else {
            System.out.println("Not a letter");
        }

        input.close();
    }
}
