import java.util.Scanner;

public class ManualStringSplitter {
    public static int getStringSize(String str) {
        int len = 0;
        try {
            while (true) {
                str.charAt(len);
                len++;
            }
        } catch (Exception e) {

        }
        return len;
    }

    public static String[] customSplit(String line) {
        int len = getStringSize(line);
        int spaceCount = 0;

        for (int i = 0; i < len; i++) {
            if (line.charAt(i) == ' ') {
                spaceCount++;
            }
        }


        int[] spaceIndices = new int[spaceCount + 2];
        int idx = 1;
        spaceIndices[0] = -1;
        for (int i = 0; i < len; i++) {
            if (line.charAt(i) == ' ') {
                spaceIndices[idx++] = i;
            }
        }
        spaceIndices[spaceCount + 1] = len;

        String[] words = new String[spaceCount + 1];
        for (int j = 0; j < words.length; j++) {
            int start = spaceIndices[j] + 1;
            int end = spaceIndices[j + 1];
            String word = "";

            for (int k = start; k < end; k++) {
                word += line.charAt(k);
            }

            words[j] = word;
        }

        return words;
    }

    public static boolean areWordsSame(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter some text: ");
        String text = input.nextLine();

        String[] manualWords = customSplit(text);

        //built-in split
        String[] builtinWords = text.split(" ");

        boolean isSame = areWordsSame(manualWords, builtinWords);

        System.out.println("\nWords from custom split:");
        for (String word : manualWords) {
            System.out.println(word);
        }
        System.out.println("\nWords from built-in split:");
        for (String word : builtinWords) {
            System.out.println(word);
        }
        System.out.println("\nMatch result: " + (isSame ? "Same" : "Different"));

    }
}
