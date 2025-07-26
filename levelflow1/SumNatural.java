import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n > 0) {
//            int sum = 0;
//            int i = 1;
//            while (i <= n) {
//                sum += i;
//                i++;
//            }
//            int formulaSum = n * (n + 1) / 2;
//            System.out.println("Sum using while loop: " + sum);
//            System.out.println("Sum using formula: " + formulaSum);
//            if (sum == formulaSum) {
//                System.out.println("Both computations are correct.");
//            } else {
//                System.out.println("Mismatch in computations.");
//            }
//        } else {
//            System.out.println("The number " + n + " is not a natural number.");
//        }




        // Rewritten Program using for loop 13 question
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i;
            }
            int formulaSum = n * (n + 1) / 2;
            System.out.println("Sum using for loop: " + sum);
            System.out.println("Sum using formula: " + formulaSum);
            if (sum == formulaSum) {
                System.out.println("Both computations are correct.");
            } else {
                System.out.println("Mismatch in computations.");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}
