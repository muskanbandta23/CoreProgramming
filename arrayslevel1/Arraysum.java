import java.util.Scanner;

public class Arraysum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        double[] numbers = new double[10]; // Array of max 10 elements
        double total = 0.0;                // Variable to store sum
        int index = 0;                     // Index for array

        System.out.println("Enter up to 10 positive numbers (enter 0 or negative to stop):");

        // Input loop
        while (true) {
            double input = scn.nextDouble();
            if (input <= 0) {
                break;
            }


            if (index == 10) {
                break;
            }
            numbers[index] = input;
            index++;

            System.out.print("You entered: ");
            for (int i = 0; i < index; i++) {
                System.out.print(numbers[i] + " ");
                total += numbers[i];
            }

            System.out.println("\nTotal sum: " + total);

            scn.close();
        }
    }
}