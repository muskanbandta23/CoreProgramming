import java.util.Scanner;

public class LargestSecondLargestFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = input.nextInt();

        int arraySize = 10;
        int[] digitBucket = new int[arraySize];
        int pos = 0;

        while (userNumber != 0) {
            if (pos == arraySize) {
                arraySize += 10;
                int[] expanded = new int[arraySize];
                for (int j = 0; j < digitBucket.length; j++) {
                    expanded[j] = digitBucket[j];
                }
                digitBucket = expanded;
            }
            digitBucket[pos] = userNumber % 10;
            pos++;
            userNumber = userNumber / 10;
        }

        int max = 0, secondMax = 0;

        for (int k = 0; k < pos; k++) {
            if (digitBucket[k] > max) {
                secondMax = max;
                max = digitBucket[k];
            } else if (digitBucket[k] > secondMax && digitBucket[k] != max) {
                secondMax = digitBucket[k];
            }
        }

        System.out.println("Largest Digit: " + max);
        System.out.println("Second Largest Digit: " + secondMax);
    }
}
