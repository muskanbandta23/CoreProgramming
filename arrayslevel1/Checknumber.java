import java.util.Scanner;
public class Checknumber {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=scn.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("Number at index " + i + " is Positive and Even.");
                } else {
                    System.out.println("Number at index " + i + " is Positive and Odd.");
                }
            } else if (num < 0) {
                System.out.println("Number at index " + i + " is Negative.");
            } else {
                System.out.println("Number at index " + i + " is Zero.");
            }
        }

        // Compare first and last elements
        int first = arr[0];
        int last = arr[arr.length - 1];

        System.out.println("\nComparison of first and last elements:");
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than the last element.");
        } else {
            System.out.println("First element is less than the last element.");
        }
    }

}
