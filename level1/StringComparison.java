import java.util.Scanner;

public class StringComparison {

    public static boolean compareUsingCharAt(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();
        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean charAtComparison = compareUsingCharAt(str1, str2);
        boolean builtInEquals = str1.equals(str2);

        System.out.println("Comparison using charAt(): " + charAtComparison);
        System.out.println("Comparison using equals(): " + builtInEquals);

        if (charAtComparison == builtInEquals) {
            System.out.println("Both methods gave the same result.");
        } else {
            System.out.println("Methods gave different results.");
        }
    }
}
