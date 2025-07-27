//An abundant number is an integer in which the sum of all the divisors of the number is greater than the number itself. For example,
//Divisor of 12: 1, 2, 3, 4, 6
//Sum of divisor: 1 + 2 + 3 + 4 + 6 = 16 > 12

import java.util.Scanner;

public class Abundantnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is NOT an Abundant Number.");
        }
    }
}
