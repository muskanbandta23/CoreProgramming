import java.util.Scanner;
public class ArrayExceptionDemo {
    public static void generateException(String[] names) {
        System.out.println("Accessing element at index 5: " + names[5]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Trying to access element at index 5...");
            System.out.println("Element: " + names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(names);
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
        System.out.println("\n--- Handling Exception ---");
        handleException(names);
    }
}
