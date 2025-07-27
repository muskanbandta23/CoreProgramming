import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year (>=1582): ");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Leap year check only valid for year >= 1582 (Gregorian calendar).");
        } else if (year % 4 != 0) {
            System.out.println(year + " is not a Leap Year.");
        } else if (year % 100 != 0) {
            System.out.println(year + " is a Leap Year.");
        } else if (year % 400 == 0) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }



        // Q 2 . logical and && and or || operators
                if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
                    System.out.println(year + " is a Leap Year.");
                } else if (year < 1582) {
                    System.out.println("Leap year check only valid for year >= 1582 (Gregorian calendar).");
                } else {
                    System.out.println(year + " is not a Leap Year.");
                }
            }
        }
