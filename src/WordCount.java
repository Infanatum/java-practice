import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) throws FileNotFoundException {
        // open the file
        Scanner console = new Scanner(System.in);
        System.out.println("Specify the path to the file: ");
        String fileName = console.nextLine();
        Scanner input = new Scanner(new File(fileName));

        // count occurrences
        Map<String, Integer> wordCounts = new TreeMap<String, Integer>();
        while (input.hasNext()) {
            String next = input.next().toLowerCase();
            if (!wordCounts.containsKey(next)) {
                wordCounts.put(next, 1);
            } else {
                wordCounts.put(next, wordCounts.get(next) + 1);
            }
        }

        // report frequencies
        System.out.println("Total words = " + wordCounts.size());
        System.out.println("Enter minimum number of occurrences: ");
        int minNumber = console.nextInt();
        for (String word : wordCounts.keySet()) {
            int count = wordCounts.get(word);
            if (count >= minNumber) {
                System.out.println(count + "\t" + word);
            }
        }
    }
}
