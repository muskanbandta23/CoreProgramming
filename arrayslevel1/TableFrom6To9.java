import java.util.Scanner;

public class TableFrom6To9 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scn.nextInt();

        int[] multiplicationResult = new int[4];

        // Store results of number * 6 to * 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }

        // Display results
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }

    }
}
