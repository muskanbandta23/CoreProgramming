import java.util.Scanner;
public class LengthOfString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String input = scn.nextLine();
        int lenUsingBuiltin = input.length();
        int lenManual = findLength(input);
        System.out.println("Length (built-in method): " + lenUsingBuiltin);
        System.out.println("Length (manual count): " + lenManual);
    }
    public static int findLength(String str){
        int size = 0;
        try {
            while (true) {
                char c = str.charAt(size);
                size++;
            }
        } catch (Exception e) {
            // do nothing
        }
        return size;
    }
}
