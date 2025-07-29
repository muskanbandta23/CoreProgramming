import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type any number: ");
        int originalNum = input.nextInt();

        int tempNum = originalNum;
        int digitTotal = 0;

        while (tempNum != 0) {
            digitTotal++;
            tempNum = tempNum / 10;
        }

        int[] digitArray = new int[digitTotal];
        int pos = 0;
        tempNum = originalNum;

        while (tempNum != 0) {
            int d = tempNum % 10;
            digitArray[pos] = d;
            pos++;
            tempNum = tempNum / 10;
        }

        int[] countDigits = new int[10];

        for (int j = 0; j < digitTotal; j++) {
            int currentDigit = digitArray[j];
            countDigits[currentDigit]++;
        }

        System.out.println("\nHere's how often each digit shows up in " + originalNum + ":");
        for (int d = 0; d < 10; d++) {
            if (countDigits[d] > 0) {
                System.out.println("Digit " + d + ": " + countDigits[d] + (countDigits[d] == 1 ? " time" : " times"));
            }
        }
    }
}
