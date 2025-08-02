
import java.util.*;
public class ExtraStringOperations{

    // Count vowels and consonants
    static void countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels + ", Consonants: " + consonants);
    }

    // Reverse a string manually
    static String reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        return rev;
    }

    // Check for palindrome
    static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--))
                return false;
        }
        return true;
    }

    // Remove duplicate characters from string
    static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();
        Set<Character> seen = new HashSet<>();
        for (char ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }
        return result.toString();
    }

    // Find the longest word in a sentence
    static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length())
                longest = word;
        }
        return longest;
    }

    // Count occurrences of a substring
    static int countSubstringOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    // Toggle the case of each character
    static String toggleCase(String str) {
        StringBuilder toggled = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch))
                toggled.append(Character.toLowerCase(ch));
            else if (Character.isLowerCase(ch))
                toggled.append(Character.toUpperCase(ch));
            else
                toggled.append(ch);
        }
        return toggled.toString();
    }

    // Compare two strings lexicographically without built-in compareTo
    static void compareStrings(String str1, String str2) {
        int len = Math.min(str1.length(), str2.length());
        for (int i = 0; i < len; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                System.out.println(str1 + " comes before " + str2);
                return;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                System.out.println(str2 + " comes before " + str1);
                return;
            }
        }
        if (str1.length() == str2.length())
            System.out.println("Both strings are equal");
        else if (str1.length() < str2.length())
            System.out.println(str1 + " comes before " + str2);
        else
            System.out.println(str2 + " comes before " + str1);
    }

    // Find the most frequent character
    static char mostFrequentChar(String str) {
        int[] freq = new int[256];
        for (char ch : str.toCharArray())
            freq[ch]++;
        int maxFreq = 0;
        char result = ' ';
        for (char ch : str.toCharArray()) {
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                result = ch;
            }
        }
        return result;
    }

    // Remove a specific character from a string
    static String removeCharacter(String str, char chToRemove) {
        StringBuilder result = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch != chToRemove)
                result.append(ch);
        }
        return result.toString();
    }

    // Check if two strings are anagrams
    static boolean areAnagrams(String str1, String str2) {
        char[] arr1 = str1.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = str2.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    // Replace a word with another word in a sentence
    static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replaceAll("\\b" + oldWord + "\\b", newWord);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        countVowelsAndConsonants("Hello World");
        System.out.println("Reversed: " + reverseString("Muskan"));
        System.out.println("Is Palindrome: " + isPalindrome("madam"));
        System.out.println("Without Duplicates: " + removeDuplicates("programming"));
        System.out.println("Longest Word: " + findLongestWord("Java is very powerful"));
        System.out.println("Substring Count: " + countSubstringOccurrences("ababababa", "aba"));
        System.out.println("Toggle Case: " + toggleCase("HeLLo"));
        compareStrings("apple", "banana");
        System.out.println("Most Frequent Char: " + mostFrequentChar("success"));
        System.out.println("After Removing 'l': " + removeCharacter("Hello World", 'l'));
        System.out.println("Are Anagrams: " + areAnagrams("listen", "silent"));
        System.out.println("Replaced Sentence: " + replaceWord("I love Java", "Java", "Python"));
    }
}
