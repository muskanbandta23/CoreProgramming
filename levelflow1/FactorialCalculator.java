import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Using while loop
            int i = 1;
            long factorialWhile = 1;
            while (i <= num) {
                factorialWhile *= i;
                i++;
            }
            System.out.println("Factorial using while loop: " + factorialWhile);



            // Using for loop Question 15
            long factorialFor = 1;
            for (int j = 1; j <= num; j++) {
                factorialFor *= j;
            }
            System.out.println("Factorial using for loop: " + factorialFor);

            // Comparison
            if (factorialWhile == factorialFor) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Mismatch in computations.");
            }
        }
    }
}
