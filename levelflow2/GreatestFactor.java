import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number <= 1) {
            System.out.println("No proper factor exists.");
            return;
        }

        // Using for loop
        int greatestFactor = 1;
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }
        System.out.println("Greatest factor using for loop (excluding the number itself): " + greatestFactor);

        // quest 10  while loop
        int i = number - 1;
        greatestFactor = 1;
        while (i >= 1) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
            i--;
        }
        System.out.println("Greatest factor using while loop (excluding the number itself): " + greatestFactor);
    }
}
