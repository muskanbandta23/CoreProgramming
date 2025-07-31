import java.util.Scanner;

public class NumberAnalyzer {

    public static boolean isPositive(int num) {
        return num >= 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compareNumbers(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\n--- Number Analysis ---");
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num))
                    System.out.println("Even");
                else
                    System.out.println("Odd");
            } else {
                System.out.println(num + " is Negative");
            }
        }

        System.out.println("\n--- Comparison of First and Last Numbers ---");
        int comparison = compareNumbers(numbers[0], numbers[4]);
        if (comparison == 1)
            System.out.println("First number is greater than last number.");
        else if (comparison == 0)
            System.out.println("First number is equal to last number.");
        else
            System.out.println("First number is less than last number.");
    }
}
