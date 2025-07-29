import java.util.Scanner;

public class LargestDigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int num = input.nextInt();

        int[] digitList = new int[10];
        int count = 0;

        while (num != 0 && count < 10) {
            int lastDigit = num % 10;
            digitList[count] = lastDigit;
            count++;
            num /= 10;
        }

        int max = -1;
        int secondMax = -1;


        for (int i = 0; i < count; i++) {
            int d = digitList[i];

            if (d > max) {

                secondMax = max;
                max = d;
            } else if (d > secondMax && d != max) {

                secondMax = d;
            }

        }


        System.out.println("The largest digit is: " + max);

        if (secondMax != -1) {
            System.out.println("The second largest digit is: " + secondMax);
        } else {
            System.out.println("No distinct second largest digit found.");
        }
    }
}
