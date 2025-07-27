import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        //  factors using for loop
        System.out.println("Factors using for loop:");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }


        //  Q 8 factors using while loop
        System.out.println("Factors using while loop:");
        int i = 1;
        while (i <= number) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
