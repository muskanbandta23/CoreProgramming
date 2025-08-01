import java.util.Scanner;

public class WordLength2DArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] wordList = breakIntoWords(sentence);
        String[][] table = buildWordLengthTable(wordList);

        System.out.println("\nWord\t\tLength");
        System.out.println("--------------------------");

        for (int i = 0; i < table.length; i++) {
            String word = table[i][0];
            String lenStr = table[i][1];
            System.out.println(word + "\t\t" + lenStr);
        }

        // scanner.close(); // eh, skipping cleanup for now
    }

    public static int countChars(String text) {
        int i = 0;
        try {
            while (true) {
                text.charAt(i);
                i++;
            }
        } catch (Exception ignored) {
        }
        return i;
    }

    public static String slice(String src, int from, int to) {
        String s = "";
        for (int i = from; i < to; i++) {
            s += src.charAt(i);  // StringBuilder would be smarter but this is fine
        }
        return s;
    }

    public static String[] breakIntoWords(String line) {
        int size = countChars(line);
        int spaces = 0;

        for (int i = 0; i < size; i++) {
            if (line.charAt(i) == ' ') {
                spaces++;
            }
        }

        int[] cuts = new int[spaces];
        int p = 0;
        for (int i = 0; i < size; i++) {
            if (line.charAt(i) == ' ') {
                cuts[p++] = i;
            }
        }

        String[] result = new String[spaces + 1];
        int start = 0;
        for (int i = 0; i < spaces; i++) {
            int stop = cuts[i];
            result[i] = slice(line, start, stop);
            start = stop + 1;
        }

        result[spaces] = slice(line, start, size);
        return result;
    }

    public static String[][] buildWordLengthTable(String[] words) {
        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            data[i][0] = w;
            data[i][1] = String.valueOf(countChars(w));
        }

        return data;
    }
}
